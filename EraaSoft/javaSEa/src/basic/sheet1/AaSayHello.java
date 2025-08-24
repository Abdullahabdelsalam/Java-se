package basic.sheet1;

import java.util.Scanner;

public class AaSayHello {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);
        System.out.print("Enter Name :");
        String userName = inpot.nextLine();
        System.out.println("Hello," + userName);
        inpot.close();
    }
}
