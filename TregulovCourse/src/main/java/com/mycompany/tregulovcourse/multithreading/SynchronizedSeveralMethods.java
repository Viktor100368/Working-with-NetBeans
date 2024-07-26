/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

/**
 *
 * @author Victor
 */
public class SynchronizedSeveralMethods {
    final static Object lock = new Object();
    public void mobileCall(){
        synchronized(lock){
        System.out.println("mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException interruptedException) {
        }
        System.out.println("mobile call ends");
        }
    }
    public void skypeCall(){
        synchronized(lock){
        System.out.println("skype call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException interruptedException) {
        }
        System.out.println("skype call ends");        
        }
    }
    public void watsupCall(){
        synchronized(lock){
        System.out.println("watsup call starts");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException interruptedException) {
        }
            System.out.println("watsup call ends");
        }
    }
    public static void main(String[] args) {
       
        //RIMobile runnable1 = new RIMobile();
        Thread th1 = new Thread(new RIMobile());
        //RISkype runnable2 = new RISkype();
        Thread th2 = new Thread(new RISkype());
        //RIWatsup runnable3 = new RIWatsup();
        Thread th3 = new Thread(new RIWatsup());
        th1.start();
        th2.start();
        th3.start();
        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}

class RIMobile implements Runnable{
    @Override
    public void run() {        
       new SynchronizedSeveralMethods(). mobileCall();  
    }    
}
class RISkype implements Runnable{
    @Override
    public void run() {
     new SynchronizedSeveralMethods().skypeCall();
    }    
}
class RIWatsup implements Runnable{

    @Override
    public void run() {
       new SynchronizedSeveralMethods(). watsupCall();
    }
    
}