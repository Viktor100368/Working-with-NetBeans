/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class SynchronizedDemo {
    public static int counter;
    public static synchronized void increase(){counter++;}
    public static void main(String[] args) {
        R runnable = new R();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(counter);
    }
}
class R implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100000;i++)
        SynchronizedDemo.increase();
    }
    
}
