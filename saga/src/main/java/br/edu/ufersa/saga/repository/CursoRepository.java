package br.edu.ufersa.saga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.saga.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByCodigoCurso(Long codigoCurso);

	List<Curso> findByAtivoCursoOrderByNomeCursoAsc(boolean condicao);

}
