package garbage_collection;

public class Main {
	/**
	 * Explicando o funcionamento do garbage collection
	 * 
	 * @param args
	 */
	public static void main() {

		// cópia por referência
		Person p1, p2, p3, p4;

		p1 = new Person("Danilo");
		p2 = new Person("Fernando");
		p3 = p2;
		p4 = p3;
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
		System.out.println(p3.getNome());
		p3.setNome("matheus");
		System.out.println(p3.getNome());

	}

	public static void val() {

		int i1 = 1;
		int i2 = 2;
		int i3 = i2;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

	}
}
