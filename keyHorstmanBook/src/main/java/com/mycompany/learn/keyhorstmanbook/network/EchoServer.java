/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class EchoServer {

    public static void main(String[] args)  {
        
        try(ServerSocket server = new ServerSocket(8189)){
            System.out.println("server starting");
            int i=0;
            while(true){
                i++;
                Socket incoming = server.accept();
                Runnable r = new ThreadSocketHandler(incoming,i);
                Thread t = new Thread(r);
                t.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(EchoServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}    
 
class ThreadSocketHandler implements Runnable{
    private Socket incoming;
    private int count;

    public ThreadSocketHandler(Socket incoming, int count) {
        this.incoming = incoming;
        this.count = count;
    }
    

    @Override
    public void run() {
        try(InputStream inStream = incoming.getInputStream();
                OutputStream outStream = incoming.getOutputStream()){
            System.out.println("thread "+count+" starting");
            try(Scanner input = new Scanner(inStream,"UTF-8");
                    PrintWriter output = new PrintWriter(new OutputStreamWriter(outStream,"UTF-8"),true)){
                output.println("Hello my Friend: enter poka to exit");
                boolean done = false;
                while(!done && input.hasNextLine()){
                    String line = input.nextLine();
                    output.println("\nthread "+count+" - Echo: "+line);
                    if(line.trim().equals("poka")){
                        done = true;
                    }
                }
                System.out.println("thread "+count+" stoping");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ThreadSocketHandler.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }    
}
        
