import java.util.Scanner;

public class ConvertInt {


    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer less than 255.");
        num = scan.nextInt();

        if (num > 255 || num < 0) {
            System.out.println("Error.");
        }
        getBinary(num);
    }

    private static void getBinary(int num) {
        String s = "";
        for (int j = 0; j < 8; j++) {
            if (num % 2 == 1) {
                s = '1' + s;
            }
            if (num % 2 == 0) {
                s = '0' + s;
            }
            num = num / 2;
            //System.out.println("Binary equivalent is:" + s);
        }
        System.out.println("Binary equivalent is " + s);
    }
}
