package assignment07;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
  @Test
  public void test() {
    int[] correct = new int[]{500, 500, 168, 1000, 500, 334, 250, 200, 167, 143, 125, 112, 100, 91, 84, 77, 72, 67, 63, 59, 56, 53, 50, 1000, 500, 500, 334, 333, 333, 250, 250, 250, 250, 200, 200, 200, 200, 200, 167, 167, 167, 167, 166, 166, 143, 143, 143, 143, 143, 143, 142, 125, 125, 125, 125, 125, 125, 125, 125, 112, 111, 111, 111, 111, 111, 111, 111, 111, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 111, 111, 111, 111, 111, 111, 111, 111, 111, 181, 271, 271, 271, 271, 271, 271, 271, 271, 271};
    int[] results = Driver.getArray(1000);

    assertArrayEquals("arrays ==", correct, results);
  }
}