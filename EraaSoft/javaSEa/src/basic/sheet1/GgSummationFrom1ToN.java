package basic.sheet1;

import java.util.Scanner;

public class GgSummationFrom1ToN {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter Number = " );
        int num = inpot.nextInt();
        int summation = 0;
        for(int i = 0; i < (num+1); i++ ){
            summation+=i;
        }
        System.out.println("the summation of the numbers that are between 1 and " + num +" = " + summation);
    }
}
