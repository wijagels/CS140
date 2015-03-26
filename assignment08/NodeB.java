package assignment08;

public class NodeB extends Node{
    public NodeB(int data) {
        super(data);
    }

    @Override
    public String toString() {
        return "b" + super.toString();
    }

    @Override
    public int compareTo(Node o) {
        return super.compareTo(o) == 0 ? 1 : super.compareTo(o);
    }
}
