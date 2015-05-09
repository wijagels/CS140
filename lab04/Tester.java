package lab04;

import java.util.Collections;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    @Test
    public void comparableTest() {
        Bunny b1 = new Bunny("Joonas", 13);
        Bunny b2 = new Bunny("Ville", 15);
        Bunny b3 = new Bunny("Inka", 13);

        // This should be true
        assertTrue(b1.compareTo(b2) < 0);
        // This should be false
        assertFalse(b2.compareTo(b1) < 0);
        // This should be true
        assertTrue(b2.compareTo(b3) > 0);
        // This should be false
        assertFalse(b2.compareTo(b3) == 0);
        // This should be true (because "Inka" comes before "Joonas" in the dictionary)
        assertTrue(b3.compareTo(b1) < 0);
    }

    @Test
    public void contestTest() {
        Contest c = new Contest();

        ArrayList<Person> al = new ArrayList<Person>();

        Person p1 = new Person("a");
        p1.getFarm().addBunny(new Bunny("s", 0));
        Person p2 = new Person("b");
        p2.getFarm().addBunny(new Bunny("s", 0));
        p2.getFarm().addBunny(new Bunny("daa", 0));
        Person p3 = new Person("c");
        p3.getFarm().addBunny(new Bunny("d", 0));
        p3.getFarm().addBunny(new Bunny("s", 0));
        p3.getFarm().addBunny(new Bunny("a", 0));
        p3.getFarm().addBunny(new Bunny("as", 0));
        p3.getFarm().addBunny(new Bunny("as", 0));

        al.add(p1);
        al.add(p2);
        al.add(p3);
        ArrayList<Person> cp1 = new ArrayList<Person>(al);
        ArrayList<Person> r1 = c.run(cp1);
        assertEquals("c", r1.get(0).getName());
        assertEquals("b", r1.get(1).getName());
        assertEquals("a", r1.get(2).getName());

        p2.getFarm().addBunny(new Bunny("ssssssssssssssssssss", 0));
        ArrayList<Person> cp2 = new ArrayList<Person>(al);
        ArrayList<Person> r2 = c.run(cp2);
        assertEquals("b", r2.get(0).getName());
        assertEquals("c", r2.get(1).getName());
        assertEquals("a", r2.get(2).getName());

        p1.getFarm().addBunny(new Bunny("ssssssssssssssssssssssssssssssssssssssss", 0));
        ArrayList<Person> cp3 = new ArrayList<Person>(al);
        ArrayList<Person> r3 = c.run(cp3);
        assertEquals("a", r3.get(0).getName());
        assertEquals("b", r3.get(1).getName());
        assertEquals("c", r3.get(2).getName());
    }
}
