package basic;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        // basic.Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y; // ADDITION
        z = x - y; // SUBTRACTION
        z = x * y; // MULTIPLICATION
        z = x / y; // DIVISION
        z = x % y; // MODULUS

        System.out.println(z);

        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }


}


