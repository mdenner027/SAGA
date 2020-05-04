package br.edu.ufersa.saga.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cursos")
public class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo_curso", nullable = false)
	private Long codigoCurso;

	@Column(name = "nome_curso", nullable = false)
	private String nomeCurso;

	@OneToMany(mappedBy = "cursoDiscente", targetEntity = Discente.class)
	private List<Discente> discentesCurso;

	@Column(name="ativo_curso", length = 1, columnDefinition = "boolean default true")
	private boolean ativoCurso;

	public Long getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Long codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public List<Discente> getDiscentesCurso() {
		return discentesCurso;
	}

	public void setDiscentesCurso(List<Discente> discentesCurso) {
		this.discentesCurso = discentesCurso;
	}

	public boolean isAtivoCurso() {
		return ativoCurso;
	}

	public void setAtivoCurso(boolean ativoCurso) {
		this.ativoCurso = ativoCurso;
	}
}
