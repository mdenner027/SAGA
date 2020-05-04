package br.edu.ufersa.saga.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufersa.saga.modelo.Atendimento;
import br.edu.ufersa.saga.modelo.Curso;
import br.edu.ufersa.saga.modelo.DemandaAtendimento;
import br.edu.ufersa.saga.modelo.Discente;
import br.edu.ufersa.saga.modelo.TipoAtendimento;
import br.edu.ufersa.saga.repository.AtendimentoRepository;
import br.edu.ufersa.saga.repository.CursoRepository;
import br.edu.ufersa.saga.repository.DemandaAtendimentoRepository;
import br.edu.ufersa.saga.repository.DiscenteRepository;
import br.edu.ufersa.saga.repository.EncaminhamentoRepository;
import br.edu.ufersa.saga.repository.TipoAtendimentoRepository;

@Controller
public class AtendimentoController {

	@Autowired
	private AtendimentoRepository atendimentoRepository;

	@Autowired
	private DiscenteRepository discenteRepository;

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private EncaminhamentoRepository encaminhamentoRepository;

	@Autowired
	private TipoAtendimentoRepository tipoRepository;

	@Autowired
	private DemandaAtendimentoRepository demandaRepository;

	@RequestMapping(value = "registrar-atendimento")
	public String registrarAtendimento(Model model) {
		model.addAttribute("encaminhamentos",
				encaminhamentoRepository.findAByAtivoEncaminhamentoAtendimentoOrderByDescricaoEncaminhamento(1));
		model.addAttribute("cursos", cursoRepository.findByAtivoCursoOrderByNomeCursoAsc(true));
		model.addAttribute("discentes", discenteRepository.findByAtivoDiscenteOrderByNomeDiscente(1));
		model.addAttribute("tipos", tipoRepository.findByAtivoTipoAtendimentoOrderByNomeTipoAtendimento(1));
		model.addAttribute("demandas", demandaRepository.findByAtivoDemandaAtendimentoOrderByNomeDemandaAtendimento(1));

		return "adiciona-atendimento";
	}

	@RequestMapping(value = "atendimentos-registrados")
	public String listaAtendimentos(Model model) {
		model.addAttribute("atendimentos", atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1));
		model.addAttribute("discentes", discenteRepository.findByAtivoDiscenteOrderByNomeDiscente(1));
		return "lista-atendimentos";
	}

	@RequestMapping(value = "adiciona-atendimento", method = RequestMethod.POST)
	public String adicionaAtendimento(Atendimento atendimento, Long codigo) {
		atendimento.setAtivoAtendimento(1);
		atendimento.setDataAtendimento(Calendar.getInstance());
		if (atendimento.getDiscenteAtendimento().getMatriculaDiscente() == 0) {
			atendimento.getDiscenteAtendimento().setCodigoDiscente(codigo);
			;
			atendimentoRepository.save(atendimento);
		} else {
			discenteRepository.save(atendimento.getDiscenteAtendimento());
			atendimentoRepository.save(atendimento);
		}
		return "redirect:atendimentos-registrados";
	}

	@RequestMapping(value = "exibir-atendimento")
	public String exibirAtendimento(Long id, Model model) {
		model.addAttribute("encaminhamentos",
				encaminhamentoRepository.findAByAtivoEncaminhamentoAtendimentoOrderByDescricaoEncaminhamento(1));
		model.addAttribute("demandas", demandaRepository.findByAtivoDemandaAtendimentoOrderByNomeDemandaAtendimento(1));
		model.addAttribute("tipos", tipoRepository.findByAtivoTipoAtendimentoOrderByNomeTipoAtendimento(1));
		model.addAttribute("discentes", discenteRepository.findByAtivoDiscenteOrderByNomeDiscente(1));
		model.addAttribute("cursos", cursoRepository.findByAtivoCursoOrderByNomeCursoAsc(true));
		model.addAttribute("atendimento", atendimentoRepository.findByCodigoAtendimento(id));

		return "altera-atendimento";
	}

	@RequestMapping(value = "alterar-atendimento", method = RequestMethod.POST)
	public String alteraAtendimento(Atendimento atendimento, String dataDoAtendimento) {
		try {
			Date data = new SimpleDateFormat("yyyy-MM-dd").parse(dataDoAtendimento);
			Calendar dataAtendimento = Calendar.getInstance();
			dataAtendimento.setTime(data);
			atendimento.setDataAtendimento(dataAtendimento);
		} catch (java.text.ParseException e) {
			throw new RuntimeException(e);
		}
		atendimento.getDiscenteAtendimento().setAtivoDiscente(1);
		atendimento.setAtivoAtendimento(1);
		discenteRepository.save(atendimento.getDiscenteAtendimento());
		atendimentoRepository.save(atendimento);
		return "redirect:atendimentos-registrados";
	}

	@RequestMapping(value = "atendimentos-por-data", method = RequestMethod.POST)
	public String atendimentoData(String data, Model model) {
		Calendar dataAtendimento = Calendar.getInstance();
		try {
			Date d = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			dataAtendimento.setTime(d);
		} catch (java.text.ParseException e) {
			throw new RuntimeException(e);
		}
		List<Atendimento> atendimentos = atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1);
		for (Iterator<Atendimento> it = atendimentos.iterator(); it.hasNext();) {
			Atendimento atendimento = it.next();
			if (!(comparaDatas(dataAtendimento, atendimento.getDataAtendimento()))) {
				atendimentos.remove(atendimento);
			}
		}
		model.addAttribute("data", dataAtendimento);
		model.addAttribute("atendimentos", atendimentos);
		return "atendimentos-por-data";
	}

	@RequestMapping(value = "atendimentos-por-discente", method = RequestMethod.POST)
	public String atendimentosDiscente(Long matricula, Model model) {
		Discente discente = discenteRepository.findByMatriculaDiscente(matricula);
		model.addAttribute("atendimentos",
				atendimentoRepository.findByDiscenteAtendimentoOrderByDataAtendimento(discente));
		model.addAttribute("discente", discente);
		return "atendimentos-por-discente";
	}

	@RequestMapping(value = "atendimentos-por-curso", method = RequestMethod.POST)
	public String atendimentosCurso(Long codigo, Model model) {
		Curso curso = cursoRepository.findByCodigoCurso(codigo);
		List<Atendimento> atendimentos = atendimentoRepository.findByAtivoAtendimentoOrderByDataAtendimentoDesc(1);
		for (Iterator<Atendimento> it = atendimentos.iterator(); it.hasNext();) {
			Atendimento atendimento = it.next();
			if (atendimento.getDiscenteAtendimento().getCursoDiscente() != curso) {
				atendimentos.remove(atendimento);
			}
		}
		model.addAttribute("atendimentos", atendimentos);
		model.addAttribute("curso", curso);
		return "atendimentos-por-curso";
	}

