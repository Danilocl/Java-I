package exercicio2;

public class Computador {

	private String cpu;
	private String ram;

	public Computador(String cpu, String ram) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String toString() {
		String valores = "";
		valores += "CPU: " + getCpu() + "\n";
		valores += "RAM: " + getRam() + "\n";
		return valores;

	}

}
