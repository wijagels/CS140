package assignment04;

import java.util.Comparator;
import java.util.ArrayList;

public class Sorter {
	public ArrayList<Bunny> selectionSort(ArrayList<Bunny> tosort, Comparator<Bunny> comparator) {
		ArrayList<Bunny> sorted = new ArrayList<Bunny>();
		while(!tosort.isEmpty()) {
			Bunny mostwee = tosort.get(0);
			for(Bunny b : tosort) {
				if(comparator.compare(mostwee, b) == 1){
					mostwee = b;
					System.out.println(b);
				}
			}
			sorted.add(mostwee);
			tosort.remove(mostwee);
		}
		// sorted.forEach(System.out::println);
		return sorted;
	}
}