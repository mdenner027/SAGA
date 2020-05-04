package br.edu.ufersa.saga.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Discentes")
public class Discente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo_discente", nullable = false, unique = true)
	private Long codigoDiscente;

	@Column(name = "matricula_discente", nullable = false, unique = true)
	private Long matriculaDiscente;

	@Column(name = "nome_discente", nullable = false)
	private String nomeDiscente;

	@Column(name = "rua_discente")
	private String ruaDiscente;

	@Column(name = "bairro_discente")
	private String bairroDiscente;

	@Column(name = "numero_residencia_discente")
	private String numeroResidenciaDiscente;

	@Column(name = "cidade_discente")
	private String cidadeDiscente;

	@Column(name = "telefone_discente")
	private String telefoneDiscente;

	@ManyToOne(optional = false, targetEntity = Curso.class)
	@JoinColumn(name = "curso_codigo_discente")
	private Curso cursoDiscente;

	@Column(name = "ativo_discente", length = 1)
	private int ativoDiscente;
	
	public Long getCodigoDiscente() {
		return codigoDiscente;
	}

	public void setCodigoDiscente(Long codigoDiscente) {
		this.codigoDiscente = codigoDiscente;
	}

	public Long getMatriculaDiscente() {
		return matriculaDiscente;
	}

	public void setMatriculaDiscente(Long matriculaDiscente) {
		this.matriculaDiscente = matriculaDiscente;
	}

	public String getNomeDiscente() {
		return nomeDiscente;
	}

	public void setNomeDiscente(String nomeDiscente) {
		this.nomeDiscente = nomeDiscente;
	}

	public String getRuaDiscente() {
		return ruaDiscente;
	}

	public void setRuaDiscente(String ruaDiscente) {
		this.ruaDiscente = ruaDiscente;
	}

	public String getBairroDiscente() {
		return bairroDiscente;
	}

	public void setBairroDiscente(String bairroDiscente) {
		this.bairroDiscente = bairroDiscente;
	}

	public String getNumeroResidenciaDiscente() {
		return numeroResidenciaDiscente;
	}

	public void setNumeroResidenciaDiscente(String numeroResidenciaDiscente) {
		this.numeroResidenciaDiscente = numeroResidenciaDiscente;
	}

	public String getCidadeDiscente() {
		return cidadeDiscente;
	}

	public void setCidadeDiscente(String cidadeDiscente) {
		this.cidadeDiscente = cidadeDiscente;
	}

	public String getTelefoneDiscente() {
		return telefoneDiscente;
	}

	public void setTelefoneDiscente(String telefoneDiscente) {
		this.telefoneDiscente = telefoneDiscente;
	}

	public Curso getCursoDiscente() {
		return cursoDiscente;
	}

	public void setCursoDiscente(Curso cursoDiscente) {
		this.cursoDiscente = cursoDiscente;
	}

	public int getAtivoDiscente() {
		return ativoDiscente;
	}

	public void setAtivoDiscente(int ativoDiscente) {
		this.ativoDiscente = ativoDiscente;
	}
}
