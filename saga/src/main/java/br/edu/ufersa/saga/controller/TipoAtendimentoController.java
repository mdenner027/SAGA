package br.edu.ufersa.saga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufersa.saga.modelo.TipoAtendimento;
import br.edu.ufersa.saga.repository.TipoAtendimentoRepository;

@Controller
public class TipoAtendimentoController {
	@Autowired
	private TipoAtendimentoRepository tipoRepository;

	@RequestMapping(value = "tipos-de-atendimento-registrados")
	public String listaTipos(Model model) {
		model.addAttribute("tipos", tipoRepository.findByAtivoTipoAtendimentoOrderByNomeTipoAtendimento(1));
		return "lista-tipos";
	}

	@RequestMapping(value = "exibir-tipo-de-atendimento", method = RequestMethod.POST)
	public String exbirTipo(Model model, Long codigoTipoAtendimento) {
		model.addAttribute("tipo", tipoRepository.findByCodigoTipoAtendimento(codigoTipoAtendimento));
		return "altera-tipo";
	}

	@RequestMapping(value = "alterar-tipo", method = RequestMethod.POST)
	public String alterarTipo(TipoAtendimento tipo) {
		tipo.setAtivoTipoAtendimento(1);
		tipoRepository.save(tipo);
		return "redirect:tipos-de-atendimento-registrados";
	}

	@RequestMapping(value = "cadastrar-tipo-de-atendimento")
	public String cadastrarTipo() {
		return "adiciona-tipo";
	}

	@RequestMapping(value = "adicionar-tipo", method = RequestMethod.POST)
	public String adicionarTipo(TipoAtendimento tipo) {
		tipo.setAtivoTipoAtendimento(1);
		tipoRepository.save(tipo);
		return "redirect:tipos-de-atendimento-registrados";
	}

	@RequestMapping(value = "excluir-tipo", method = RequestMethod.POST)
	public String excluirTipo(Long codigoTipoAtendimento) {
		TipoAtendimento tipo = tipoRepository.findByCodigoTipoAtendimento(codigoTipoAtendimento);
		tipo.setAtivoTipoAtendimento(0);
		tipoRepository.save(tipo);
		return "redirect:tipos-de-atendimento-registrados";
	}
}
