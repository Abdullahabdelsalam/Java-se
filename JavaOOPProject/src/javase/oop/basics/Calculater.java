/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.basics;

/**
 *
 * @author Abdullah
 */
public class Calculater {
    private int length;
    private int width;
    private String model;
    private String color;

    public Calculater(int length, int width, String model, String color) {
        this.length = length;
        this.width = width;
        this.model = model;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // extra methods :
    // add : 2 parameters : a , b
    // subtract : 2 parameters : a , b
    
    
    public static int add(int a,int b){
        
      return a+b;  
    }
    public static int sub (int a, int b ){
        return a-b;
    }
    
}
