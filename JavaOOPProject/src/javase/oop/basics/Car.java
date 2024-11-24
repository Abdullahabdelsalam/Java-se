/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.basics;

/**
 *
 * @author Abdullah
 */
public class Car {
   private String name; 
   private int maxSpeed;
   private double price;
   private int model;
   
   public Car(){
       
   }
   
   public double PriceEg(){
   return price*39;
}
   
  public Car( String name, int maxSpeed,double price,int model){
      this.name=name; 
      this.maxSpeed=maxSpeed;
      this.price=price;
      this.model=model;  
   } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
