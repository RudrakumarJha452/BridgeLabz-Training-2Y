import java.util.*;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        double height = sc.nextDouble();
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume is: " + volume);
    }
}

