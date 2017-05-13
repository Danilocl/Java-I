package enumeravel4;

public class Main {

	public static void main(String[] args) {

		Country c1 = new Country(Planet.TERRA, "Brasil");
		Country c2 = new Country(Planet.MARTE, "Eua");
		Country c3 = new Country(Planet.VENUS, "Japão");

		c1.getPlanet().setGravity(555.55f);
		c1.setName("Islândia");
		
		System.out.println(c1.ToString());
		System.out.println(c2.ToString());
		System.out.println(c3.ToString());
		

	}
}
