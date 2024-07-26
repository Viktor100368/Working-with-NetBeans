/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class DedLockDemo {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
    public static void main(String[] args) {
         
        Thread t10 =new Thread10();
        Thread t20 = new Thread20();
        t10.start();
        t20.start();
        try {
            t10.join();
            t20.join();
        } catch (InterruptedException interruptedException) {
        }
        System.out.println("programm ends");
    }
}
class Thread10 extends Thread{
    public void run(){
        System.out.println("Thread10: Попытка захвата монитора lock1");
        synchronized(DedLockDemo.lock1){
            System.out.println("Монитор lock1 захвачен");
            System.out.println("Thread10: Попытка захвата монитора lock2");
            synchronized(DedLockDemo.lock2){
                System.out.println("Thread10 монитор lock2 и lock1 захвачены");
            }
            
        }
    }    
    
}
class Thread20 extends Thread{
    public void run(){
        System.out.println("Thread20: Попытка захвата монитора lock2");
        synchronized(DedLockDemo.lock1){
            System.out.println("Монитор lock2 захвачен");
            System.out.println(" Thread20: Попытка захвата монитора lock1");
            synchronized(DedLockDemo.lock2){
                System.out.println(" Thread20: монитор lock1 и lock2 захвачены");
            }
            
        }
    }    
    
}
