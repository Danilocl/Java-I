package poo;

import java.util.Scanner;

public class Test {
//
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Porta porta = new Porta();

		System.out.println("Digite as dimensões: ");
		float dx = in.nextFloat();
		float dy = in.nextFloat();
		float dz = in.nextFloat();

		porta.setDimensionx(dx);
		porta.setDimensiony(dy);
		porta.setDimensionz(dz);

		System.out.println("Digite 1 para abrir e 2 para fechar: ");
		int a = in.nextInt();

		if (a == 1) {
			porta.abre();
		} else if (a == 2) {
			porta.fecha();
		} else {
			System.out.println("Aprenda a ler");
		}
		System.out.println("Digite a cor que deseja pintar");
		String cor = in.next();
		porta.pinta(cor);
		
		porta.estaAberta();

		System.out.println(porta.toString());

	}
}
