package Teste;

import lista.ListaEncadeada;
import lista.Produto;

public class TesteRemoveNoFinal {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();

		Produto p1 = new Produto();
		p1.setNome("Danilo");
		Produto p2 = new Produto();
		p2.setNome("Augusto");

		lista.addInicio(p1);
		lista.add(p2);

		System.out.println(lista.toString());

		lista.removeinicio(0);
	}
}
