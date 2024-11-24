/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.basics;

/**
 *
 * @author Abdullah
 */
public class Account {
    private int accauntNumber;
    private String name;
    private float amount;

    public Account(int accauntNumber, String name, float amount) {
        this.accauntNumber = accauntNumber;
        this.name = name;
        this.amount = amount;
    }

    public int getAccauntNumber() {
        return accauntNumber;
    }

    public void setAccauntNumber(int accauntNumber) {
        this.accauntNumber = accauntNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    public void setDeposit(float deposit){
        amount+= deposit ;
    }
    public void setwithdraw(float withdraw){
        if(amount<withdraw){
            System.out.println("Insufficient Balance ");
        }else
        amount-=withdraw;
    }

    @Override
    public String toString() {
        return "Account{" + "accauntNumber=" + accauntNumber + ", name=" + name + ", amount=" + amount + '}';
    }
    
}
