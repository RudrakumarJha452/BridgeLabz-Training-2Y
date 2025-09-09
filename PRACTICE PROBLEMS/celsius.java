public class celsius {
    public static void main(String[] args) {
        scanner sc = new Scanner( System.in);
        System.out.println( "enter temperature in celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("temp in fahrenheit is :"+ fahrenheit);
    }
}
