package lab01;

/**
 * This class includes a collection of methods that make your
 * processor work hard
 *
 * @author William Jagels
 */
public class NaivePaymentCalculator {
    /**
     * This method tries to calculate payments by testing values one cent
     * at a time.
     * @param total the initial loan value
     * @param apr the annual percentage rate
     * @param numMonths the desired months to pay the loan off in
     * @return the minimum monthly payment to pay off the loan in the desired
     * number of months
     */
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

    /**
     * This method will calculate the maximum loan possible to
     * be repaid with a set of parameters
     * @param apr the annual percentage rate desired
     * @param numMonths the number of months to pay off the loan
     * @param payment the maximum monthly payment
     * @return the largest possible loan dollar amount
     */
    public static double possibleTotal(double apr, int numMonths, double payment) {
        int months = 0;
        int maxLoan = (int)payment;
        while(months <= numMonths) {
            try {
                HomeLoan h = new HomeLoan(maxLoan, apr, payment);
                months = h.payoffMonths();
                maxLoan++;
            } catch (IllegalArgumentException e) {
                maxLoan++;
            }
        }
        return maxLoan;
    }

}