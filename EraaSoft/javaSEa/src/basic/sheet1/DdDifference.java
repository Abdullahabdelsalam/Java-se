package basic.sheet1;

import java.util.Scanner;

public class DdDifference {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter A = " );
        int a = inpot.nextInt();

        System.out.print("Enter B = " );
        int b = inpot.nextInt();

        System.out.print("Enter C = " );
        int c = inpot.nextInt();

        System.out.print("Enter D = " );
        int d = inpot.nextInt();

        System.out.println("Difference = " + ((a*b)-(c*d)));

    }
}
