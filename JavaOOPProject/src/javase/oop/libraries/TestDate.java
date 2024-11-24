/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.libraries;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class TestDate {
    public static void main(String[] args) {
        // get today date
        Date today = new Date();
        System.out.println("today = "+today);
        
        // custom date : 12-April-2021
        Date customDate = new Date(121, 3, 12);
        System.out.println("custom date = "+ customDate);
        
        customDate.setYear(123);
        System.out.println("custom date = "+customDate);
   
        System.out.println("is today greater than custom date ? "+ today.after(customDate));
        
        /// Formatting date :   12-4-2023
        // Convert From Date to String : using SimpleDateFormat class , format() method
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       String dateFormatted =  sdf.format(today);
        System.out.println("formatting today = "+dateFormatted);
        sdf.applyPattern("dd/MM/yyyy hh:mm:ss a");
         dateFormatted =  sdf.format(today);
        System.out.println("formatting today = "+dateFormatted);
         sdf.applyPattern("dd/MM/yyyy HH:mm:ss");
         dateFormatted =  sdf.format(today);
        System.out.println("formatting today = "+dateFormatted);
        
        
        
        /// Convert from String to Date
        String tomorrowStr = "11/3/2024";
        sdf.applyPattern("dd/MM/yyyy");
        Date tomorrowDate = null;
        try {
             tomorrowDate =  sdf.parse(tomorrowStr);
        } catch (ParseException ex) {
            Logger.getLogger(TestDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Tomoorow date = "+tomorrowDate);
        
    }
}
