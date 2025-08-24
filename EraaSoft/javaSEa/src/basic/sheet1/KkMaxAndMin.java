package basic.sheet1;

import java.util.Scanner;

public class KkMaxAndMin {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter First = " );
        int a = inpot.nextInt();

        System.out.print("Enter Second = " );
        int b = inpot.nextInt();

        System.out.print("Enter third = " );
        int d = inpot.nextInt();

        a = Math.min(a,Math.min(b,d));
        b = Math.max(a,Math.max(b,d));

        System.out.println(" the minimum number = " + a);
        System.out.println(" the maximum number = " + b);


    }
}
