package assignment04;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    @Test
    public void testBunnyFarmComparator() {
        BunnyFarm bf1 = new BunnyFarm();
        BunnyFarm bf2 = new BunnyFarm();
        Comparators cs = new Comparators();
        Comparator c = cs.getBunnyFarmComparator();
        bf1.addBunny(new Bunny("a", 0));
        assertTrue(c.compare(bf1, bf2) > 0);
        assertFalse(c.compare(bf2, bf1) > 0);
        bf2.addBunny(new Bunny("b", 0));
        bf2.addBunny(new Bunny("b", 0));
        assertTrue(c.compare(bf2, bf1) > 0);
        bf1.addBunny(new Bunny("a", 0));
        bf1.addBunny(new Bunny("a", 0));
        assertTrue(c.compare(bf1, bf2) > 0);
        bf2.addBunny(new Bunny("b", 0));
        assertTrue(c.compare(bf1, bf2) == 0);
    }

    @Test
    public void testPersonComparator() {
        Person p1 = new Person("Joonas");
        Person p2 = new Person("Inka");
        Person p3 = new Person("Joonas");
        Comparators cs = new Comparators();
        Comparator c = cs.getPersonComparator();
        assertTrue(c.compare(p1, p2) > 0);
        assertTrue(c.compare(p2, p3) < 0);
        assertTrue(c.compare(p1, p3) == 0);
        p3.getFarm().addBunny(new Bunny("a", 0));
        assertTrue(c.compare(p1, p3) < 0);
        p1.getFarm().addBunny(new Bunny("b", 0));
        p1.getFarm().addBunny(new Bunny("b", 0));
        assertTrue(c.compare(p1, p3) > 0);
        assertTrue(c.compare(p1, p2) > 0);
        assertTrue(c.compare(p2, p3) < 0);
    }

    @Test
    public void testPersonComparatorComplex() {
        Person p1 = new Person("Joonas");
        Person p2 = new Person("Inka");
        Person p3 = new Person("Joonas");
        Comparators cs = new Comparators();
        Comparator c = cs.getPersonComparatorComplex();
        assertTrue(c.compare(p1, p2) > 0);
        assertTrue(c.compare(p1, p3) == 0);
        assertTrue(c.compare(p2, p3) < 0);
        p1.getFarm().addBunny(new Bunny("a", 0));
        p3.getFarm().addBunny(new Bunny("b", 0));
        assertTrue(c.compare(p1, p3) == 0);
        assertTrue(c.compare(p1, p2) > 0);
        p1.getFarm().addBunny(new Bunny("a", 0));
        assertTrue(c.compare(p1, p3) > 0);
        p3.getFarm().addBunny(new Bunny("bb", 0));
        assertTrue(c.compare(p1, p3) < 0);
        p3.getFarm().addBunny(new Bunny("b", 0));
        p3.getFarm().addBunny(new Bunny("b", 0));
        p1.getFarm().addBunny(new Bunny("aaaaaaaaaaaaaaaaaaa", 0));
        assertTrue(c.compare(p1, p3) < 0);
        p1.getFarm().addBunny(new Bunny("a", 0));
        assertTrue(c.compare(p1, p3) > 0);
    }

    @Test
    public void testSelectionSort() {
	ArrayList<Bunny> bs = new ArrayList<Bunny>();
	Bunny a = new Bunny("a", 0);
	Bunny b = new Bunny("b", 0);
	Bunny c = new Bunny("c", 0);
	bs.add(c);
	bs.add(b);
	bs.add(a);

	Comparator comp = Comparator.nullsLast(Comparator.comparingInt(Bunny::getWeight).thenComparing(Comparator.comparing(Bunny::getName)));

	Sorter sorter = new Sorter();

	ArrayList<Bunny> cp = new ArrayList<Bunny>(bs);
	ArrayList<Bunny> sorted = sorter.selectionSort(cp, comp);

	assertEquals("a", sorted.get(0).getName());
	assertEquals("b", sorted.get(1).getName());
	assertEquals("c", sorted.get(2).getName());

	bs.add(new Bunny("A", 0));
	cp = new ArrayList<Bunny>(bs);
	sorted = sorter.selectionSort(cp, comp);

	assertEquals("A", sorted.get(0).getName());
	assertEquals("a", sorted.get(1).getName());
	assertEquals("b", sorted.get(2).getName());
	assertEquals("c", sorted.get(3).getName());

	bs.add(new Bunny("B", 1));
	bs.add(new Bunny("A", 2));
	cp = new ArrayList<Bunny>(bs);
	sorted = sorter.selectionSort(cp, comp);

	assertEquals("A", sorted.get(0).getName());
	assertEquals("a", sorted.get(1).getName());
	assertEquals("b", sorted.get(2).getName());
	assertEquals("c", sorted.get(3).getName());
	assertEquals("B", sorted.get(4).getName());
	assertEquals("A", sorted.get(5).getName());
    }
}
