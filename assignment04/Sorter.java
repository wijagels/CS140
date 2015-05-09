package assignment04;

import java.util.Comparator;
import java.util.ArrayList;

public class Sorter {
    public ArrayList<Bunny> selectionSort(ArrayList<Bunny> tosort, Comparator<Bunny> comparator) {
        ArrayList<Bunny> sorted = new ArrayList<Bunny>();
        while(!tosort.isEmpty()) {
            Bunny mostwee = tosort.stream().min(comparator).get(); //Might as well be witchcraft
            sorted.add(mostwee);
            tosort.remove(mostwee);
        }
        return sorted;
    }
}
