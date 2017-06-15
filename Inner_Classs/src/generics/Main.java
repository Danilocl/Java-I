package generics;

public class Main {

	public static void main(String[] args) {

		Person p = new Person();
		p.new Address();

		new Person().new Address();
		
		new Person();
		new Address2();

	}
}
