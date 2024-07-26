/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Victor
 */
public class ThreadExecutorDemo2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        System.out.println("main starts");
        scheduledExecutorService.schedule(new RunnableImpl200(),3,TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
        try {
            scheduledExecutorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException interruptedException) {
        }
        System.out.println("main ends");
    }
}
class RunnableImpl200 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" statrs");
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" ends");
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
    
}
