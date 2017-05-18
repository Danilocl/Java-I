package heranca3;
    
public class Notebook extends Computador {
    
	private String batery;
    
	public Notebook(String cpu, String ram, String batery) {
		super(cpu, ram);
		this.batery = batery;
	}
    
	public String getBatery() {
		return batery;
	}
    
	public void setBatery(String batery) {
		this.batery = batery;
	}
    
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return super.getRam();
	}
    
	public String toString() {
		String valores = "";
		Computador cp = new Computador(getBatery(), getRam());
		valores += cp.toString();
		valores += "CPU: " + getBatery() + "\n";
		return valores;
    
	}
    
      
}   
    