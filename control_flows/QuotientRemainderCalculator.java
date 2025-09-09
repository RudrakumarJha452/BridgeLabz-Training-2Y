import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Displaying the result
        System.out.println("The Quotient is " + quotient +
                           " and Reminder is " + remainder +
                           " of two number " + number1 + " and " + number2);
    }
}
