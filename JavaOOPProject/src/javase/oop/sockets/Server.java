/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.sockets;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class Server {
    public static void main(String[] args) {
        
        try {
            ServerSocket serverSocket = new ServerSocket(7070);
            System.out.println("Server Started and listening to the port 7070");
             /// Listening to Socket for Client Request
                      Socket  socket = serverSocket.accept();

                      
          while(true){            
            //Reading the message from the client  
                       InputStreamReader readFromClient = new InputStreamReader(socket.getInputStream());
                       BufferedReader br = new BufferedReader(readFromClient);
                   
	  String message = br.readLine();
                       System.out.println("Client : "+message);
            // reply to the Message
	     //Sending the response back to the client.

                       OutputStreamWriter writeToClient = new OutputStreamWriter(socket.getOutputStream());
                       BufferedWriter bw = new BufferedWriter(writeToClient);


                           Scanner input = new Scanner(System.in);
                          
                      String returnMessage = input.nextLine();
                           returnMessage = returnMessage+"\n";


                       bw.write(returnMessage);
//                       System.out.println("Server :  "+returnMessage);
                       bw.flush();
          }
                      
                // Close Socket Connection 		
                    //      socket.close();
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
                   

        
    }
}
