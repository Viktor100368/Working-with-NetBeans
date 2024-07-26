/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.network;

import java.net.InetAddress;
import java.net.UnknownHostException;



/**
 *
 * @author Victor
 */
public class SicketTest2_1 {
    public static void main(String[] args) throws UnknownHostException {
        if(args.length > 0){
            String host = args[0];
            InetAddress[] address = InetAddress.getAllByName(host);
            for(InetAddress a:address){
                System.out.println(a);
            }
        }else{
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        }
    }
}
