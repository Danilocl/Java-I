
public class Professor extends Employee {

	private int hoursMonthly;
	private int hoursValue;
	
//	private int salario = hoursMonthly * hoursValue;

	public int getHoursMonthly() {
		return hoursMonthly;
	}

	public void setHoursMonthly(int hoursMonthly) {
		this.hoursMonthly = hoursMonthly;
	}

	public int getHoursValue() {
		return hoursValue;
	}

	public void setHoursValue(int hoursValue) {
		this.hoursValue = hoursValue;
	}
	
	private float getSalary() {
		return this.hoursMonthly * this.hoursValue;

	}
	
	public String toString() {
		return "nome: " + this.getName() + " salário " + this.getSalary();
		
	}

	public Professor(String name, int hoursMonthly, int hoursValue) {
		super(name);
		this.hoursMonthly = hoursMonthly;
		this.hoursValue = hoursValue;
	}

}
