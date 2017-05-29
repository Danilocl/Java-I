package model;

public class Investimento {

	private double selic;
	private String titulo;
	private double taxaInvestimento;

	public Investimento(double selic, String titulo, double taxaInvestimento) {
		super();
		this.selic = selic;
		this.titulo = titulo;
		this.taxaInvestimento = taxaInvestimento;
	}

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getTaxaInvestimento() {
		return taxaInvestimento;
	}

	public void setTaxaInvestimento(double taxaInvestimento) {
		this.taxaInvestimento = taxaInvestimento;
	}

}
