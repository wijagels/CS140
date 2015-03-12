package assignment07;

import java.util.Arrays;

public class Driver {
	public static int[] getArray(int max) {
		int[] arr = new int[97];
		for(int i=0;i<max;i++) {
			String is = Integer.toString(i);//wow, much optimize
			arr[0] += i%2;
			arr[1] += i%2 == 0 ? 1 : 0;
			arr[2] += isPrime(i) ? 1 : 0;
			for(int k=1;k<=20;k++)
				arr[k+2] += div(i, k);
			for(int p=1;p<=10;p++) {
				arr[22 + (p*(p-1)/2 +1) + i%p]++;
			}
			if(i != 0)
				arr[77 + Character.getNumericValue(is.charAt(0))]++;
			for(int q=0;q<10;q++){
				if(is.contains(Integer.toString(q))){
					arr[87 + q] += 1;
				}
			}
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

	private static int div(int num, int mod) {
		if(num % mod == 0)
			return 1;
		return 0;
	}

}