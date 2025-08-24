package basic.sheet1;

import java.util.Scanner;

public class SsInterval {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the day age = " );
        double  a = inpot.nextDouble();

        if(a>=-1000 && a<=1000){
            if (a>=0 && a<=25){
                System.out.println("Interval [0,25]");
            } else if (a>25 && a<=50) {
                System.out.println("Interval (25,50]");
            }else if (a>50 && a<=75) {
                System.out.println("Interval (50,75]");
            }else if (a>75 && a<=100) {
                System.out.println("Interval (75,100]");
            }else{
                System.out.println("Out of Intervals");
            }
        }else {
            System.out.println("outer renge");
        }

    }
}
