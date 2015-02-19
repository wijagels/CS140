package lab04;

import java.util.ArrayList;
import java.util.Collections;

public class Contest {
    public ArrayList<Person> run(ArrayList<Person> people) {
        Collections.sort(people);
	Collections.reverse(people);
	return people;
    }
}
