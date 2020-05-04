package br.edu.ufersa.saga.modelo;

import java.util.List;

public class Metricas {
	private int qtdAtendimentosMes;
	private int qtdAtendimentosAno;
	private int qtdAtendimentosTotal;
	private int qtdAlunosMes;
	private int qtdAlunosAno;
	private int qtdAlunosTotal;
	private List<DemandaAtendimento> demandaRecorrente;
	private List<TipoAtendimento> tipoRecorrente;
	private List<EncaminhamentoAtendimento> encaminhamentoAtendimentosRecentes;

	public int getQtdAtendimentosMes() {
		return qtdAtendimentosMes;
	}

	public void setQtdAtendimentosMes(int qtdAtendimentosMes) {
		this.qtdAtendimentosMes = qtdAtendimentosMes;
	}

	public int getQtdAtendimentosAno() {
		return qtdAtendimentosAno;
	}

	public void setQtdAtendimentosAno(int qtdAtendimentosAno) {
		this.qtdAtendimentosAno = qtdAtendimentosAno;
	}

	public int getQtdAtendimentosTotal() {
		return qtdAtendimentosTotal;
	}

	public void setQtdAtendimentosTotal(int qtdAtendimentosTotal) {
		this.qtdAtendimentosTotal = qtdAtendimentosTotal;
	}

	public int getQtdAlunosMes() {
		return qtdAlunosMes;
	}

	public void setQtdAlunosMes(int qtdAlunosMes) {
		this.qtdAlunosMes = qtdAlunosMes;
	}

	public int getQtdAlunosAno() {
		return qtdAlunosAno;
	}

	public void setQtdAlunosAno(int qtdAlunosAno) {
		this.qtdAlunosAno = qtdAlunosAno;
	}

	public int getQtdAlunosTotal() {
		return qtdAlunosTotal;
	}

	public void setQtdAlunosTotal(int qtdAlunosTotal) {
		this.qtdAlunosTotal = qtdAlunosTotal;
	}

	public List<DemandaAtendimento> getDemandaRecorrente() {
		return demandaRecorrente;
	}

	public void setDemandaRecorrente(List<DemandaAtendimento> demandaRecorrente) {
		this.demandaRecorrente = demandaRecorrente;
	}

	public List<TipoAtendimento> getTipoRecorrente() {
		return tipoRecorrente;
	}

	public void setTipoRecorrente(List<TipoAtendimento> tipoRecorrente) {
		this.tipoRecorrente = tipoRecorrente;
	}

	public List<EncaminhamentoAtendimento> getEncaminhamentoAtendimentosRecentes() {
		return encaminhamentoAtendimentosRecentes;
	}

	public void setEncaminhamentoAtendimentosRecentes(
			List<EncaminhamentoAtendimento> encaminhamentoAtendimentosRecentes) {
		this.encaminhamentoAtendimentosRecentes = encaminhamentoAtendimentosRecentes;
	}
}
