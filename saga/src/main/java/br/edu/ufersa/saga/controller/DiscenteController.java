package br.edu.ufersa.saga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufersa.saga.modelo.Discente;
import br.edu.ufersa.saga.repository.CursoRepository;
import br.edu.ufersa.saga.repository.DiscenteRepository;

@Controller
public class DiscenteController {
	@Autowired
	private DiscenteRepository discenteRepository;

	@Autowired
	private CursoRepository cursoRepository;

	@RequestMapping(value = "discentes-registrados")
	public String listaDiscentes(Model model) {
		model.addAttribute("discentes", discenteRepository.findByAtivoDiscenteOrderByNomeDiscente(1));
		return "lista-discentes";
	}

	@RequestMapping(value = "exibir-discente")
	public String exibirDiscente(Long codigoDiscente, Model model) {
		model.addAttribute("cursos", cursoRepository.findByAtivoCursoOrderByNomeCursoAsc(true));
		model.addAttribute("discente", discenteRepository.findByCodigoDiscente(codigoDiscente));
		return "altera-discente";
	}

	@RequestMapping(value = "altera-discente", method = RequestMethod.POST)
	public String alteraDiscente(Discente discente) {
		discente.setAtivoDiscente(1);
		discenteRepository.save(discente);
		return "redirect:discentes-registrados";
	}

	@RequestMapping(value = "registrar-discente", method = RequestMethod.POST)
	public String registrarDiscente(Model model) {
		model.addAttribute("cursos", cursoRepository.findByAtivoCursoOrderByNomeCursoAsc(true));
		return "adiciona-discente";
	}

	@RequestMapping(value = "adiciona-discente", method = RequestMethod.POST)
	public String adicionaDiscente(Discente discente) {
		discente.setAtivoDiscente(1);
		discenteRepository.save(discente);
		return "redirect:discentes-registrados";
	}

	@RequestMapping(value = "excluir-discente", method = RequestMethod.POST)
	public String removeDiscente(Long matriculaDiscente) {
		Discente discente = discenteRepository.findByMatriculaDiscente(matriculaDiscente);
		discente.setAtivoDiscente(0);
		discenteRepository.save(discente);
		return "redirect:discentes-registrados";
	}
}
