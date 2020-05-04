package br.edu.ufersa.saga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufersa.saga.modelo.DemandaAtendimento;
import br.edu.ufersa.saga.repository.DemandaAtendimentoRepository;

@Controller
public class DemandaAtendimentoController {
	@Autowired
	private DemandaAtendimentoRepository demandaRepository;

	@RequestMapping(value = "demandas-de-atendimento-registradas")
	public String listaDemandas(Model model) {
		model.addAttribute("demandas", demandaRepository.findByAtivoDemandaAtendimentoOrderByNomeDemandaAtendimento(1));
		return "lista-demandas";
	}

	@RequestMapping(value = "registrar-demanda")
	public String registroDemanda() {
		return "adiciona-demanda";
	}

	@RequestMapping(value = "adiciona-demanda", method = RequestMethod.POST)
	public String adicionaDemanda(DemandaAtendimento demanda) {
		demanda.setAtivoDemandaAtendimento(1);
		demandaRepository.save(demanda);
		return "redirect:demandas-de-atendimento-registradas";
	}

	@RequestMapping(value = "exibir-demanda-de-atendimento", method = RequestMethod.POST)
	public String exbirDemanda(Model model, Long codigoDemandaAtendimento) {
		model.addAttribute("demanda", demandaRepository.findByCodigoDemandaAtendimento(codigoDemandaAtendimento));
		return "altera-demanda";
	}
	
	@RequestMapping(value = "alterar-demanda", method = RequestMethod.POST)
	public String alterarDemanda(DemandaAtendimento demanda) {
		demanda.setAtivoDemandaAtendimento(1);
		demandaRepository.save(demanda);
		return "redirect:demandas-de-atendimento-registradas";
	}
	
	@RequestMapping(value = "excluir-demanda", method = RequestMethod.POST)
	public String deletarDemanda(Long codigoDemandaAtendimento) {
		DemandaAtendimento demanda = demandaRepository.findByCodigoDemandaAtendimento(codigoDemandaAtendimento);
		demanda.setAtivoDemandaAtendimento(0);
		demandaRepository.save(demanda);
		return "redirect:demandas-de-atendimento-registradas";
	}
}
