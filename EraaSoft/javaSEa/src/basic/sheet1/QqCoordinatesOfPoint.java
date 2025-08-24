package basic.sheet1;

import java.util.Scanner;

public class QqCoordinatesOfPoint {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the X Axis Number = " );
        int  a = inpot.nextInt();

        System.out.print("Enter the Y Axis Number = " );
        int  b = inpot.nextInt();

        if (a == 0 && b == 0  ){
            System.out.println("center");
        } else if(a >= 0 && b >= 0  ){
            System.out.println("Q1");
        } else if (a <= 0 && b >= 0  ){
            System.out.println("Q2");
        } else if (a <= 0 && b <= 0  ){
            System.out.println("Q3");
        }else{
            System.out.println("Q4");
        }
        }
}
