package enumeravel4;

public class Main {

	public static void main(String[] args) {

		Country c1 = new Country(Planet.TERRA, "Terra");
		Country c2 = new Country(Planet.MARTE, "Marte");
		Country c3 = new Country(Planet.VENUS, "Vênus");

		System.out.println(c1.ToString());
		System.out.println(c2.ToString());
		System.out.println(c3.ToString());
		

	}
}
