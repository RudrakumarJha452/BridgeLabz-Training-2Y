import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for fee
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        // Taking user input for discount percentage
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculating discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Displaying the result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}
