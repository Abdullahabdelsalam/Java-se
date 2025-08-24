package basic.sheet1;

import java.util.Scanner;

public class IiWelcomeForYouWithConditions {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter First = " );
        int a = inpot.nextInt();

        System.out.print("Enter Second = " );
        int b = inpot.nextInt();

        if (a>=b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
