package lab04;

public class Bunny implements Comparable<Bunny> {
    private String name;
    private int weight;

    public Bunny(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public int compareTo(Bunny other) {
        return this.weight > other.getWeight() ? 1 : this.weight < other.getWeight() ? -1 :  this.getName().compareTo(other.getName());//THERE CAN BE ONLY ONE! (line of code)
    }

}
