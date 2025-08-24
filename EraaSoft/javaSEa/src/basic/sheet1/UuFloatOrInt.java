package basic.sheet1;

import java.util.Scanner;

public class UuFloatOrInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String N = input.next();

        if (N.contains(".")) {
            String[] parts = N.split("\\.");
            int integerPart = Integer.parseInt(parts[0]);
            String decimalPart = parts[1];

            if (decimalPart.matches("0+")) {
                System.out.println("int " + integerPart);
            } else {
                System.out.println("float " + integerPart + " 0." + decimalPart);
            }
        } else {
            int integerPart = Integer.parseInt(N);
            System.out.println("int " + integerPart);
        }
    }
}
