package lab09;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    @Test
    public void test() {
        String[] names = {"frank", "joe", "susan"};
        int[] ages = {1, 2, 3};
        AnimalFarm af = Driver.go(names, ages);
        Animal a;
        a = af.lookup("frank");
        assertEquals(1, a.getAge());
        a = af.lookup("joe");
        assertEquals(2, a.getAge());
        a = af.lookup("susan");
        assertEquals(3, a.getAge());
    }
}