//
	@RequestMapping(value = "atendimentos-por-tipo", method = RequestMethod.POST)
	public String getAtendimentosPorTipo(Long codigo, Model model) {
		TipoAtendimento tipo = tipoRepository.findByCodigoTipoAtendimento(codigo);
		model.addAttribute("atendimentos",
				atendimentoRepository.findByAtivoAtendimentoAndTipoAtendimentoOrderByDataAtendimentoDesc(1, tipo));
		model.addAttribute("tipo", tipo);
		return "atendimentos-por-tipo";
	}

	
	@RequestMapping(value = "atendimentos-por-demanda", method = RequestMethod.POST)
	public String getAtendimentosPorDemanda(Long codigo, Model model) {
		DemandaAtendimento demanda = demandaRepository.findByCodigoDemandaAtendimento(codigo);
		model.addAttribute("atendimentos", atendimentoRepository.findByAtivoAtendimentoAndDemandaAtendimentoOrderByDataAtendimentoDesc(1, demanda));
		model.addAttribute("demanda", demanda);
		return "atendimentos-por-demanda";
	}
	
	@RequestMapping(value = "excluir-atendimento", method = RequestMethod.POST)
	public String excluirAtendimento(Long id) {
		Atendimento atendimento = atendimentoRepository.findByCodigoAtendimento(id);
		atendimento.setAtivoAtendimento(0);
		atendimentoRepository.save(atendimento);
		return "redirect:atendimentos-registrados";
	}

	private boolean comparaDatas(Calendar data1, Calendar data2) {
		int dia1 = data1.get(Calendar.DAY_OF_MONTH);
		int dia2 = data2.get(Calendar.DAY_OF_MONTH);
		int mes1 = data1.get(Calendar.MONTH);
		int mes2 = data2.get(Calendar.MONTH);
		int ano1 = data1.get(Calendar.YEAR);
		int ano2 = data1.get(Calendar.YEAR);
		if (ano1 == ano2 && mes1 == mes2 && dia1 == dia2) {
			return true;
		} else {
			return false;
		}
	}
}
