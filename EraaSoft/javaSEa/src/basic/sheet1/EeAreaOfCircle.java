package basic.sheet1;

import java.util.Scanner;

public class EeAreaOfCircle {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);
        System.out.print("Enter a Number of R = ");
        double r = inpot.nextDouble();
        double area = Math.PI*Math.pow(r,2);
        double e = Math.round(area*1000000000);
        System.out.println("Area of circle = " + e/1000000000);
    }
}
