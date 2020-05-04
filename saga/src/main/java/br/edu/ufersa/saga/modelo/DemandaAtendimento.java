package br.edu.ufersa.saga.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Demandas_de_Atendimento")
public class DemandaAtendimento implements Serializable, Comparable<DemandaAtendimento> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo_demanda_atendimento")
	private Long codigoDemandaAtendimento;

	@Column(name = "nome_demanda_atendimento")
	private String nomeDemandaAtendimento;

	@Transient
	private int quantidadeRegistrada;

	@OneToMany(mappedBy = "demandaAtendimento", targetEntity = Atendimento.class)
	private List<Atendimento> atendimentosDemanda;

	@Column(name = "ativo_demanda_atendimento", length = 1, columnDefinition = "int default 1")
	private int ativoDemandaAtendimento;

	@Override
	public int compareTo(DemandaAtendimento o) {
		if (this.getQuantidadeRegistrada() > o.getQuantidadeRegistrada()) {
			return -1;
		}
		if (this.getQuantidadeRegistrada() < o.getQuantidadeRegistrada()) {
			return 1;
		}
		return 0;
	}

	public Long getCodigoDemandaAtendimento() {
		return codigoDemandaAtendimento;
	}

	public void setCodigoDemandaAtendimento(Long codigoDemandaAtendimento) {
		this.codigoDemandaAtendimento = codigoDemandaAtendimento;
	}

	public String getNomeDemandaAtendimento() {
		return nomeDemandaAtendimento;
	}

	public void setNomeDemandaAtendimento(String nomeDemandaAtendimento) {
		this.nomeDemandaAtendimento = nomeDemandaAtendimento;
	}

	public int getQuantidadeRegistrada() {
		return quantidadeRegistrada;
	}

	public void setQuantidadeRegistrada(int quantidadeRegistrada) {
		this.quantidadeRegistrada = quantidadeRegistrada;
	}

	public List<Atendimento> getAtendimentosDemanda() {
		return atendimentosDemanda;
	}

	public void setAtendimentosDemanda(List<Atendimento> atendimentosDemanda) {
		this.atendimentosDemanda = atendimentosDemanda;
	}

	public int getAtivoDemandaAtendimento() {
		return ativoDemandaAtendimento;
	}

	public void setAtivoDemandaAtendimento(int ativoDemandaAtendimento) {
		this.ativoDemandaAtendimento = ativoDemandaAtendimento;
	}
}
