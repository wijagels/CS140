package assignment04;

import java.util.Comparator;

public class BunnyComparator implements Comparator<Bunny> {
    @Override
    public int compare(Bunny b1, Bunny b2) {
        if(b1.getWeight() < b2.getWeight()) { return -1; }
        else if(b1.getWeight() > b2.getWeight()) { return 1; }
        else { return b1.getName().compareTo(b2.getName()); }
    }
}
