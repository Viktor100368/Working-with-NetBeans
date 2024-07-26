/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class SocketTest {
    public static void main(String[] args) {
        Socket s = null;
        Scanner in = null;
        try{ s = new Socket();
             s.connect(new InetSocketAddress("time-a.nist.gov",13),2000);
                 in = new Scanner(s.getInputStream(),"UTF-8");

            while(in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
            InetAddress address = InetAddress.getByName("time-a.nist.gov");
            System.out.println("nist IP is "+address);
            byte[] addr = address.getAddress();
            System.out.println(Arrays.toString(addr));
            System.out.println("=======================");
            InetAddress[] googleAddress = InetAddress.getAllByName("google.com");
            for(InetAddress a:googleAddress){
            System.out.println(a);
            }
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(SocketTest.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            in.close();
            try {
                s.close();
            } catch (IOException ex) {
                Logger.getLogger(SocketTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
