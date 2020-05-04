package br.edu.ufersa.saga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.saga.modelo.EncaminhamentoAtendimento;

public interface EncaminhamentoRepository extends JpaRepository<EncaminhamentoAtendimento, Long> {
	EncaminhamentoAtendimento findByCodigoEncaminhamento(Long codigoEncaminhamentoAtendimento);

	List<EncaminhamentoAtendimento> findAByAtivoEncaminhamentoAtendimentoOrderByDescricaoEncaminhamento(int ativo);
}
