package br.edu.ufersa.saga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.saga.modelo.Atendimento;
import br.edu.ufersa.saga.modelo.DemandaAtendimento;
import br.edu.ufersa.saga.modelo.Discente;
import br.edu.ufersa.saga.modelo.TipoAtendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
	List<Atendimento> findByAtivoAtendimentoOrderByDataAtendimentoDesc(int ativo);

	Atendimento findByCodigoAtendimento(Long id);

	List<Atendimento> findByDiscenteAtendimentoOrderByDataAtendimento(Discente discente);

	List<Atendimento> findByAtivoAtendimentoAndTipoAtendimentoOrderByDataAtendimentoDesc(int i, TipoAtendimento tipo);

	List<Atendimento> findByAtivoAtendimentoAndDemandaAtendimentoOrderByDataAtendimentoDesc(int i, DemandaAtendimento demanda);

}
