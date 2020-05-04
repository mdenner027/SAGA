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
@Table(name = "Encaminhamentos_de_Atendimento")
public class EncaminhamentoAtendimento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo_encaminhamento_atendimento", nullable = false)
	private Long codigoEncaminhamento;

	@Column(name = "descricao_encaminhamento_atendimento", nullable = false)
	private String descricaoEncaminhamento;

	@Transient
	private int quantidadeRegistrada;

	@OneToMany(mappedBy = "encaminhamentoAtendimento", targetEntity = Atendimento.class)
	private List<Atendimento> atendimentosEncaminhamento;

	@Column(name = "ativo_encaminhamento_atendimento", length = 1)
	private int ativoEncaminhamentoAtendimento;

	public Long getCodigoEncaminhamento() {
		return codigoEncaminhamento;
	}

	public void setCodigoEncaminhamento(Long codigoEncaminhamento) {
		this.codigoEncaminhamento = codigoEncaminhamento;
	}

	public String getDescricaoEncaminhamento() {
		return descricaoEncaminhamento;
	}

	public void setDescricaoEncaminhamento(String descricaoEncaminhamento) {
		this.descricaoEncaminhamento = descricaoEncaminhamento;
	}

	public int getQuantidadeRegistrada() {
		return quantidadeRegistrada;
	}

	public void setQuantidadeRegistrada(int quantidadeRegistrada) {
		this.quantidadeRegistrada = quantidadeRegistrada;
	}

	public List<Atendimento> getAtendimentosEncaminhamento() {
		return atendimentosEncaminhamento;
	}

	public void setAtendimentosEncaminhamento(List<Atendimento> atendimentosEncaminhamento) {
		this.atendimentosEncaminhamento = atendimentosEncaminhamento;
	}

	public int getAtivoEncaminhamentoAtendimento() {
		return ativoEncaminhamentoAtendimento;
	}

	public void setAtivoEncaminhamentoAtendimento(int ativoEncaminhamentoAtendimento) {
		this.ativoEncaminhamentoAtendimento = ativoEncaminhamentoAtendimento;
	}
}
