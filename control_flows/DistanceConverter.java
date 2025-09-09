import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion factors
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;

        // Displaying the result
        System.out.println("The distance in feet is " + distanceInFeet +
                           ", which is " + yards + " yards and " +
                           miles + " miles.");
    }
}