package assignment04;

public class Bunny {
    private String name;
    private int weight;

    public Bunny(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getWeight();
    }
}
