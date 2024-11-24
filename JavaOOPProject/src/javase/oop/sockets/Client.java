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
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class Client {
    public static void main(String[] args) {
        
        try {
            
            // Create a Connection to the Server
            Socket  socket = new Socket("localhost", 7070);
            
         while(true){  
            //Send the message to the server

                      OutputStreamWriter writeToServer = new OutputStreamWriter(socket.getOutputStream());
                      BufferedWriter bw = new BufferedWriter(writeToServer);

             Scanner input = new Scanner(System.in);
              
                   String msg =  input.nextLine();
                 
                       msg = msg+ "\n";
                      bw.write(msg);
                      bw.flush();
//                      System.out.println("Client : "+msg); 

                      //Get the return message from the server
                      InputStreamReader readFromServer = new InputStreamReader(socket.getInputStream());
                      BufferedReader br = new BufferedReader(readFromServer);
                      String message = br.readLine();
                      System.out.println("Server : " +message);

         }
		// Close Socket Connection
	//	socket.close();

            
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
