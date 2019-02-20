import java.util.Scanner;

public class salesTax {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello there, what is the price of them item you wish to buy?");
        double a = reader.nextDouble();
        double tax = 0.06 * a;
        double taxTotal = tax + a;
        System.out.println("The total is: " + taxTotal);
    }
}


