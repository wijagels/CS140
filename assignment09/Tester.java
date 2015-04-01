package assignment09;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    @Test
    public void testSet() {
        Set<Integer> s = new Set();
        s.add(3);
        s.add(4);
        assertTrue(s.contains(3));
        assertTrue(s.contains(4));
        assertFalse(s.contains(5));
    }

    @Test
    public void testGroup() throws NotInException {
        Group<Integer> g = new Group<Integer>((a, b) -> a + b);
        g.add(3);
        g.add(4);
        assertTrue(g.contains(3));
        assertTrue(g.contains(4));
        assertFalse(g.contains(5));
        assertEquals(7, (int)g.combine(3, 4));
    }

    @Test(expected=NotInException.class)
    public void nitest() throws NotInException {
        Group<Integer> g = new Group<Integer>((a, b) -> a + b);
        g.combine(1, 2);
    }

    @Test(expected=NotInException.class)
    public void ritest() throws NotInException {
        Ring<Integer> r = new Ring<Integer>((a, b) -> a + b, (a, b) -> a * b);
        r.combine(1, 2);
    }

    @Test
    public void testRing() throws NotInException {
        Ring<Integer> r = new Ring<Integer>((a, b) -> a + b, (a, b) -> a * b);
        r.add(1);
        r.add(2);
        assertEquals(3, (int)r.combine(1, 2));
        assertEquals(2, (int)r.combine2(1, 2));
    }

    @Test
    public void testCheck() throws NotInException {
        Driver<Integer> d = new Driver<Integer>();
        Group<Integer> g = new Group<Integer>((a, b) -> a + b);
        g.add(1);
        g.add(2);
        Set<Integer> s = new Set<Integer>();
        s.add(1);
        s.add(2);
        assertFalse(d.check(g, s));
        s.add(3);
        assertFalse(d.check(g, s));
        s.add(4);
        assertTrue(d.check(g, s));
    }

    @Test
    public void testCheck2() throws NotInException {
        Driver<Integer> d = new Driver<Integer>();
        Group<Integer> g = new Group<Integer>((a, b) -> a + b);
        g.add(0);
        assertTrue(d.check(g));
        g.add(1);
        assertFalse(d.check(g));
    }

    @Test(expected=NotInException.class)
    public void testGenerateRingFails() throws NotInException {
        Driver<Integer> d = new Driver<Integer>();
        Ring<Integer> r = d.generateRing((a, b) -> a + b, (a, b) -> a * b, 1);
        assertEquals(20, (int)r.combine(10, 10));
    }

    @Test
    public void testGenerateRing() throws NotInException {
        Driver<Integer> d = new Driver<Integer>();
        Ring<Integer> r = d.generateRing((a, b) -> a + b, (a, b) -> a * b, 1);
        assertEquals(3, (int)r.combine(1, 2));
        assertEquals(2, (int)r.combine2(1, 2));
        assertTrue(r.contains(1));
        assertTrue(r.contains(2));
        assertTrue(r.contains(4));
        assertTrue(r.contains(8));
        assertTrue(r.contains(12));
        assertTrue(r.contains(96));
        assertTrue(r.contains(108));
        assertTrue(r.contains(10368));
        assertTrue(r.contains(10476));
        assertTrue(r.contains(108615168));
        assertTrue(r.contains(108625644));
        assertTrue(r.contains(1445939200));
        assertTrue(r.contains(1554564844));
        assertTrue(r.contains(1162240000));
        assertTrue(r.contains(-1578162452));
        assertTrue(r.contains(-283082752));
        assertTrue(r.contains(-1861245204));
        assertTrue(r.contains(83230720));
        assertTrue(r.contains(-1778014484));
        assertTrue(r.contains(382205952));
        assertTrue(r.contains(-1395808532));
        assertTrue(r.contains(-1335885824));
        assertTrue(r.contains(1563272940));
        assertTrue(r.contains(-662700032));
        assertTrue(r.contains(900572908));
        assertTrue(r.contains(-1778384896));
        assertTrue(r.contains(-877811988));
        assertTrue(r.contains(1207959552));
        assertTrue(r.contains(330147564));
        assertTrue(r.contains(1610612736));
    }

}
