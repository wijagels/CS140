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
        int c = 0;
        T el2 = start;
        r.add(el2);++c;
        T el = r.combine(start, start);
        r.add(el);++c;
        while(c < 30) {
            el2 = r.combine2(el2,el);
            if(!r.contains(el2)) {
                System.out.println("Adding " + el2);
                r.add(el2);++c;
            }
            el = r.combine(el, el2);
            if(!r.contains(el) && c < 30) {
                System.out.println("Adding " + el);
                r.add(el);++c;
            }
        }
        int len = 0;
        for(T element : r) {
            len++;
            System.out.println(element);
        }
        System.out.println("Length: " + len);
        return r;
    }
}
