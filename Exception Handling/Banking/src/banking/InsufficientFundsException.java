/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author Abdullah
 */
public class InsufficientFundsException extends Exception{

    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
    
    
}
