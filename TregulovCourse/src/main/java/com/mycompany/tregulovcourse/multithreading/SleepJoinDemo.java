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
public class SleepJoinDemo implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(new SleepJoinDemo());
        MyThread5 th2 = new MyThread5();
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("end");
    }
    
    
}
class MyThread5 extends Thread{

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }   
    }
    
}