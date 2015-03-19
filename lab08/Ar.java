package lab08;

import java.util.Arrays;

public class Ar {
    /**
     * Sort `array' using bubble sort
     */
    public static void sort(int[] array) {
        /*for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int tmp = array[j];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }*/
        if(array != null) {
            for(int h=array.length;h>=0;h--) {
                for(int i = 0;i < h-1;i++) {
                    if(array[i] > array[i+1]) {
                        int tmp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = tmp;
                    }
                }
            }
        }
    }

    /**
     * Reverse `array'
     */
    public static void reverse(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int k = 0;
        for(int i = array.length-1;i >= 0;i--) {
            array[k] = arr[i];
            k++;
        }
    }
}