/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author Victor
 */
public class CountDownLatchDemo {
    private static CountDownLatch countDownLatch = new CountDownLatch(3);
    public static void main(String[] args) {
        new Friend("Ivan",countDownLatch);
        new Friend("Anton",countDownLatch);
        new Friend("Anna",countDownLatch);
        new Friend("Viktor",countDownLatch);
        new Friend("Marina",countDownLatch);
        
         marketStaffOnPlace();
        everythingIsReady();
        openMarket();
        
        
     
    }
    public static void marketStaffOnPlace(){
        try {
            Thread.sleep(2000);            
        } catch (InterruptedException interruptedException) {
        }
        countDownLatch.countDown();
        System.out.println("market staff came to work");
        System.out.println("countdownLatch = "+countDownLatch);
        
       
    } 
    public static void everythingIsReady(){
        try {
            Thread.sleep(7000);            
        } catch (InterruptedException interruptedException) {
        }
        countDownLatch.countDown();
        System.out.println("everything ready");
        System.out.println("countdownLatch = "+countDownLatch);
    } 
    public static void openMarket(){
        try {
            Thread.sleep(4000);            
        } catch (InterruptedException interruptedException) {
        }
        countDownLatch.countDown();
        System.out.println("market is open");
        System.out.println("countdownLatch = "+countDownLatch);
    } 
}
class Friend extends Thread{
    private String name;
    private CountDownLatch countDownLatch;
    Friend(String name,CountDownLatch countDownLatch){
        this.countDownLatch= countDownLatch;
        this.name = name;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name+" приступил(а) к закупкам");
        } catch (InterruptedException interruptedException) {
        }   
    }
}