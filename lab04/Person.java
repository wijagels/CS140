package lab04;

public class Person implements Comparable<Person>{
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

    @Override
    public int compareTo(Person other) {
        int sum = 0;
        for(Bunny b : this.bunnyFarm.getBunnies())
            sum += b.getName().length();
        for(Bunny o : other.getFarm().getBunnies())
            sum -= o.getName().length();
        return sum >0 ? 1 : sum <0 ? -1 : 0;
    }
}
