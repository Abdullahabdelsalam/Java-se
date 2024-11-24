/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.basics;

/**
 *
 * @author Abdullah
 */
public class StaticKeyword {

    int number;
    private String name;
    private String password;
    private boolean loggedin;
    private static String college="IT";
    private static int count=2023;
    
    public StaticKeyword(String name,String password){
        this.number=count;
        this.name=name;
        this.password=password;
        count++;
    }
    public boolean loggin(int enterNumber,String enterPassword){
        if(enterNumber==number&&enterPassword.equals(password)){
            loggedin=true;
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "StaticKeyword{" + "number=" + number + ", name=" + name + ", password=" + password + ", loggedin=" + loggedin + '}';
    }




}
