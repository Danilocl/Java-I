package testeEscopovariavel;

public class main {
	public static void main(String[] args) {
		boolean expression = true;
		int a = 7;
		if (expression) {
			 a = 50;
		} else {
			System.out.println(a);
			int b = 5;
		}
	}
}
