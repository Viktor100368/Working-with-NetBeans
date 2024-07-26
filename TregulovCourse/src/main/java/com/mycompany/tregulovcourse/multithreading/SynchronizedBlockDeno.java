/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

/**
 *
 * @author Victor
 */
public class SynchronizedBlockDeno {

    public static void main(String[] args) {
        Work runnable = new Work();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        Thread th3 = new Thread(runnable);
        th1.start();
        th2.start();
        th3.start();
    }

}

class Work implements Runnable {
    private void doWork2(){
        System.out.println("Ura!!! thread = "+Thread.currentThread().getName());
    }

    private  void doWork() {
        doWork2();
        synchronized(this){
        Counter.counter++;
        System.out.println(Counter.counter);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork();
        }
    }

}

class Counter {

    public volatile static int counter = 0;
}
