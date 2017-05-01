package lista;

public class ListaEncadeada {

	private Node primeiro;
	private Node ultimo;
	private int countSize;
	private Node head;

	// adciona no final
	public void add(Produto conteudo) {
		if (this.countSize == 0) {
			this.addInicio(conteudo);
		} else {
			Node newNo = new Node(conteudo, this.ultimo);
			this.ultimo.setProximo(newNo);
			this.ultimo = newNo;

			this.countSize++;
		}
	}

	// adiciona em uma posição específica
	public void add(int posicao, Produto conteudo) {

		if (posicao == 0) {
			this.addInicio(conteudo);
		} else if (posicao == this.countSize) {
			this.add(conteudo);
		} else {
			Node anterior = this.getNode(posicao - 1);
			Node novo = new Node(conteudo, anterior.getProximo());
			anterior.setProximo(novo);

			this.countSize++;
		}
	}

	// pega o próximo nó
	public Node getNode(int posicao) {

		Node tempNode = this.primeiro;

		for (int i = 0; i <= posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		return tempNode;
	}

	// adiciona no início
	public void addInicio(Produto conteudo) {
		Node no = new Node(conteudo, this.primeiro);
		this.primeiro = no;
		if (this.countSize == 0) {
			this.ultimo = no;
		}
		countSize++;
	}

	// remove no final
	public void remove(int posicao) {
		Node anterior = this.getNode(countSize - 2);

		anterior.setProximo(null);
		this.ultimo = anterior;

		countSize--;

	}

	/**
	 * remove no inicio
	 * 
	 * @param posicao
	 */
	public void removeinicio(int posicao) {
		Node tempnode = this.primeiro;
		this.primeiro = tempnode.getProximo();
		tempnode.setProximo(null);
		countSize--;
	}

	/**
	 * remove em uma posicao especifica
	 * 
	 * @param posicao
	 */
	public void removePos(int posicao) {
		Node temp = this.getNode(posicao);
		Node anterior = getNode(posicao - 1);
		anterior.setProximo(temp.getProximo());
		temp.setProximo(null);
		countSize--;
	}

	public void trocar(int posicaoatual, int posicaofinal) {
		Node temp = new Node(null, ultimo);
		Node posi = getNode(posicaoatual);
		Node anterior = getNode(posicaoatual - 1);
		
		temp.setProximo(posi.getProximo());
        	
	}

	public int tamanho() {
		return this.countSize;
	}

	public String toString() {
		String string = "";
		Node newno = this.primeiro;
		for (int i = 0; i < countSize; i++) {
			string += "[ " + newno.getConteudo().getNome() + " ]";
			newno = newno.getProximo();
		}
		return string;
	}
}
