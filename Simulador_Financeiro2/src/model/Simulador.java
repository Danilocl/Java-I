package model;

public class Simulador {

	private double valorInicial;
	private double valorMensal;
	private double taxaJuros;
	private int periodo;

	public Simulador(double valorInicial, double valorMensal, double taxaJuros, int periodo) {
		super();
		this.valorInicial = valorInicial;
		this.valorMensal = valorMensal;
		this.taxaJuros = taxaJuros;
		this.periodo = periodo;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public void calcula(Simulador sm){
		
		
	}

}
