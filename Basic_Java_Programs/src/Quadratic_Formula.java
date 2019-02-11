import java.util.Scanner;

public class Quadratic_Formula {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Initiates a scanner object


        System.out.println("Welcome! This program receives three inputs as doubles, and " +
                "gives the results of plugging those values into the quadratic formula!\n" +
                "Only real number results will be given.\n");

        System.out.println("Please enter a non-zero value for a.");
        double a = scan.nextDouble();
        System.out.println("Please enter a non-zero value for b.");
        double b = scan.nextDouble();
        System.out.println("Please enter a non-zero value for c.");
        double c = scan.nextDouble();

        double result_one = -1 * b + Math.sqrt(b * b - 4 * a * c)/ (2 * a);
        double result_two = -1 * b - Math.sqrt(b * b - 4 * a * c)/ (2 * a);

        System.out.println("The first result of the quadratic formula for the values " + a + ", " + b +
                " and " + c + " is " + result_one);

        System.out.println("The second result of the quadratic formula for the values " + a + ", " + b +
                " and " + c + " is " + result_two);
    }
}
