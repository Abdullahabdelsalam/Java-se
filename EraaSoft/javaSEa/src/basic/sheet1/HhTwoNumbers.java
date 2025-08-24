package basic.sheet1;

import java.util.Scanner;

public class HhTwoNumbers {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter First = " );
        int a = inpot.nextInt();

        System.out.print("Enter Second = " );
        int b = inpot.nextInt();

        double x = a/(b*1.0);
        System.out.println("Print floor = " +Math.floor(x));
        System.out.println("Print ceil  = " +Math.ceil(x));
        System.out.println("Print floor = " +Math.round(x));


    }
}
