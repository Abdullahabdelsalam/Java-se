/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
        Scanner in = new Scanner(System.in);
        NameBank acount1 = new NameBank();
        String option = "";
        do{
            System.out.println("1.DEPOSITE");
            System.out.println("2.WITHDRAW");
            System.out.println("3.BALANCE");
            System.out.println("ENTER OPTION");

            option = in.next();
            switch(option){
                case"1":{
                    System.out.println("ENTER DEPOSITE AMOUNT");
                    double amt = in.nextDouble();
                    acount1.deposit(amt);
                    acount1.balanceEnquiry();
                    break;
                }
                case"2":{
                    System.out.println("ENTER WITHDRAW AMOUNT");
                    double amt = in.nextDouble();
                    double wt = acount1.withdraw(amt);
                    System.out.println("WITHDRAW AMOUNT is : " + wt);
                    acount1.balanceEnquiry();
                    break;
                }
                case"3":{
                    acount1.balanceEnquiry();
                    break;
                }
                default:{
                    System.out.println("INVALID OPTIPON");
                }
            }
            System.out.println("DO YOU WANT TO COUNTINUE (YES / NO)");
            option = in.next();
        }while(option.equalsIgnoreCase("YES"));
        }catch(InvalidAmountException inv){
            System.out.println(inv.getMessage());
        }catch(InsufficientFundsException ins){
            System.out.println(ins.getMessage());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException m){
            System.out.println(m.getMessage());
        }
    }
}
