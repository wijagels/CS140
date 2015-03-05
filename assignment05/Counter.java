package assignment05;

import java.util.ArrayList;

public class Counter {
    public static ArrayList<Integer> count(ArrayList<Animal> al) {
        // return an ArrayList<Integer> where the number of
        // instances of specific classes is at the
        // following indexes:
        // 0 - the number of total Animals
        // 1 - the number of objects of type Bunny
        // 2 - the number of objects of type Bear (but not pandas)
        // 3 - the number of objects of type Panda
        // 4 - the number of objects of type Parrot
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i < 5;i++)
            arr.add(new Integer(0));
        for(Animal a : al) {
            if(a instanceof Animal)
                arr.set(0, arr.get(0) + 1);
            if(a instanceof Bunny)
                arr.set(1, arr.get(1) + 1);
            if(a.getClass().equals(Bear.class))
                arr.set(2, arr.get(2) + 1);
            if(a instanceof Panda)
                arr.set(3, arr.get(3) + 1);
            if(a instanceof Parrot)
                arr.set(4, arr.get(4) + 1);
        }
        return arr;
    }
}