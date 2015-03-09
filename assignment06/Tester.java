package assignment06;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    @Test
    public void gameTest() {
        Bunny b = new Bunny();
        Bear p = new Bear();
        b.attack(p);
        assertEquals(20, b.getHP());
        assertEquals(27, p.getHP());

        assertEquals(p, Arena.battle(p, b));

        b = new Bunny();
        Plant pl = new Plant();

        assertEquals(8, pl.getHP());
        b.attack(pl);
        assertEquals(2, pl.getHP());

        b = new Bunny();
        pl = new Plant();
        assertEquals(b, Arena.battle(b, pl));
        b = new Bunny();
        pl = new Plant();
        assertEquals(b, Arena.battle(pl, b));
        b = new Bunny();
        Bunny b2 = new Bunny();
        assertEquals(b, Arena.battle(b, b2));
        b = new Bunny();
        b2 = new Bunny();
        assertEquals(b2, Arena.battle(b2, b));
        b = new Bunny();
        b2 = new Bunny();
        b.attack(b2);
        b.attack(b2);
        b.attack(b2);
        b.attack(b2);
        b.attack(b2);
        b.attack(b2);
        assertEquals(b, Arena.battle(b2, b));
        b = new Bunny();
        b2 = new Bunny();
        b.attack(b2);
        b.attack(b2);
        b.attack(b2);
        b.attack(b2);
        b.attack(b2);
        b.attack(b2);
        assertEquals(b, Arena.battle(b, b2));
    }
}