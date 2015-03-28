package assignment08;

public class NodeB extends Node {
    public NodeB(int data) {
        super(data);
    }

    @Override
    public String toString() {
        return "b" + super.toString();
    }

    @Override
    public int compareTo(Node o) {
        System.out.println("Comparing " + this + " and " + o);
        if(this.getData() == o.getData()) {
            System.out.println("Equal data NodeB");
            if(!o.toString().contains("b")) {
                System.out.println("Returning -1");
                return -1;
            }
            return 0;
        }
        return super.compareTo(o);
    }

}
