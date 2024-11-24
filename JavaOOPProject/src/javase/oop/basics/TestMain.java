/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.basics;

/**
 *
 * @author Abdullah
 */
public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(5,"red");
        c1.setColor("blue");
        c1.setRadius(10);
        System.out.println("radius = "+c1.getRadius());
        System.out.println("color = "+c1.getColor());
        System.out.println("aree = "+c1.getArea());
        System.out.println("Circumference = "+c1.getCircumference());
        System.out.println("****************************************");
        Account ac1 =new Account(230, "Ahamd", 20000);
        ac1.setDeposit(20000);
        System.out.println("=="+ac1.getAmount());
        ac1.setwithdraw(5000);
        System.out.println("=="+ac1.getAmount());
        System.out.println("*****************************************");
        StaticKeyword st1 = new StaticKeyword("Ali","124");
        System.out.println(st1 );
        StaticKeyword st2 = new StaticKeyword("Ahmad","123");
        System.out.println(st2 );
         System.out.println(st1.loggin(2023, "124"));
        System.out.println("******************************************");
        // Create objects / instances from class Emp 
        Emp empAhmed = new Emp();
      //  empAhmed.empId = 101;
        empAhmed.setEmpId(101);
        //empAhmed.empName = "Ahmed Mostafa";
        empAhmed.setEmpName("Ahmed Mostafa");
        //empAhmed.empGrossSalary = -5000; // direct access to class attributes
        empAhmed.setEmpGrosssSalary(5000);
        System.out.println("emp name = "+empAhmed.getEmpName());
        System.out.println("Monthly net = "+empAhmed.calcMonthlyNetSalary());
        System.out.println("Annual net = "+empAhmed.calcAnnualNetSalary());
        System.out.println("----------------------");
        Emp e2 =new Emp();
        e2.setEmpId(1020);
        e2.setEmpName("abdallah");
        e2.setEmpGrosssSalary(40000);
        System.out.println("emp name = "+e2.getEmpName());
        System.out.println("Monthly net = "+e2.calcMonthlyNetSalary());
        System.out.println("Annual net = "+e2.calcAnnualNetSalary() );
        System.out.println("----------------------------");
        Emp e3 = new Emp(103, "Ibrahim", 7000, "php developer");
        System.out.println("emp name = "+e3.getEmpName());
        System.out.println("Monthly net = "+e3.calcMonthlyNetSalary());
        System.out.println("-------------------");
        Emp e4 = new Emp(104, "Hossam", 6000);
        
        System.out.println("++++++++++++++++ Array of objects ++++++++++++++++++++");
        int[] myArray = new int[5];
        myArray[0] = 17;
        
        Emp[] empsArray = new Emp[5];
        empsArray[0] = empAhmed;
        empsArray[1]=e2;
        empsArray[2]=e3;
        empsArray[3]=e4;
        // add object to array on the fly
        empsArray[4]=new Emp(105,"abdallah",5000);
        
        // loop and print emps names 
        for(int i=0; i<empsArray.length;i++){
            System.out.println(empsArray[i].getEmpName());
        }
        
        System.out.println("--- for each loop ");
        for(Emp emp :empsArray){
            System.out.println(emp.getEmpName());
        }
            System.out.println("********************************");
        //h.w task : raise each employee : gross salary by 1000 inside a loop and loop again 
        // to print each after raise
        for(Emp empSalary :empsArray){
            empSalary.setEmpGrosssSalary(empSalary.getEmpGrossSalary()+1000);
            System.out.println(empSalary.getEmpGrossSalary());
        }
        
        System.out.println("----------   passing object to method as a parmeter---");
        double bon = 2000;
        System.out.println("sal before = "+empAhmed.getEmpGrossSalary());
        raiseEmpSalary(empAhmed, bon);
        System.out.println("sal after = "+empAhmed.getEmpGrossSalary());
        
        
       System.out.println("------------- test for static attriubtes ---------------------");
        System.out.println("emp ahmed wallet = "+empAhmed.getEmpWallet());
        System.out.println("total bonus = "+Emp.getTotalBonus());
        empAhmed.withdrawBonus(1500);
         System.out.println("emp ahmed wallet = "+empAhmed.getEmpWallet());
        System.out.println("total bonus = "+Emp.getTotalBonus());
        
        System.out.println("------------------------------");
        e2.withdrawBonus(3000);
        System.out.println("emp abdallah walled ="+e2.getEmpWallet());
        System.out.println("totel bonus = " +Emp.getTotalBonus());

    } // end main
    
    // passing object to method as a parmeter
    public static void raiseEmpSalary(Emp e, double bonus){
       e.setEmpGrosssSalary(e.getEmpGrossSalary() + bonus);
    }
    
    
} // end class
