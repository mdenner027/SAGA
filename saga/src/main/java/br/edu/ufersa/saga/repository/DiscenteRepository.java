package br.edu.ufersa.saga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.saga.modelo.Discente;

public interface DiscenteRepository extends JpaRepository<Discente, Long> {
	List<Discente> findByAtivoDiscenteOrderByNomeDiscente(int ativo);

	Discente findByMatriculaDiscente(Long matriculaDiscente);

	Discente findByCodigoDiscente(Long codigoDiscente);
}
