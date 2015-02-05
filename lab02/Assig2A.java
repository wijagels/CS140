package lab02;
import java.util.Random;
import java.util.Arrays;

public class Assig2A {
	public static int simpleLargestArea(Lab02B[] objs) {
		int largest = -1;
		int index = 0;
		for(int i=0;i < objs.length;i++) {
			if(objs[i].area() > largest) {
				largest = objs[i].area();
				index = i;
			}
		}
		return index;
	}

	public static Lab02B simpleTopLeftMost(Lab02B[] objs) {
		Lab02B mostWee = objs[0];
		for(int i=0;i < objs.length;i++) {
			if(objs[i].isMoreWeeThan(mostWee)) {
				mostWee = objs[i];
			}
		}
		return mostWee;
	}

	public static void main(String args[]) {
		Random rand = new Random();
		Lab02B[] ls = new Lab02B[3];
		for(int i=0;i<ls.length;i++) {
			ls[i] = new Lab02B(randomInts(4));
		}
		System.out.println(simpleLargestArea(ls) + "  " + Arrays.toString(ls));
		System.out.println(simpleTopLeftMost(ls));
	}

	private static int[] randomInts(int len) {
		int[] ints = new int[len];
		Random rand = new Random();
		for(int i=0;i<ints.length;i++) {
			ints[i] = rand.nextInt(10);
		}
		return ints;
	}
}