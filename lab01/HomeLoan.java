package lab01;

/**
 * A class to provide some information concerning home loans.
 *
 * @author William Jagels
 */
public class HomeLoan {

    private int initialPrice;
    private double mim, monthlyPayment;

    /**
     * Constructs a HomeLoan object from an initial price, an annual
     * percentage rate and a monthly payment
     *
     * @param initialPrice   the price of the home
     * @param apr            the annual percentage rate
     * @param monthlyPayment the monthly payment
     * @throws IllegalArgumentException if the monthly payment is lower than
     *                                  the monthly interest on the price of the home
     */
    public HomeLoan(int initialPrice, double apr, double monthlyPayment) {
        this.initialPrice = initialPrice;
        this.monthlyPayment = monthlyPayment;
        this.mim = apr / 1200;
        if (this.initialPrice * mim > monthlyPayment) {
            throw new IllegalArgumentException("Payments are too small");
        }
    }

    /**
     * Computes the number of monthly payments needed to pay off the loan
     * using the payments and interest rate specified in the constructor
     *
     * @return the number of months needed to pay off the home loan
     */
    public int payoffMonths() {
        double remainingLoan = this.initialPrice;
        int count = 0;
        while (remainingLoan > 0) {
            remainingLoan += remainingLoan * this.mim;
            remainingLoan -= monthlyPayment;
            count++;
        }
        return count;
    }

    /**
     * Computes x^n where n is a positive, non-zero integer
     *
     * @param x the base value
     * @param n the exponent value
     */
    private static double power(double x, int n) {
        double result = 1;
        if(n < 0) {
            return 1 / power(x,-n);
        }
        else {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
            return result;
        }
    }

    /**
     * Computes the the correct monthly payment to pay off the loan in the given number of years
     *
     * @param numYears the number of years
     * @return the monthly payment
     */
    public double monthlyPayment(int numYears) {
        return initialPrice * power(1 + mim, 12 * numYears) * mim / (power(1 + mim, 12 * numYears) - 1);
    }


}