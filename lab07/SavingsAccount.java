package lab07;

/**
 An account that earns interest at a fixed rate.
 */
public class SavingsAccount extends BankAccount {

    private double interestRate;
    /**
     * Constructs a bank account with a given interest rate.
     * @param rate the interest rate
     */
    public SavingsAccount(double rate) {
        interestRate = rate;
    }

    /**
     * Constructs a bank account with a given interest rate.
     * @param initialBalance the initial balance
     * @param rate the interest rate
     */
    public SavingsAccount(double initialBalance, double rate) {
        super(initialBalance);
        interestRate = rate;
        System.out.println(getInterestRate());
    }


    /**
     * Gets the interest rate of the savings account.
     * @return the interest rate
     */
    double getInterestRate() {
        return interestRate;
    }

    /**
     * Adds the earned interest to the account balance.
     */
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}