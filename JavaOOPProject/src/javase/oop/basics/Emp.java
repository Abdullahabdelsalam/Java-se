/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.basics;

/**
 *
 * @author Abdullah
 */
public class Emp {
//    instance attributes, object attributes, class members
    private int empId;
    private String empName;
    private double empGrossSalary;
    private String empJob;
    String empAddress;
    private double empWallet;
    private static double totalBonus = 10_000.0; // shared between all objects
    
    /// Constructors 
    // empty constructor = default constructor 
    public Emp(){
        
    }
    
    public Emp(int empId, String empName, double empGrossSalary, String empJob){
        this.empId = empId;
        this.empName = empName;
        this.empGrossSalary = empGrossSalary;
        this.empJob = empJob;
                
    }
    
    public Emp(int empId, String empName, double empGrossSalary){
        this.empId = empId;
        this.empName = empName;
        this.empGrossSalary = empGrossSalary;
    }
    
    // get method
    public double getEmpGrossSalary(){
        return empGrossSalary;
    }
    
    // set = write
    public void setEmpGrosssSalary(double empGrossSalary){
        if(empGrossSalary > 0){
            this.empGrossSalary = empGrossSalary;
        }else{
            System.out.println("salary cannot be -ve");
            System.exit(0);
        }
    }
    
    
    
    
    
    
    

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    public double getEmpWallet() {
        return empWallet;
    }

    public void setEmpWallet(double empWallet) {
        this.empWallet = empWallet;
    }

    public static double getTotalBonus() {
        return totalBonus;
    }
            
    
    
    
    // other methods
    public double calcMonthlyNetSalary(){
        int tax = 10; // local variable
        return empGrossSalary - empGrossSalary * tax / 100.0;
    }
    
    public double calcAnnualNetSalary(){
        return calcMonthlyNetSalary() * 12;
    }
    
    public void withdrawBonus(double amount){
         empWallet = empWallet + amount;
         totalBonus = totalBonus - amount;
    }
}
