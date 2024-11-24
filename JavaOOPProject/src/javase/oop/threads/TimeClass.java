/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class TimeClass implements Runnable{

    public void printTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH24:mm:ss");
        while(true){
            Date d1 = new Date();
            System.out.println(sdf.format(d1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TimeClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    
    @Override
    public void run() {
        printTime();
    }
    
    
}
