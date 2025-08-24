package basic.sheet1;

import java.util.Scanner;

public class RrAgeInDays {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the day age = " );
        int  a = inpot.nextInt();


        System.out.println(((int)(a/365.5)) + " years" );


        System.out.println(((int)((a%365.5)/30.0)) + " Months" );

        System.out.println(((int)((a%30)/2)) + " Days" );

    }
}
