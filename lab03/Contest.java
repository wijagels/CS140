package assignment03;

import java.util.ArrayList;

public class Contest {
	
	public Contest() {

	}

	/**
	 * Makes a contest happen, where whoever has the longest combined bunny string wins.
	 * @return Person, the person who won the contest
	 * @param people the list of contest participants
	 */
	public Person run(ArrayList<Person> people) {
		Person winner = people.get(0);
		for(Person a : people) {
			if(winner.getFarm().bunnyNameSum() < a.getFarm().bunnyNameSum())
				winner = a;
		}
		return winner;
	}
}