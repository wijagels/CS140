package assignment05;

import static org.junit.Assert.*;
import org.junit.Test;

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
}