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
public class JoinDemo {

    public static void main(String[] args) {
        Thread worker = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("worker begin ");
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("worker ends");
            }
        });
        System.out.println("main begin");
        worker.start();
        try {
            worker.join(4000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("main ends");
    }
}
