package lab08;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class Tester {
	@Test
	public void testQ1() {
		Count c = new Count(420);
		assertEquals(420, c.getCount());
		for(int i=0;i<917;i++)
			c.add();
		assertEquals(1337, c.getCount());
	}

	@Test
	public void testQ2() {
		int[] arr = new int[6969];
		for(int i=0;i<arr.length;i++)
			arr[i] = (int) (Math.random() * 31337);
		int[] shitSort = Arrays.copyOf(arr, arr.length);
		int[] goodSort = Arrays.copyOf(arr, arr.length);
		Ar.sort(shitSort);
		Arrays.sort(goodSort);
		assertArrayEquals(goodSort, shitSort);
		int[] reverseMe = {1, 2, 3, 8};
		int[] correct = {8,3,2,1};
		Ar.reverse(reverseMe);
		assertArrayEquals(correct, reverseMe);
		int[] wtf = new int[0];
		int[] wtf2 = new int[0];
		Ar.reverse(wtf);
		assertArrayEquals(wtf2, wtf);
	}
}