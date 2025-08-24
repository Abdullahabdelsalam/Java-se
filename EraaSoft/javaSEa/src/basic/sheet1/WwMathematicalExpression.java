package basic.sheet1;

import java.util.Scanner;

public class WwMathematicalExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A = ");
        int a = input.nextInt();
        System.out.print("Enter the sign  ('+', '-', '*') = ");
        char s = input.next().charAt(0);
        System.out.print("Enter the number B = ");
        int b = input.nextInt();
        System.out.print("Enter the number Result = ");
        int c = input.nextInt();

        System.out.println(a +" "+ s +" "+ b +" = " + c );

        if (s=='+'){
            if((a+b)== c) {
                System.out.println("Yas");
            }else {
                System.out.println(a+b);
            }
        } else if (s == '-') {
            if((a-b)== c) {
                System.out.println("Yas");
            }else {
                System.out.println(a-b);
            }
        }else if (s == '*'){
            if((a*b)== c) {
                System.out.println("Yas");
            }else {
                System.out.println(a*b);
            }
        }else {
            System.out.println("you most inter the true sign ('+', '-', '*') !!??");
        }

    }
}
