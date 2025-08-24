package basic.sheet1;

import java.util.Scanner;

public class FfDigitsSummation {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter First Number = " );
        int a = inpot.nextInt();

        System.out.print("Enter second number = " );
        int b = inpot.nextInt();

        int x = a % 10;
        int y = b % 10 ;

        System.out.println("the summation of their last digits = " + (x+y));

    }
}
