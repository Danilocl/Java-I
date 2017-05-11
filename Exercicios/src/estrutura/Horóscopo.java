package estrutura;

import java.util.Scanner;

public class Horóscopo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int mes = 0;
		int dia = 0;
		String signo = "";

		System.out.println("Digite seu nome:");
		String nome = in.next();

		System.out.println("Digite sua idade");
		int idade = in.nextInt();

		int ano = 2017 - idade;

		System.out.println("Digite o mês em que você nasceu");
		mes = in.nextInt();

		System.out.println("Digite o dia em que você nasceu");
		dia = in.nextInt();

		if (mes == 4 || mes == 6 || mes == 9 || mes == 10) {
			if (dia > 30) {
				System.out.println("mes inválido");
			}
		} else if (dia > 31) {
			System.out.println("Dia inválido");
		}
		if (mes > 12 || mes < 1) {
			System.out.println("Mês inválido");
		}

		if (mes == 4 && dia >= 21 || mes == 5 && dia <= 20) {
			signo = "touro";
		}
		if (mes == 3 && dia >= 20 || mes == 4 || dia <= 20) {
			signo = "áries";
		}
		if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
			signo = "gêmeos";
		}
		if (mes == 6 && dia >= 21 || mes == 7 && dia <= 21) {
			signo = "Cancêr";
		}
		if (mes == 7 && dia >= 22 || mes == 8 && dia <= 22) {
			signo = "leão";
		}
		if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
			signo = "Virgem";
		}
		if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) {
			signo = "Libra";
		}
		if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
			signo = "Escorpião";
		}
		if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) {
			signo = "Sagitário";
		}
		if (mes == 12 && dia >= 22 || mes == 1 && dia <= 21) {
			signo = "Capricórnio";
		}
		if (mes == 1 && dia >= 21 || mes == 2 && dia <= 19) {
			signo = "Aquário";
		}
		if (mes == 2 && dia >= 20 || mes == 3 && dia <= 20) {
			signo = "Peixes";
		}

		System.out.println("Nome: " + nome + " Ano de nascimento: " + ano + " signo: " + signo);
		in.close();
	}
}
