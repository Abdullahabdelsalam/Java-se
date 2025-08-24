package basic.sheet1;

import java.util.Scanner;

public class BbBasicDataTypes {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Integer Number = ");
        int numInteger = inpot.nextInt();

        System.out.print("Double Number = ");
        double numDouble = inpot.nextDouble();

        System.out.print("Letter Character : ");
        char Letter = inpot.next().charAt(0);

        System.out.print("boolean Character(TRUE OR FALSE) : ");
        boolean Bool  = inpot.nextBoolean();

        System.out.print("Text Character : ");
        String stText = inpot.next();

        System.out.println();

        System.out.println(numInteger);
        System.out.println(numDouble);
        System.out.println(Letter);
        System.out.println(Bool);
        System.out.println(stText);

    }
}
