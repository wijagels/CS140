package lab01;

/**
 * This program tests the monthlyPayment method of HomeLoan
 *
 * @author William Jagels
 */
public class HomeLoanTester {
    public static void main(String[] args) {
        HomeLoan test = new HomeLoan(200000, 5, 1500);
        System.out.println(test.payoffMonths());
        System.out.println(test.monthlyPayment(15));
        System.out.println(NaivePaymentCalculator.payment(200000, 5.0, 12 * 15));
    }
}