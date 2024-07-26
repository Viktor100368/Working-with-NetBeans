/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

/**
 *
 * @author Victor
 */
public class ImplementsRunnable {

    public static void main(String[] args) {

        Thread th1 = new Thread(new MyRunnable());
        System.out.println(Thread.currentThread());
        th1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("<>");
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("=======");
                }
            }

        }).start();;

        
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
