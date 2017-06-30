package tree;

/**
 * �rvore de busca bin�ria, menores � esquerda e maiores � direita
 * 
 * @author ADS.2N
 *
 */
public class BinaryTree {

	private Node root;

	
	public Node getRoot() {
		return this.root;
	}
 	public BinaryTree() {
		this.root = null;
	}

	public void insertNode(int data) {

		// Inst�ncia um novo n�
		Node newNode = new Node(data);

		// se a �rvore est� vazia
		if (root == null) {
			this.root = newNode;

		} else {

			// iniciamos com o foco na ra�s
			Node focusNode = this.root;

			// Futuro pai do novo n�
			Node parent;

			while (true) {

				parent = focusNode;

				// checa se o novo n� deve ir para a esquerda
				if (data < focusNode.getData()) {

					// Troca o foco para o filho da esquerda
					focusNode = focusNode.getLeftChild();

					if (focusNode == null) {

						parent.setLeftChild(newNode);

						return;
					}
					// se chegamos aqui, adicionamos � direita
				} else if (data > focusNode.getData()) {

					// troca o foco para o filho da direita
					focusNode = focusNode.getRightChild();

					// se n�o h� filho � direita
					if (focusNode == null) {

						// O novo n� ser� inserido � direita
						parent.setRightChild(newNode);

						// Interrompe o la�o
						return;
					}

				} else {

					return;
				}
			}
		}
	}

	// Busca por um n� de acordo com valor informado
	public Node findNode(int data) {

		// inicia no topo da �rvore
		Node focusNode = this.root;

		while (focusNode.getData() != data) {

			// se o valor for menor que o n�, buscamos � esquerda
			if (data < focusNode.getData()) {

				// Direciona o foco para o filho da direita
				focusNode = focusNode.getLeftChild();
			} else {
				// Direcionamos o foco do filho para direita
				focusNode = focusNode.getRightChild();
			}

			if (focusNode == null) {
				return null;
			}

		}
		return focusNode;
	}

	// Percurso em ordem
	public void inOrder(Node focusNode) {
		
		if(focusNode != null) {
			
			//visita recursivamente a sub-�rvore da esquerda
			inOrder(focusNode.getLeftChild());
			
			//visita a raiz
			System.out.println(focusNode.getData());
			
			//visita recursivamente a sub-�rvore da diretita
			inOrder(focusNode.getRightChild());
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
