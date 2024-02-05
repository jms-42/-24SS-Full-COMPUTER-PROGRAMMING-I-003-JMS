public class Main {
    public static void main(String[] args) {

        double doubleSpringCost = 100.00;
        double doubleSummerCost = 200.50;
        double doubleAutumnCost = 350.99;
        double doubleWinterCost = 230.67;
        double doubleYearlyTotal = doubleSpringCost + doubleSummerCost + doubleAutumnCost + doubleWinterCost;

        System.out.println("Maintenance Costs: \nSpring: $" + doubleSpringCost+"\nSummer: $" + doubleSummerCost+"\nAutumn: $" + doubleAutumnCost+"\nWinter: $" + doubleWinterCost);

        System.out.println("\nTotal Yearly Maintenance Costs: $" + doubleYearlyTotal);

    }
}
