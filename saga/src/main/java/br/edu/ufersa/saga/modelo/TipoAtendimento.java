package br.edu.ufersa.saga.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity(name = "Tipos_de_Atendimento")
public class TipoAtendimento implements Serializable, Comparable<TipoAtendimento> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo_tipo_atendimento", nullable = false, insertable = false)
	private Long codigoTipoAtendimento;

	@Column(name = "nome_tipo_atendimento", nullable = false)
	private String nomeTipoAtendimento;

	@Transient
	private int quantidadeRegistrada;

	@OneToMany(mappedBy = "tipoAtendimento", targetEntity = Atendimento.class)
	private List<Atendimento> atendimentosTipo;
	
	@Column(name="ativo_tipo_atendimento", length = 1)
	private int ativoTipoAtendimento;

	@Override
	public int compareTo(TipoAtendimento o) {
		if (this.getQuantidadeRegistrada() > o.getQuantidadeRegistrada()) {
			return -1;
		}
		if (this.getQuantidadeRegistrada() < o.getQuantidadeRegistrada()) {
			return 1;
		}
		return 0;
	}
	
	public Long getCodigoTipoAtendimento() {
		return codigoTipoAtendimento;
	}

	public void setCodigoTipoAtendimento(Long codigoTipoAtendimento) {
		this.codigoTipoAtendimento = codigoTipoAtendimento;
	}

	public String getNomeTipoAtendimento() {
		return nomeTipoAtendimento;
	}

	public void setNomeTipoAtendimento(String nomeTipoAtendimento) {
		this.nomeTipoAtendimento = nomeTipoAtendimento;
	}

	public int getQuantidadeRegistrada() {
		return quantidadeRegistrada;
	}

	public void setQuantidadeRegistrada(int quantidadeRegistrada) {
		this.quantidadeRegistrada = quantidadeRegistrada;
	}

	public List<Atendimento> getAtendimentosTipo() {
		return atendimentosTipo;
	}

	public void setAtendimentosTipo(List<Atendimento> atendimentosTipo) {
		this.atendimentosTipo = atendimentosTipo;
	}

	public int getAtivoTipoAtendimento() {
		return ativoTipoAtendimento;
	}

	public void setAtivoTipoAtendimento(int ativoTipoAtendimento) {
		this.ativoTipoAtendimento = ativoTipoAtendimento;
	}
}
