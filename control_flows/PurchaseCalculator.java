import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for unit price
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        // Taking user input for quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Displaying the result
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);
    }
}
