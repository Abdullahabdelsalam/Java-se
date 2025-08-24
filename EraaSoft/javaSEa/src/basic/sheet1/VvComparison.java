package basic.sheet1;

import java.util.Scanner;

public class VvComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A = ");
        int a = input.nextInt();
        System.out.print("Enter the s  ('<', '>','=') = ");
        char s = input.next().charAt(0);
        System.out.print("Enter the number B = ");
        int b = input.nextInt();

        System.out.println(a +" "+ s +" "+b);

        if (a == b && s=='='){
            System.out.println("Right");
        } else if (a > b && s == '>') {
            System.out.println("Right ");
        }else if (a < b && s == '<'){
            System.out.println("Right ");
        }else {
            System.out.println("Wrong ");
        }
    }
}
