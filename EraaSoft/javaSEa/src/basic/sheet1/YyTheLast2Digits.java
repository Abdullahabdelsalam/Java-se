package basic.sheet1;

import java.util.Scanner;

public class YyTheLast2Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A = ");
        int a = input.nextInt();
        System.out.print("Enter the number B = ");
        int b = input.nextInt();
        System.out.print("Enter the number C = ");
        int c = input.nextInt();
        System.out.print("Enter the number D = ");
        int d = input.nextInt();

        int mltpNum = a*b*c*d;

        System.out.println("Multiplication Number = " + mltpNum);
        // double num = mltpNum/100.0;
        // System.out.println(num);
        if (mltpNum > 10){
           // String [] numder = (String.valueOf(mltpNum)).split("\\.");

            System.out.println(String.format("%02d", mltpNum));

        }else {
            System.out.println(" Multiplication Number one digit." + mltpNum);
        }
    }
}
