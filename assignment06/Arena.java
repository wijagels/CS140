package assignment06;

/**
 * Makes two things attack eachother until one of them is brutally killed
 * @param first the Thing who gets to attack first
 * @param second the Thing who gets to be attacked first
 * @return the Thing that won 
 */
public class Arena {
    public static Thing battle(Thing first, Thing second) {
        first.attack(second);
        second.attack(first);
        if(second.getHP() <= 0)
            return first;
        if(first.getHP() <= 0)
            return second;
        return battle(first, second); // omg recursion, much hard.
    }
}
