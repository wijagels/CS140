package assignment05;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal> animals;

    public Farm() {
        this.animals = new ArrayList<Animal>();
    }

    public String chorus() {
    	String s = "";
    	for(int i = 0;i < animals.size();i++) {
    		s += animals.get(i).speak();
            if(i != animals.size() -1)
                s += "\n";
        }
    	return s;
    }

    public void addAnimal(Animal o) {
    	animals.add(o);
    }
}