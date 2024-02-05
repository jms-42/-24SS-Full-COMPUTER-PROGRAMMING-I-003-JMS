public class Main {
    public static void main(String[] args) {
        double doubleInitialBalance = 5000.0;

        double doubleMonthlyInterestRate = 17 / 12.0 / 100.0;

        double doubleInterestAfterOneMonth = doubleInitialBalance * doubleMonthlyInterestRate;

        double doubleBalanceAfterOneMonth = doubleInitialBalance + doubleInterestAfterOneMonth;

        double doubleInterestAfterTwoMonths = doubleBalanceAfterOneMonth * doubleMonthlyInterestRate;

        double doubleTotalInterest =doubleInterestAfterOneMonth+doubleInterestAfterTwoMonths;

        System.out.printf("Interest of first month: $ %.2f%n", doubleInterestAfterOneMonth);

        System.out.printf("Interest of second month: $ %.2f%n", doubleInterestAfterTwoMonths);

        System.out.printf("Total Interest due after two months: $ %.2f%n", doubleTotalInterest);
    }
}
