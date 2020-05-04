package br.edu.ufersa.saga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufersa.saga.modelo.EncaminhamentoAtendimento;
import br.edu.ufersa.saga.repository.EncaminhamentoRepository;;

@Controller
public class EncaminhamentoAtendimentoController {
	@Autowired
	private EncaminhamentoRepository encaminhamentoRepository;

	@RequestMapping("encaminhamentos-registrados")
	public String encaminhamentosRegistrados(Model model) {

		model.addAttribute("encaminhamentos",
				encaminhamentoRepository.findAByAtivoEncaminhamentoAtendimentoOrderByDescricaoEncaminhamento(1));
		return "lista-encaminhamentos";
	}

	@RequestMapping("cadastrar-encaminhamento")
	public String cadastrarEncaminhamento() {
		return "adiciona-encaminhamento";
	}

	@RequestMapping("adiciona-encaminhamento")
	public String adicionaEncaminhamento(EncaminhamentoAtendimento encaminhamento) {
		encaminhamento.setAtivoEncaminhamentoAtendimento(1);
		encaminhamentoRepository.save(encaminhamento);
		return "redirect:encaminhamentos-registrados";
	}
	
	@RequestMapping("exibir-encaminhamento")
	public String exibirEncaminhamento(Model model, Long codigoEncaminhamento) {
		model.addAttribute("encaminhamento", encaminhamentoRepository.findByCodigoEncaminhamento(codigoEncaminhamento));
		return "altera-encaminhamento";
	}
	
	@RequestMapping(value = "altera-encaminhamento", method = RequestMethod.POST)
	public String alteraEncaminhamento(EncaminhamentoAtendimento encaminhamento) {
		encaminhamento.setAtivoEncaminhamentoAtendimento(1);
		encaminhamentoRepository.save(encaminhamento);
		return "redirect:encaminhamentos-registrados";
	}
	
	@RequestMapping(value = "excluir-encaminhamento", method = RequestMethod.POST)
	public String excluirEncaminhamento(Long codigoEncaminhamentoAtendimento) {
		EncaminhamentoAtendimento encaminhamento = encaminhamentoRepository.findByCodigoEncaminhamento(codigoEncaminhamentoAtendimento);
		encaminhamentoRepository.save(encaminhamento);
		return "redirect:encaminhamentos-registrados";
	}
}
