/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Victor
 */
public class ThreadExecutorDemo3 {
    public static void main(String[] args) {
        
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        System.out.println("main starts");
        //scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl300(),3, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl300(),3, 1, TimeUnit.SECONDS);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException interruptedException) {
        }
        scheduledExecutorService.shutdown();
        ExecutorService service = Executors.newCachedThreadPool();
        NewThread t1 = new NewThread();
        NewThread t2 = new NewThread();
        NewThread t3 = new NewThread();
        service.execute(t1);
        service.execute(t2);
        service.execute(t3);
        service.shutdown();
        try {
            service.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException interruptedException) {
        }
        System.out.println("main ends");
    }
    
}
class RunnableImpl300 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" statrs");
//        try {
//            Thread.sleep(5000);
//            
//        } catch (InterruptedException interruptedException) {
//            interruptedException.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+" ends");
    }    
}
class NewThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
            }
        }
    }
}