/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.inherit;

/**
 *
 * @author Abdullah
 */
public class Manager extends Person {
    private int profitPercentage ;

    public Manager( int personld, String personName, double personGrossSalary, String personJob,int profitPercentage) {
        super(personld, personName, personGrossSalary, personJob);
        this.profitPercentage = profitPercentage;
    }
    
    

    

    public int getProfitPercentage() {
        return profitPercentage;
    }

    public void setProfitPercentage(int profitPercentage) {
        this.profitPercentage = profitPercentage;
    } 
    public double getMonthlyNetSalary(){
        int tax=10;
        return getPersonGrossSalary()-getPersonGrossSalary()*tax/100;
    }
    public double getAnnualNetSalary(){
      return getMonthlyNetSalary()*12;
    }
    public double getAnnualNetSalary(double companyProfit){
        return getAnnualNetSalary()+companyProfit * profitPercentage/100.0 ;
    }

    @Override
    public void printPersonData() {
            System.out.println("print Manager data");
    }
    
}

