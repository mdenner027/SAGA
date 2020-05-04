package br.edu.ufersa.saga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufersa.saga.modelo.Curso;
import br.edu.ufersa.saga.repository.CursoRepository;

@Controller
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;

	@RequestMapping(value = "registrar-curso")
	public String registraCurso() {
		return "adiciona-curso";
	}

	@RequestMapping(value = "adiciona-curso", method = RequestMethod.POST)
	public String adicionaCurso(Curso curso) {
		curso.setAtivoCurso(true);
		cursoRepository.save(curso);
		return "redirect:cursos-registrados";
	}

	@RequestMapping("cursos-registrados")
	public String listaCursos(Model model) {
		model.addAttribute("cursos", cursoRepository.findByAtivoCursoOrderByNomeCursoAsc(true));
		return "lista-cursos";
	}

	@RequestMapping(value = "exibir-curso", method = RequestMethod.POST)
	public String exibirCurso(Model model, Long codigoCurso) {
		model.addAttribute("curso", cursoRepository.findByCodigoCurso(codigoCurso));
		return "altera-curso";
	}

	@RequestMapping(value = "altera-curso", method = RequestMethod.POST)
	public String alteraCurso(Curso curso, Long codAntigo) {
		Curso cursoAntigo = cursoRepository.findByCodigoCurso(codAntigo);
		cursoRepository.delete(cursoAntigo);
		curso.setAtivoCurso(true);
		cursoRepository.save(curso);
		return "redirect:cursos-registrados";
	}

	@RequestMapping(value = "excluir-curso", method = RequestMethod.POST)
	public String alteraCurso(Long codigoCurso) {
		Curso curso = cursoRepository.findByCodigoCurso(codigoCurso);
		curso.setAtivoCurso(false);
		cursoRepository.save(curso);
		return "redirect:cursos-registrados";
	}

}
