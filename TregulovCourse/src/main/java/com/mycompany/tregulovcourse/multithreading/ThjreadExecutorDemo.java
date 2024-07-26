/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Victor
 */
public class ThjreadExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl100());
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            
        }
        System.out.println("main ends");
        
    }
}
class RunnableImpl100 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException interruptedException) {
//            interruptedException.printStackTrace();
//        }
                
    }
    
}