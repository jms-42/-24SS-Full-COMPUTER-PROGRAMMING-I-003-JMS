public class Main {
    public static void main(String[] args) {
        double doublePurchasePrice=120.0;

        double doubleSalesTax = (doublePurchasePrice * 5)/100;

        double doubleTotalPrice=doubleSalesTax+doublePurchasePrice;

        System.out.println("Original Price: $" + doublePurchasePrice);
        System.out.println("Sales Tax (5%): $" + doubleSalesTax);
        System.out.println("Total Price : $" + doubleTotalPrice);

    }
}
