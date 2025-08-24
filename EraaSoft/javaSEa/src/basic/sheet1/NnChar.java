package basic.sheet1;

import java.util.Scanner;

public class NnChar {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the Alphabet = " );
        char alphabet  = inpot.nextLine().charAt(0);
        int charNum = (int)alphabet;

        if(charNum > 64  && charNum <91 ) {
            charNum+=32;
            System.out.println("uppercase letter = " + ((char)charNum));
        }else if (charNum >96  && charNum < 123 ) {
            charNum-=32;
            System.out.println("uppercase letter = " + ((char)charNum));
        }else{
            System.out.println("you should enter the letter ");
        }
    }
}
