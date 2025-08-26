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

        if (mltpNum > 10){
            double div = mltpNum/100.0;
            String  str = String.valueOf(div);
            if (str.contains(".")){
                String [] part = str.split("\\.");
                int as = Integer.parseInt(part[1]);
                if (as < 10){
                    System.out.println(as*10);
                }else {
                    System.out.println(as);
                }
            }else {
                System.out.println(00);
            }
        }else {
            System.out.println(" Multiplication Number one digit." + mltpNum);
        }
    }
}
