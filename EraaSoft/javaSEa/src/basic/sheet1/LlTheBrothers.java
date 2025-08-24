package basic.sheet1;

import java.util.Scanner;

public class LlTheBrothers {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.println("Enter First Person." );
        System.out.print("Enter the first name = " );
        String firstNameF = inpot.nextLine();
        System.out.print("Enter the second name = " );
        String secondNameF = inpot.nextLine();

        System.out.println("Enter Second Person." );
        System.out.print("Enter the first name = " );
        String firstNameS = inpot.nextLine();
        System.out.print("Enter the second name = " );
        String secondNameS = inpot.nextLine();

        if (secondNameF.equalsIgnoreCase(secondNameS)){
            System.out.println("ARE Brothers");
        }else{
            System.out.println("NOT");
        }


    }
}
