import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculating side length
        double side = perimeter / 4;

        // Displaying the result
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);
    }
}
