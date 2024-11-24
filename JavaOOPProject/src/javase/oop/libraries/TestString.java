/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.libraries;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Abdullah
 */
public class TestString {
    public static void main(String[] args) {
        // 1- Primitive data types الأصلية
        int x = 10;
        // byte 8 - short 16 - int 32 - long 64 - float - double - boolean - char
        byte b1 = 127;  // 2 ^ 7 -1
        
        // 2 class types [ objects ] String - Date - Calendar - Employee - Customer 
        String empName12 = "Hamed";
        
        // 3- Wrapper classes [ this is a class type for every primitive type ]
        // Byte - Short - Integer - Long - Float - Double - Boolean - Character 
        Integer xx = 70;
        
        String s1 = "Hossam";
        String s2 = "Aly";
        s1 = "omar";
        String s3 = "Aly";
        s3 = "Ehab";
        // garbacge collector  every 1 second remove any objects without pointer
        // string is immutable [ un changed after creation ]
        
        // String methods 
        // 1. equals()    | equalsIgnoreCase()
        System.out.println("---- equals - equalsIgnoreCase() ----");
        String empName= "ahmed";
        String custName = "Ahmed";
        System.out.println(empName.equals(custName));
        System.out.println(empName.equalsIgnoreCase(custName));
        
        
        // 2- endsWith()
        System.out.println("--- endsWith() -----");
        String fileName = "cairo.pdf";
        if (fileName.endsWith("pdf")){
            System.out.println("it is a book");
        }else if(fileName.endsWith("jpg")){
            System.out.println("it is image");
        }else{
            System.out.println("unknown type");
        }
        
        // startsWith
        System.out.println("------- startsWith() -------");
        String empMobile = "01013123121";
        if (empMobile.startsWith("010")){
            System.out.println("it is a vodafone");
        }else if(empMobile.startsWith("012")){
            System.out.println("It is orange number");
        }else{
            System.out.println("unknown phone number");
        }
        
        // index of()
        System.out.println("--- indexof()-----");
        empName = "Ahmed Omran";
        System.out.println(empName.indexOf(" "));
        
        // replace()
        System.out.println("------ replace() ------");
        empName = empName.replace(" ", ".");
        System.out.println(empName);
        
        // substring [ slicing ] 
        System.out.println("------ substring [ slicing ]  -----");
        String empEmail = "ahmed.omran@gmail.com";
        String userName = empEmail.substring(0, empEmail.indexOf("@"));
        System.out.println("user name = "+userName);
        String domanName = empEmail.substring(empEmail.indexOf("@") + 1, empEmail.length());
        domanName = empEmail.substring(empEmail.indexOf("@") + 1);
        System.out.println("domain name = "+domanName);
        
        
        // Convert from String to char Array 
        System.out.println("--- tocharArr() --- Character class ------ ");
        String password = "P@ssw0rd_2023";
        char[] passwordArr = password.toCharArray();
        int countUpper = 0; int countDigits = 0;
        for (char item : passwordArr){
            if (Character.isUpperCase(item)){
                countUpper++;
            }
            
            if (Character.isDigit(item)){
                countDigits++;
            }
        }
        System.out.println("cound upper = "+countUpper+", count digits = "+countDigits);
                
        /// split()
        System.out.println("----- split() -------");
        String courses = "java php oracle python c++";
        String[] coursesList = courses.split(" ");
        for(String item : coursesList){
            System.out.println(item);
        }
        
        
        // find()
        System.out.println("--- find() -------");
        // example : get no. of occurence java in the string
        courses = "java php oracle python java c++ java";        
        Pattern p = Pattern.compile("java"); // the work to search for
        Matcher m = p.matcher(courses); // the string to search in
        
        int counter = 0;
        while(m.find()){
            counter++;
        }
        
        System.out.println("No. of occurence of java = "+counter);
        
        System.out.println("---------------------- Convert From String to Integer ------");
        String productIdStr  = "112";
        int productId = Integer.parseInt(productIdStr);
        System.out.println(productId);
        
        
        System.out.println("----- Convert from integer to string ------");
        int z = 500;
        String zStr = String.valueOf(z);
        System.out.println(zStr);
        
        
        System.out.println("-------------------- StringBuilder | StringBuffer  --------------------------------");
        // threads  = Multi threading   : 2 methods run in the same time in parallel ---------- StringBuffer
        System.out.println("-------- Convert from String to StringBuilder ------- ");
        String text = "java";
        StringBuilder builder = new StringBuilder(text);
        System.out.println(builder);
        
        // insert()     append()        reverse()
        builder.insert(0, "Welcome to ");
        System.out.println(builder);
        
        builder.append(" course");
        System.out.println(builder);
        
        System.out.println("--------- Convert From builder to String ------");
        text = builder.toString();
        System.out.println(text);
        
        // example : 563234 : reverse this number 
        int num = 563234;
        // 1- convert from int to String
        String numStr = String.valueOf(num);
        //2- convert from String to Builder
        StringBuilder numBuilder = new StringBuilder(numStr);
        // 3- reverse 
       numBuilder =  numBuilder.reverse();
        System.out.println(numBuilder);
        // 4- convert from builder to String
        numStr = numBuilder.toString();
        // 5- convert from string to int 
        num = Integer.parseInt(numStr);
        System.out.println(num);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
