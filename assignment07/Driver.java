package assignment07;

import java.util.Arrays;

public class Driver {
	public static int[] getArray(int max) {
		int[] arr = new int[97];
		for(int i=0;i<max;i++) {
			arr[0] += i%2;
			arr[1] += i%2 == 0 ? 1 : 0;
			arr[2] += isPrime(i) ? 1 : 0;
			for(int k=1;k<=20)
				arr[k+2] += divisibility(i, k);
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	private static boolean isPrime(int num) {
		if(num == 2)
			return true;
		if(num < 2)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++)
			if(num % i == 0)
				return false;
		return true;
	}

	private static int divisibility(int num, int mod) {
		if()
	}

}