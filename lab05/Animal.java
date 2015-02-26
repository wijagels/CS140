package lab05;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String exercise() {
        String out = this.getName() + " is exercising, fun!";
        return out;
    }

    public boolean befriend(Animal other) {
        return other.wantsFriends() && this.wantsFriends();
    }

    public boolean wantsFriends() {
        return false;
    }
}