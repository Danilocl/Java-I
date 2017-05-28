package model;

import java.util.Date;

public class Mercado {

	private String nomeEmpresas;
	private String diaAnterior;
	private String diaPosterior;
	private double taxaAbertura;
	private double taxaAlta;
	private double taxaBaixa;

	public Mercado(String nomeEmpresas, String diaAnterior, String diaPosterior, double taxaAbertura, double taxaAlta,
			double taxaBaixa) {
		super();
		this.nomeEmpresas = nomeEmpresas;
		this.diaAnterior = diaAnterior;
		this.diaPosterior = diaPosterior;
		this.taxaAbertura = taxaAbertura;
		this.taxaAlta = taxaAlta;
		this.taxaBaixa = taxaBaixa;
	}

	public String getNomeEmpresas() {
		return nomeEmpresas;
	}

	public void setNomeEmpresas(String nomeEmpresas) {
		this.nomeEmpresas = nomeEmpresas;
	}

	public String getDiaAnterior() {
		return diaAnterior;
	}

	public void setDiaAnterior(String diaAnterior) {
		this.diaAnterior = diaAnterior;
	}

	public String getDiaPosterior() {
		return diaPosterior;
	}

	public void setDiaPosterior(String diaPosterior) {
		this.diaPosterior = diaPosterior;
	}

	public double getTaxaAbertura() {
		return taxaAbertura;
	}

	public void setTaxaAbertura(double taxaAbertura) {
		this.taxaAbertura = taxaAbertura;
	}

	public double getTaxaAlta() {
		return taxaAlta;
	}

	public void setTaxaAlta(double taxaAlta) {
		this.taxaAlta = taxaAlta;
	}

	public double getTaxaBaixa() {
		return taxaBaixa;
	}

	public void setTaxaBaixa(double taxaBaixa) {
		this.taxaBaixa = taxaBaixa;
	}

}
