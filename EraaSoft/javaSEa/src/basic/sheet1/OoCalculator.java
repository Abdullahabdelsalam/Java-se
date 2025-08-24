package basic.sheet1;
import java.util.Scanner;

public class OoCalculator {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter the First Number = " );
        int  a = inpot.nextInt();
        System.out.print("Enter the Mathematical Expression(+,-,*,/) = " );
        char  s = inpot.next().charAt(0);
        System.out.print("Enter the Second Number = " );
        int  b = inpot.nextInt();

        switch (s){
            case '+':
                System.out.println("A + B = " +(a+b));
                break;
            case  '-':
                System.out.println("A - B = " +(a-b));
                break;
            case '*':
                System.out.println("A * B = " +(a*b));
                break;
            case '/':
                if(a>b) {
                    System.out.println("A / B = " + (a / b));
                }else {
                    System.out.println("B / A = " + (b / a));
                }
                break;
        }
    }
}
