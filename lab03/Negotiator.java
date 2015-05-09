package assignment03;

import java.util.ArrayList;

public class Negotiator {
    public void trade(String name, Person from, Person to) {
        Bunny b = from.getFarm().findBunny(name);
        from.getFarm().removeBunny(b);
        to.getFarm().addBunny(b);
    }
}
