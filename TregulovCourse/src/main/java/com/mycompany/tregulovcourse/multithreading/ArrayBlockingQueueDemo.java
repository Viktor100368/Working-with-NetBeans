package com.mycompany.tregulovcourse.multithreading;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Victor
 */
public class ArrayBlockingQueueDemo {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);
        //producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    arrayBlockingQueue.put(++i);                   
                    System.out.println("Producer enter value "+i+" "+arrayBlockingQueue);
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                }
                if(i==10){
                    break;
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                try {
                  Integer i = arrayBlockingQueue.take();
                  System.out.println("Consumer take value "+i+" "+arrayBlockingQueue);
                    Thread.sleep(3000);
                    
                } catch (InterruptedException interruptedException) {
                }
                if(arrayBlockingQueue.isEmpty()){
                    System.out.println("arrayBlockingQueue is empty");
                    break;
                }
            }
        }).start();
    }

}
