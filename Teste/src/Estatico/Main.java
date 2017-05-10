package Estatico;

public class Main {

	public static void main(String[] args) {
		Client c1 = new Client("Danilo");
		Client c2 = new Client("Roberto");
		Client c3 = new Client("felipe");
		System.out.println("c1: " + c1.getName());
		System.out.println("c2: " + c2.getName());
		System.out.println();

		if (80 > Client.MIN_SCORE) {
			System.out.println("Você Passou");
		} else {
			System.out.println("Tente Novamente");
		}
	}
}
