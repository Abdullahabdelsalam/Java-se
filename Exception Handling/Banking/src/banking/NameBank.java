/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author Abdullah
 */
public class NameBank {
    
    private double balance;
    
    public void deposit(double amount) throws InvalidAmountException{
        if(amount <=0){
            throw new InvalidAmountException(amount + "is not valid");
        }
        balance += amount;
    }
    
    public double withdraw(double amount) throws InsufficientFundsException{
        if(balance < amount){
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
        return amount;
    }
    
    public void balanceEnquiry(){
        System.out.println("current balance" + balance);
    }
}
