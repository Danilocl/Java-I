package model;

public class Investimento {

	private double selic;
	private String nomeInvestimento;
	private double taxaInvestimento;

	public Investimento(double selic, String nomeInvestimento, double taxaInvestimento) {
		super();
		this.selic = selic;
		this.nomeInvestimento = nomeInvestimento;
		this.taxaInvestimento = taxaInvestimento;
	}

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

	public String getNomeInvestimento() {
		return nomeInvestimento;
	}

	public void setNomeInvestimento(String nomeInvestimento) {
		this.nomeInvestimento = nomeInvestimento;
	}

	public double getTaxaInvestimento() {
		return taxaInvestimento;
	}

	public void setTaxaInvestimento(double taxaInvestimento) {
		this.taxaInvestimento = taxaInvestimento;
	}

}
