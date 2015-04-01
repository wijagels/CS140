package assignment09;

import java.util.function.BinaryOperator;

public class Driver<T> {
    public boolean check(Group<T> g, Set<T> s) throws NotInException {
        for(T element : g) {
            for(T element2 : g) {
                if(!s.contains(g.combine(element, element2)))
                    return false;
            }
        }
        return true;
    }

    public boolean check(Group<T> g) throws NotInException {
        return check(g, g);
    }

    public Ring<T> generateRing(BinaryOperator<T> combine, BinaryOperator<T> mult, T start) throws NotInException {
        Ring<T> r = new Ring<T>(combine, mult);
        T element = start;
        for(int i=0;i<30/2;i++) {// Repeat desired divided by times added
            r.add(element);
            System.out.println("add " + element);
        }
        for(T el : r)
            System.out.println(el);
        return r;
    }
}
