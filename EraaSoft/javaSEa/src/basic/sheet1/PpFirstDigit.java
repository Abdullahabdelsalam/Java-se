package basic.sheet1;

import java.util.Scanner;

public class PpFirstDigit {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the Number = " );
        int  numb = inpot.nextInt();
        if(numb > 999 && numb < 10000){
            String x = String.valueOf(numb);
            char y = x.charAt(0);
            int con = Integer.parseInt(String.valueOf(y));
            if(con % 2 == 0){
                System.out.println("EVEN");
            }else{
                System.out.println("ODD");
            }

        }else{
            System.out.println("enter number range (999 < number ≤9999) ");
        }
    }
}
