package assignment04;

public class Person {
    private BunnyFarm bunnyFarm;
    private String name;

    public Person(String name) {
        this.name = name;
        this.bunnyFarm = new BunnyFarm();
    }

    public String getName() {
        return this.name;
    }

    public BunnyFarm getFarm() {
        return this.bunnyFarm;
    }
}
