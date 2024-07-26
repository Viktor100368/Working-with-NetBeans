/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

/**
 *
 * @author Victor
 */
public class InterruptionDemo {

    public static void main(String[] args) {
        System.out.println("main  starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        try {
            thread.join();
        } catch (InterruptedException interruptedException) {
        }
               
        System.out.println("main ends");
    }

}

class InterruptedThread extends Thread {

    private double sqrtSum = 0;

    public void run() {
        
            for (int i = 1; i <= 1_000_000_000; i++) {
                
                if(isInterrupted()){
                    System.out.println("thread is interrupted");
                    return;
                }
                sqrtSum += Math.sqrt(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException interruptedException) {
                    System.out.println("thred wanting interrupted need reaction");
                    System.out.println("sum sqrt = " + sqrtSum);
                    return;
                }
            }
            
        }
    
}
