package tree;

public class Node {

	private int data;
	private Node left;
	private Node right;

	public Node(int content) {
		this.data = content;
	}

	public int getData() {
		return data;
	}

	public void setData(int content) {
		this.data = content;
	}

	public Node getLeftChild() {
		return left;
	}

	public void setLeftChild(Node left) {
		this.left = left;
	}

	public Node getRightChild() {
		return right;
	}

	public void setRightChild(Node right) {
		this.right = right;
	}

}
