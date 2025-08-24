package basic.sheet1;

import java.util.Scanner;

public class TtSortNumbers {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the A = " );
        int  a = inpot.nextInt();
        System.out.print("Enter the B = " );
        int  b = inpot.nextInt();
        System.out.print("Enter the C = " );
        int  c = inpot.nextInt();

        int x = a;
        if(a < b && a < c ){
            if (b<c){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        } else if ( b < a  && b < c ) {
            if (a<c){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        }else if ( c < a  && c < b ) {
            if (a < b) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }

        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
