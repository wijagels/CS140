package lab01;

/**
 * This program tries to calculate payments in the stupidest way possible
 *
 * @author William Jagels
 */
public class NaivePaymentCalculator {
    public static double payment(int total, double apr, int numMonths) {
        boolean done = false;
        double payment = 1;
        while (!done) {
            try {
                HomeLoan h = new HomeLoan(total, apr, payment);
                if (h.payoffMonths() <= numMonths)
                    done = true;
                else
                    payment += 0.01;
            } catch (IllegalArgumentException e) {
                payment += 0.01;
            }
        }
        return payment;
    }
}