package basic.sheet1;

import java.util.Scanner;

public class ZzHardCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A = ");
        double a = input.nextDouble();
        System.out.print("Enter the number B = ");
        double b = input.nextDouble();
        System.out.print("Enter the number C = ");
        double c = input.nextDouble();
        System.out.print("Enter the number D = ");
        double d = input.nextDouble();

        double partOne = Math.pow(a,b);
        double partTwo = Math.pow(c,d);
        if (partOne == partTwo){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
