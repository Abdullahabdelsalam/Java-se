package basic.sheet1;

import java.util.Scanner;

public class XxTwoIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number L1 = ");
        int l1 = input.nextInt();
        System.out.print("Enter the number R1 = ");
        int r1 = input.nextInt();
        System.out.print("Enter the number L2 = ");
        int l2 = input.nextInt();
        System.out.print("Enter the number R2 = ");
        int r2 = input.nextInt();

        System.out.println("[ " +l1+" , "+ r1 +" ]"+ " , " +"[ "+ r2 +" , " + r2+" ]" );

        if(l1 >= 0 && l2 >= 0 && r1 >= 0 && r2 >= 0){
            int p1 = Math.max(l1,l2);
            int p2 = Math.min(r1,r2);
            if (p1 < p2){
                System.out.println( p1 +" "+ p2);
            }else if (p2 < p1) {
                System.out.println(p2-p1);
            }
        }else {
            System.out.println("Mast (1≤l1,l2,r1,r2) ");
        }
    }
}
