package poo;


public class Porta {
//
	boolean aberta;
	private boolean estaAberta;
	private String cor;
	private float dimensionx;
	private float dimensiony;
	private float dimensionz;

	public boolean getEstaAberta() {
		return estaAberta;
	}
//
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getDimensionx() {
		return dimensionx;
	}

	public void setDimensionx(float dimensionx) {
		this.dimensionx = dimensionx;
	}

	public float getDimensiony() {
		return dimensiony;
	}

	public void setDimensiony(float dimensiony) {
		this.dimensiony = dimensiony;
	}

	public float getDimensionz() {
		return dimensionz;
	}

	public void setDimensionz(float dimensionz) {
		this.dimensionz = dimensionz;
	}

	public void abre() {
		if (aberta == false) {
			aberta = true;
			System.out.println("Abriu");
		}
	}

	public void fecha() {
		if (aberta == true) {
			aberta = false;
			System.out.println("Fechou");
		}
	}

	public void pinta(String cor) {
		this.cor = cor;
		System.out.println("A porta foi pintada de: " + cor);
	}

	public boolean estaAberta() {
		if (aberta == true) {
			System.out.println("A porta está aberta");
			return true;
		} else {
			System.out.println("A porta está fechada");
			return false;
		}
	}

	public String toString() {
		return "As dimensões da porta são: " + " " + this.getDimensionx() + " "  + " " + this.getDimensiony() + " " + " " + " " + this.getDimensionz() + " A cor da porta é: " + this.getCor() + " ";
	}
}
