
public class secretary extends Employee {

	private int baseSalary;
	private int bonus;
//	private int salario = baseSalary + bonus;

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	private float getSalary() {
		return this.baseSalary + this.bonus;

	}
	
	public String toString() {
		return "nome: " + this.getName() + " salario: " + this.getSalary();
	}
	public secretary(String name, int baseSalary, int bonus) {
		super(name);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

}
