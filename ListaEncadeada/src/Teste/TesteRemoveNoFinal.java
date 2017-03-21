package Teste;

import lista.ListaEncadeada;
import lista.Produto;

public class TesteRemoveNoFinal {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();

		p1.setNome("Danilo");
		p2.setNome("Augusto");

		ListaEncadeada lista = new ListaEncadeada();

		lista.addInicio(p1);
		lista.add(p2);

		lista.remove(0);
	}
}
