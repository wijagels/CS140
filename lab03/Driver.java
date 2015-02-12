package lab03;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Bunny> bunnies = new ArrayList<Bunny>();
		bunnies.add(new Bunny("Snow"));
		bunnies.add(new Bunny("James"));
		System.out.println(bunnies.get(0).getName());
	}

	public static Bunny longestName(ArrayList<Bunny> bunnies) {
		Bunny el = bunnies.get(0);
		for(Bunny b : bunnies) {
			if(el.getName().length() < b.getName().length())
				el = b;
		}
		return el;
	}
}