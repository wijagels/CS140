package assignment08;

public class Node implements Comparable<Node> {
    private int data;
    private Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public int compareTo(Node o) {
        System.out.println("Comparing " + this + " and " + o);
        if(this.data == o.getData()) {
            System.out.println("Equal data");
            if(o.toString().contains("b")) {
                System.out.println("O is a NodeB");
                return 1;
            }
            return 0;
        }
        return this.data > o.getData() ? 1 : -1;
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
