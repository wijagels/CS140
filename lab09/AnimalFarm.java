package lab09;

import java.util.ArrayList;

public class AnimalFarm {
    private ArrayList<Animal> animals;

    public AnimalFarm() {
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal a) {
        this.animals.add(a);
    }

    public Animal lookup(String name) {
        for(Animal a : this.animals) {
            if(a.getName().equals(name))
                return a;
        }
        return null;
    }
}
