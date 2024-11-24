/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class TestThreads {
    public static void main(String[] args) {
        // Create objects from the 2 classes
        NumberClass nc = new NumberClass();
        TimeClass tc = new TimeClass();
        
        // Create objects from Thread class and pass the 2 objects in the constructor
        Thread numberThread = new Thread(nc);
        Thread timeThread = new Thread(tc);
        Thread abdullahThread = new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                System.out.println("Abdullah thread");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TestThreads.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        });
        
        
        // start the threads
        numberThread.start();
        timeThread.start();
        abdullahThread.start();
        
        
        
    }
}
