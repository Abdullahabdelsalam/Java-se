package basic.sheet1;

import java.util.Scanner;

public class JjMultiples {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter First = " );
        double a = inpot.nextDouble();

        System.out.print("Enter Second = " );
        double b = inpot.nextDouble();
        double x = a;
        double y = b;
        if(a%b == 0 || b%a == 0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }
    }
}
