package assignment08;

public class Node implements Comparable<Node> {
	private int data;
	private Node left, right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public int compareTo(Node o) {
		return this.data == o.getData() ? 0 : this.data > o.getData() ? 1 : -1;
	}

	public int getData() {
		return this.data;
	}

	public Node getLeft() {
		return this.left;
	}

	public Node getRight() {
		return this.right;
	}

	public void setLeft(Node node) {
		this.left = node;
	}

	public void setRight(Node node) {
		this.right = node;
	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}
}