package br.edu.ufersa.saga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufersa.saga.modelo.DemandaAtendimento;

public interface DemandaAtendimentoRepository extends JpaRepository<DemandaAtendimento, Long> {

	List<DemandaAtendimento> findByAtivoDemandaAtendimentoOrderByNomeDemandaAtendimento(int ativo);

	DemandaAtendimento findByCodigoDemandaAtendimento(Long codigoDemandaAtendimento);
}
