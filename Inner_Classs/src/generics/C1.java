package generics;

public class C1<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		C1<String> c1 = new C1<String>();
		c1.setT("Danilo Cardoso");
		System.out.println(c1.getT());

		C1<Person> c2 = new C1<Person>();
		Person p = new Person();
		c2.setT(p);
	}

}
