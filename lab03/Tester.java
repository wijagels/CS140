package lab03;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    @Test
    public void nameTest() {
        Driver d = new Driver();
        ArrayList<Bunny> bunnies = new ArrayList<Bunny>();
        bunnies.add(new Bunny("Sean"));
        assertEquals("Sean", d.longestName(bunnies).getName());
        bunnies.add(new Bunny("John"));
        assertEquals("Sean", d.longestName(bunnies).getName());
        bunnies.add(new Bunny("J"));
        assertEquals("Sean", d.longestName(bunnies).getName());
        bunnies.add(new Bunny("Joonas"));
        assertEquals("Joonas", d.longestName(bunnies).getName());
    }
}