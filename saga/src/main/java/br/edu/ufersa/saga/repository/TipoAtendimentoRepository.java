package br.edu.ufersa.saga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.saga.modelo.TipoAtendimento;

public interface TipoAtendimentoRepository extends JpaRepository<TipoAtendimento, Long> {

	List<TipoAtendimento> findByAtivoTipoAtendimentoOrderByNomeTipoAtendimento(int i);
	
	TipoAtendimento findByCodigoTipoAtendimento(Long codigo);
}
