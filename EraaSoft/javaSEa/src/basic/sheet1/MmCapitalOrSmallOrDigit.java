package basic.sheet1;

import java.util.Scanner;

public class MmCapitalOrSmallOrDigit {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the Alphabet = " );
        char alphabet  = inpot.nextLine().charAt(0);
        int charNum = (int)alphabet;

        if(charNum > 47 && charNum < 58){
            System.out.println("Digits ");
        } else if (charNum > 64 && charNum < 91) {
            System.out.println("Capital letters");
        } else if (charNum > 96 && charNum < 123) {
            System.out.println("Small letters");
        }
    }
}
