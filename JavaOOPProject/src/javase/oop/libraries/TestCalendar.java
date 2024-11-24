/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.libraries;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Abdullah
 */
public class TestCalendar {
    public static void main(String[] args) {
        // abstract class : class cannot have objects
         // Calendar cl = new Calendar();
         GregorianCalendar today = new GregorianCalendar(); // today
         System.out.println("today = "+today);
         // convert from calendar to Date
         System.out.println("today = "+ today.getTime());
         
         // custom date _ 21-April-2021
         GregorianCalendar customDate = new GregorianCalendar(2021, 3, 21);
         System.out.println("custom date = "+customDate.getTime());
         
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         System.out.println("formatted calendar = "+sdf.format(today.getTime()));
         
         
         // read fields : year - month - day .. .
         System.out.println("Year = "+today.get(Calendar.YEAR));
         System.out.println("Month = "+today.get(Calendar.MONTH));
         System.out.println("day = "+today.get(Calendar.DAY_OF_MONTH));
         System.out.println("day of week= "+today.get(Calendar.DAY_OF_WEEK));
         
         // Add Months to today 
         today.add(Calendar.MONTH, 3);
         System.out.println("After 3 months from today = " + today.getTime() );
         
         
         
         // reset today variable back to today date 
         today.setTime(new Date());
         System.out.println("After reset = "+today.getTime());
         
         
         //check if today is Sunday 
         if ( today.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
             System.out.println("Yes - today is sunday");
         }else{
             System.out.println("No - today is not sunday");
         }
         
         
         
         /// Example : Find the date after 12 working days from a specific date  | result = 26-3-2024
         // calling
        Date resultDate =  calcWorkingDays(today.getTime(), 12);
         System.out.println("After 12 working days ; date = "+resultDate);
    } // end main
    
    public static Date calcWorkingDays(Date inputDate, int noDays){
        
        // Convert from Date to Calendar
        GregorianCalendar calendarDate = new GregorianCalendar();
        calendarDate.setTime(inputDate);
        
        for(int i = 0; i < noDays; i++){
            if (calendarDate.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY){
                calendarDate.add(Calendar.DATE, 3);
            }else{
            
                  calendarDate.add(Calendar.DATE, 1);
            }
        }
        
        return calendarDate.getTime();
    }
    
    
}
