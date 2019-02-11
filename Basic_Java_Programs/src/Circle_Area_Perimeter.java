import java.util.Scanner;

public class Circle_Area_Perimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome! This program gets the radius as a double, and outputs\n" +
                " The area and circumference of a the circle with that radius.\n");

        System.out.println("Please enter a value for the radius of the circle.");
        double radius = scan.nextDouble();


        double area = Math.PI * radius * radius;

        double circumference = Math.PI * radius;

        System.out.println("Given a circle with radius" + radius + ":" +
                "The area of the circle is " + area + "\n" +
                "The circumference of the circle is " + circumference + ".");

    }
}
