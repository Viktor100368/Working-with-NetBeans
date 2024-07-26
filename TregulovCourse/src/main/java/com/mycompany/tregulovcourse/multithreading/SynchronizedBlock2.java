/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

/**
 *
 * @author Victor
 */
public class SynchronizedBlock2 {

    static int counter;

    public static void increase() {
        synchronized (SynchronizedBlock2.class) {
            counter++;
        }
    }

    public static void main(String[] args) {
        R2 runnable = new R2();
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);

    }

}

class R2 implements Runnable {

    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizedBlock2.increase();
        }
    }
}
