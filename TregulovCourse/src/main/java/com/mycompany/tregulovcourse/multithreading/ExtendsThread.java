/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

/**
 *
 * @author Victor
 */
public class ExtendsThread {
    public static void main(String[] args) {
        MyThread1 tr1 = new MyThread1();
        MyThread2 tr2 = new MyThread2();
        tr1.start();
        tr2.start();
    }   
    
}
class MyThread1 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(i);
        }
    }
    
}
class MyThread2 extends Thread{

    @Override
    public void run() {
        for(int i=1000;i>0;i--){
            System.out.println(i);
        }
    }
    
}
