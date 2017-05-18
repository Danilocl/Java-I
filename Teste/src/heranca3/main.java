package heranca3;

public class main {

	public static void main(String[] args) {

		Computador c = new Computador("5mhz","4");
		
		System.out.println(c.toString());
		
		Notebook n = new Notebook("5mhz", "4", "50%");
		
		System.out.println(n.toString());
		
	}
}
