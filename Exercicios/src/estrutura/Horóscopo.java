package estrutura;

import java.util.Scanner;

public class Hor�scopo {

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

		System.out.println("Digite o m�s em que voc� nasceu");
		mes = in.nextInt();

		System.out.println("Digite o dia em que voc� nasceu");
		dia = in.nextInt();

		if (mes == 4 || mes == 6 || mes == 9 || mes == 10) {
			if (dia > 30) {
				System.out.println("mes inv�lido");
			}
		} else if (dia > 31) {
			System.out.println("Dia inv�lido");
		}
		if (mes > 12 || mes < 1) {
			System.out.println("M�s inv�lido");
		}

		if (mes == 4 && dia >= 21 || mes == 5 && dia <= 20) {
			signo = "touro";
		}
		if (mes == 3 && dia >= 20 || mes == 4 || dia <= 20) {
			signo = "�ries";
		}
		if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
			signo = "g�meos";
		}
		if (mes == 6 && dia >= 21 || mes == 7 && dia <= 21) {
			signo = "Canc�r";
		}
		if (mes == 7 && dia >= 22 || mes == 8 && dia <= 22) {
			signo = "le�o";
		}
		if (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) {
			signo = "Virgem";
		}
		if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) {
			signo = "Libra";
		}
		if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
			signo = "Escorpi�o";
		}
		if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) {
			signo = "Sagit�rio";
		}
		if (mes == 12 && dia >= 22 || mes == 1 && dia <= 21) {
			signo = "Capric�rnio";
		}
		if (mes == 1 && dia >= 21 || mes == 2 && dia <= 19) {
			signo = "Aqu�rio";
		}
		if (mes == 2 && dia >= 20 || mes == 3 && dia <= 20) {
			signo = "Peixes";
		}

		System.out.println("Nome: " + nome + " Ano de nascimento: " + ano + " signo: " + signo);
		in.close();
	}
}
