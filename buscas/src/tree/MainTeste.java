package tree;

public class MainTeste {

	public static void main(String[] args) {
		
		BinaryTree bn = new BinaryTree();
		
		bn.insertNode(15);
		bn.insertNode(22);
		bn.insertNode(17);
		bn.insertNode(10);
		bn.insertNode(20);
		bn.insertNode(16);
		
		bn.inOrder(bn.getRoot());
		
		
	}
}
