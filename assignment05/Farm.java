package assignment05;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals;

    public Farm() {
        this.animals = new ArrayList<Animal>();
    }

    public String chorus() {
    	String s = "";
    	for(Animal a : animals)
    		s += a.speak() + "\n";
    	return s;
    }

    public void addAnimal(Animal o) {
    	animals.add(o);
    }
}