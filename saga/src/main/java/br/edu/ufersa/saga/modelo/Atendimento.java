package br.edu.ufersa.saga.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Atendimentos")
public class Atendimento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo_atendimento", nullable = false)
	private Long codigoAtendimento;

	@Column(name = "coletivo_atendimento")
	private boolean coletivoAtendimento;

	@ManyToOne(optional = false, targetEntity = DemandaAtendimento.class)
	@JoinColumn(name = "codigo_demanda_atendimento")
	private DemandaAtendimento demandaAtendimento;

	@ManyToOne(optional = false, targetEntity = TipoAtendimento.class)
	@JoinColumn(name = "codigo_tipo_atendimento")
	private TipoAtendimento tipoAtendimento;

	@ManyToOne(optional = false, targetEntity = Discente.class)
	@JoinColumn(name = "codigo_discente_atendimento")
	private Discente discenteAtendimento;

	@ManyToOne(optional = false, targetEntity = EncaminhamentoAtendimento.class)
	@JoinColumn(name = "codigo_encaminhamento_atendimento")
	private EncaminhamentoAtendimento encaminhamentoAtendimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_atendimento", nullable = false)
	private Calendar dataAtendimento;
	
	@Column(name="ativo_atendimento", length = 1, columnDefinition = "int default 1")
	private int ativoAtendimento;

	public Long getCodigoAtendimento() {
		return codigoAtendimento;
	}

	public void setCodigoAtendimento(Long codigoAtendimento) {
		this.codigoAtendimento = codigoAtendimento;
	}

	public boolean isColetivoAtendimento() {
		return coletivoAtendimento;
	}

	public void setColetivoAtendimento(boolean coletivoAtendimento) {
		this.coletivoAtendimento = coletivoAtendimento;
	}

	public DemandaAtendimento getDemandaAtendimento() {
		return demandaAtendimento;
	}

	public void setDemandaAtendimento(DemandaAtendimento demandaAtendimento) {
		this.demandaAtendimento = demandaAtendimento;
	}

	public TipoAtendimento getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	public Discente getDiscenteAtendimento() {
		return discenteAtendimento;
	}

	public void setDiscenteAtendimento(Discente discenteAtendimento) {
		this.discenteAtendimento = discenteAtendimento;
	}

	public EncaminhamentoAtendimento getEncaminhamentoAtendimento() {
		return encaminhamentoAtendimento;
	}

	public void setEncaminhamentoAtendimento(EncaminhamentoAtendimento encaminhamentoAtendimento) {
		this.encaminhamentoAtendimento = encaminhamentoAtendimento;
	}

	public Calendar getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Calendar dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public int getAtivoAtendimento() {
		return ativoAtendimento;
	}

	public void setAtivoAtendimento(int ativoAtendimento) {
		this.ativoAtendimento = ativoAtendimento;
	}
}
