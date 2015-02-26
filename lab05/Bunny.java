package lab05;

public class Bunny extends Animal {
    public Bunny(String name) {
        super(name);
    }

    @Override
    public boolean wantsFriends() {
    	return true;
    }
}
