package lab05;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    @Test
    public void exerciseTest() {
        Bunny a = new Bunny("Inka");
        assertEquals("Inka is exercising, fun!", a.exercise());
        Bear b = new Bear("Seppo");
        assertEquals("Seppo is exercising, fun!", b.exercise());
        b.hibernate();
        assertEquals("Seppo is hibernating and can't exercise.", b.exercise());
    }
    
    @Test
    public void friendTest() {
        Animal a = new Bunny("Irma");
        Animal b = new Bunny("Joonas");
        Animal c = new Bear("Seppo");

        assertTrue(a.befriend(b));
        assertTrue(b.befriend(a));
        assertFalse(a.befriend(c));
        assertFalse(c.befriend(a));
        assertFalse(b.befriend(c));
        assertFalse(c.befriend(b));
    }
}
