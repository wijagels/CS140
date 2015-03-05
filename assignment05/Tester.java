package assignment05;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class Tester {
    @Test
    public void chorusTest() {
        Farm f = new Farm();
        assertEquals("", f.chorus());
        f.addAnimal(new Bunny("Sven"));
        f.addAnimal(new Bear("Teemu"));
        assertEquals("\nroar", f.chorus());
        f.addAnimal(new Porcupine("Inka"));
        f.addAnimal(new Bear("Seppo"));
        assertEquals("\nroar\nsqueak\nroar", f.chorus());
    }

    @Test
    public void chorus2Test() {
        Farm f = new Farm();
        assertEquals("", f.chorus());
        f.addAnimal(new Bear("Teemu"));
        Bear b = new Panda("Seppo");
        f.addAnimal(b);
        assertEquals("roar\nchompchomp", f.chorus());
        f.addAnimal(new Parrot("Frans", "what"));
        f.addAnimal(new Bunny("Sara"));
        assertEquals("roar\nchompchomp\nwhat\n", f.chorus());
    }

    @Test
    public void countTest() {
        ArrayList<Integer> r;
        ArrayList<Animal> al = new ArrayList<Animal>();
        al.add(new Bunny("Sven"));
        al.add(new Bunny("Irma"));
        al.add(new Parrot("Robyn", "hej"));
        al.add(new Panda("Tommi"));
        al.add(new Panda("Anni"));
        al.add(new Bear("Seppo"));
        r = Counter.count(al);
        assertEquals(6, (long)r.get(0));
        assertEquals(2, (long)r.get(1));
        assertEquals(1, (long)r.get(2));
        assertEquals(2, (long)r.get(3));
        assertEquals(1, (long)r.get(4));
    }
}