package static2;

public class C1 {

	private int meuAtributo;

	private int soma(int a, int b) {
		return a + b;

	}

	private static int soma2(int a, int b) {
		// Métodos estático só podem acessar atributos ou métodos estaticos
		// System.out.println(meuAtributo);
		return a + b;

	}

	public static void main(String[] args) {
		new C1().soma(55, 100);
		int c3 = C1.soma2(6, 7);
		System.out.println(c3);
		System.out.println(new C1().soma(5, 7));
	}
}
