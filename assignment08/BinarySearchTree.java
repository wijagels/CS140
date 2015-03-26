package assignment08;

public class BinarySearchTree {
	private Node root;
	private String str;

	public BinarySearchTree() {
		this.root = null;
	}

	public BinarySearchTree(Node root) {
		this.root = root;
	}

	public void insert(Node node) {
		insert(node, this.root);
	}

	private void insert(Node node, Node current) {
		if(current == null)
			current = node;
		if(node.compareTo(current) == -1) {
			if(current.getLeft() == null)
				current.setLeft(node);
			else
				insert(node, current.getLeft());
		}
		if(node.compareTo(current) >= 0) {
			if(current.getRight() == null)
				current.setRight(node);
			else
				insert(node, current.getLeft());
		}
	}

	@Override
	public String toString() {
		str = "";
		if(root != null) {
			traverse(root);
		}
		System.out.println(str);
		return str;
	}

	private void traverse(Node node) {
		if(node.getLeft() != null)
			traverse(node.getLeft());
		this.str += ", " + node;
		System.out.println(node);
		if(node.getRight() != null)
			traverse(node.getLeft());
	}
}
