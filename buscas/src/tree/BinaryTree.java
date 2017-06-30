package tree;

/**
 * Árvore de busca binária, menores à esquerda e maiores à direita
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

		// Instância um novo nó
		Node newNode = new Node(data);

		// se a árvore está vazia
		if (root == null) {
			this.root = newNode;

		} else {

			// iniciamos com o foco na raís
			Node focusNode = this.root;

			// Futuro pai do novo nó
			Node parent;

			while (true) {

				parent = focusNode;

				// checa se o novo nó deve ir para a esquerda
				if (data < focusNode.getData()) {

					// Troca o foco para o filho da esquerda
					focusNode = focusNode.getLeftChild();

					if (focusNode == null) {

						parent.setLeftChild(newNode);

						return;
					}
					// se chegamos aqui, adicionamos à direita
				} else if (data > focusNode.getData()) {

					// troca o foco para o filho da direita
					focusNode = focusNode.getRightChild();

					// se não há filho à direita
					if (focusNode == null) {

						// O novo nó será inserido à direita
						parent.setRightChild(newNode);

						// Interrompe o laço
						return;
					}

				} else {

					return;
				}
			}
		}
	}

	// Busca por um nó de acordo com valor informado
	public Node findNode(int data) {

		// inicia no topo da árvore
		Node focusNode = this.root;

		while (focusNode.getData() != data) {

			// se o valor for menor que o nó, buscamos à esquerda
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
			
			//visita recursivamente a sub-árvore da esquerda
			inOrder(focusNode.getLeftChild());
			
			//visita a raiz
			System.out.println(focusNode.getData());
			
			//visita recursivamente a sub-árvore da diretita
			inOrder(focusNode.getRightChild());
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
