package br.edu.ufersa.saga.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ufersa.saga.modelo.Atendimento;
import br.edu.ufersa.saga.modelo.DemandaAtendimento;
import br.edu.ufersa.saga.modelo.Discente;
import br.edu.ufersa.saga.modelo.Metricas;
import br.edu.ufersa.saga.modelo.TipoAtendimento;
import br.edu.ufersa.saga.repository.AtendimentoRepository;
import br.edu.ufersa.saga.repository.DemandaAtendimentoRepository;
import br.edu.ufersa.saga.repository.TipoAtendimentoRepository;

@Controller
public class DashboardController {

	@Autowired
	private AtendimentoRepository atendimentoRepository;

	@Autowired
	private TipoAtendimentoRepository tipoRepository;

	@Autowired
	private DemandaAtendimentoRepository demandaRepository;

	@RequestMapping(value = "dashboard")
	public String dashboard(Model model) {
		Metricas metricas = getMetricas();
		List<TipoAtendimento> tipos = metricas.getTipoRecorrente();
		List<DemandaAtendimento> demandas = metricas.getDemandaRecorrente();
		model.addAttribute("metricas", metricas);
		model.addAttribute("demandas", demandas);
		model.addAttribute("tipos", tipos);
		return "dashboard";
	}

	private Metricas getMetricas() {
		Metricas metricas = new Metricas();
		metricas.setQtdAtendimentosMes(getQtdAtendimentosNoMes());
		metricas.setQtdAtendimentosAno(getQtdAtendimentosNoAno());
		metricas.setQtdAlunosMes(getQtdDiscentesNoMes());
		metricas.setQtdAlunosAno(getQtdDiscentesNoAno());
		metricas.setQtdAlunosTotal(getQtdDiscentesTotal());
		metricas.setQtdAtendimentosTotal(getQtdAtendimentosTotal());
		metricas.setDemandaRecorrente(getTopDemandas());
		metricas.setTipoRecorrente(getTopTipos());
		return metricas;
	}

	private int getQtdAtendimentosNoMes() {
		int mes = Calendar.getInstance().get(Calendar.MONTH);
		int ano = Calendar.getInstance().get(Calendar.YEAR);

		List<Atendimento> atendimentos = atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1);
		for (Iterator<Atendimento> it = atendimentos.iterator(); it.hasNext();) {
			Atendimento a = it.next();
			if (!(mes == a.getDataAtendimento().get(Calendar.MONTH)
					&& ano == a.getDataAtendimento().get(Calendar.YEAR))) {
				atendimentos.remove(a);
			}
		}
		return atendimentos.size();
	}

	private int getQtdAtendimentosNoAno() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);

		List<Atendimento> atendimentos = atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1);
		for (Iterator<Atendimento> it = atendimentos.iterator(); it.hasNext();) {
			Atendimento a = it.next();
			if (!(ano == a.getDataAtendimento().get(Calendar.YEAR))) {
				atendimentos.remove(a);
			}
		}
		return atendimentos.size();
	}

	private int getQtdAtendimentosTotal() {
		List<Atendimento> atendimentos = atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1);
		return atendimentos.size();
	}

	private int getQtdDiscentesNoMes() {
		int mes = Calendar.getInstance().get(Calendar.MONTH);
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		List<Discente> discentes = new ArrayList<Discente>();
		List<Atendimento> atendimentos = atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1);
		for (Iterator<Atendimento> it = atendimentos.iterator(); it.hasNext();) {
			Atendimento a = it.next();
			if ((mes == a.getDataAtendimento().get(Calendar.MONTH)
					&& ano == a.getDataAtendimento().get(Calendar.YEAR))) {
				discentes.add(a.getDiscenteAtendimento());
			}
		}
		LinkedHashSet<Discente> discentesHashSet = new LinkedHashSet<>(discentes);
		return discentesHashSet.size();
	}

	private int getQtdDiscentesNoAno() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		List<Discente> discentes = new ArrayList<Discente>();
		List<Atendimento> atendimentos = atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1);
		for (Iterator<Atendimento> it = atendimentos.iterator(); it.hasNext();) {
			Atendimento a = it.next();
			if (ano == a.getDataAtendimento().get(Calendar.YEAR)) {
				discentes.add(a.getDiscenteAtendimento());
			}
		}
		LinkedHashSet<Discente> discentesHashSet = new LinkedHashSet<>(discentes);
		return discentesHashSet.size();
	}

	private int getQtdDiscentesTotal() {
		List<Discente> discentes = new ArrayList<Discente>();
		List<Atendimento> atendimentos = atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1);
		for (Iterator<Atendimento> it = atendimentos.iterator(); it.hasNext();) {
			Atendimento a = it.next();
			discentes.add(a.getDiscenteAtendimento());
		}
		LinkedHashSet<Discente> discentesHashSet = new LinkedHashSet<>(discentes);
		return discentesHashSet.size();
	}

	private List<DemandaAtendimento> getTopDemandas() {
		List<DemandaAtendimento> demandas = demandaRepository
				.findByAtivoDemandaAtendimentoOrderByNomeDemandaAtendimento(1);
		List<DemandaAtendimento> demandaAtendimentos = new ArrayList<DemandaAtendimento>();
		for (Iterator<DemandaAtendimento> it = demandas.iterator(); it.hasNext();) {
			DemandaAtendimento d = it.next();
			if (d.getAtendimentosDemanda().size() > 0) {
				d.setQuantidadeRegistrada(d.getAtendimentosDemanda().size());
				demandaAtendimentos.add(d);
			}
		}
		Collections.sort(demandaAtendimentos);
		if (demandaAtendimentos.size() < 3) {
			return demandaAtendimentos;
		} else {
			return demandaAtendimentos.subList(0, 3);
		}

	}

	private List<TipoAtendimento> getTopTipos() {
		List<TipoAtendimento> tipos = tipoRepository.findByAtivoTipoAtendimentoOrderByNomeTipoAtendimento(1);
		List<TipoAtendimento> tipoAtendimentos = new ArrayList<TipoAtendimento>();
		for (Iterator<TipoAtendimento> it = tipos.iterator(); it.hasNext();) {
			TipoAtendimento t = it.next();
			if (t.getAtendimentosTipo().size() > 0) {
				t.setQuantidadeRegistrada(t.getAtendimentosTipo().size());
				tipoAtendimentos.add(t);
			}
		}
		Collections.sort(tipoAtendimentos);
		if (tipoAtendimentos.size() < 3) {
			return tipoAtendimentos;
		} else {
			return tipoAtendimentos.subList(0, 3);
		}

	}
}
