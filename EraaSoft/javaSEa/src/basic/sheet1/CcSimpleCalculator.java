package basic.sheet1;

import java.util.Scanner;

public class CcSimpleCalculator {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the first Number = ");
        double x = inpot.nextDouble();

        System.out.print("Enter the Second Number = ");
        double y = inpot.nextDouble();

        System.out.println();
        System.out.println("X + Y = " + (x+y));
        System.out.println("X * Y = " + (x*y));
        System.out.println("X - Y = " + (x-y));
    }
}
