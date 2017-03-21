package lista;

public class ListaEncadeada {

	private Node primeiro;
	private Node ultimo;
	private int countSize;

	// adciona no final
	public void add(Produto conteudo) {
		if (this.countSize == 0) {
			this.addInicio(conteudo);
		} else {
			Node newNo = new Node(conteudo, null);
			this.ultimo.setProximo(newNo);
			this.ultimo = newNo;

			this.countSize++;
		}
	}

	// adiciona em uma posi��o espec�fica
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

	// pega o pr�ximo n�
	public Node getNode(int posicao) {

		Node tempNode = this.primeiro;

		for (int i = 0; i <= posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		return tempNode;
	}

	// adiciona no in�cio
	public void addInicio(Produto conteudo) {
		Node no = new Node(conteudo, this.primeiro);
		this.primeiro = no;
		this.ultimo = no;
		if (this.countSize == 0) {
			this.ultimo = no;
		}
		countSize++;
	}

	// remove no final
	public void remove(int posicao) {
		Node anterior = this.getNode(posicao - 1);

		Node newno = new Node(null, this.ultimo);

		anterior.setProximo(newno);
		this.ultimo = newno;
		countSize--;

	}

	public void trocar(int posicaoatual, int posicaofinal) {

	}

	public int tamanho() {
		return 0;
	}

	public String toString() {
		return "";
	}
}
