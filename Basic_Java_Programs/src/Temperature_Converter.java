import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {

        System.out.println("Welcome! This program takes in a temperature as input" +
                " and an input indicating whether we're converting from celsius to fahrenheit." +
                " Or fahrenheit to celsius.\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter \"F\" if we\'re converting from Fahrenheit.\n" +
                "Please enter \"C\" if we\'re converting from Celsius.\n");

        String tempKey = scan.nextLine();

        System.out.println("Please enter the numerical value of the temperature: ");
        double tempValue = scan.nextDouble();

        if (tempKey.equals("F")) {
            double result = (tempValue - 32) / 1.8;
            System.out.println("When converting " + tempValue + " from Fahrenheit to Celsius:\n" +
                    "The result is: " + result + "degrees Fahrenheit.\n");
        } else if (tempKey.equals("C")) {
            double result = (tempValue * 1.8 + 32);
            System.out.println("When converting " + tempValue + " from Celsius to Fahrenheit:\n" +
                    "The result is: " + result + " degrees Celsius.\n");
        } else {
            System.out.println("Not a valid input.\n");
        }

    }
}
