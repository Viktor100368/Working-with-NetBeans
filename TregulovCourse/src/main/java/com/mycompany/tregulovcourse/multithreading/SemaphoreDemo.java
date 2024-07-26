/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new PersonCall("Victor",callBox);
        new PersonCall("Anna",callBox);
        new PersonCall("Ivan",callBox);
        new PersonCall("Marija",callBox);
        new PersonCall("Semen",callBox);
                
    }
}
class PersonCall extends Thread{
    private String name;
    private Semaphore callBox;

    public PersonCall(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    public void run(){
        System.out.println(name +" ждет...");
        try {
            callBox.acquire();
            System.out.println(name +" пользуется телефоном");
            Thread.sleep(3000);
            System.out.println(name+" завершил звонок");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }finally{
            callBox.release();
        }
        
    }
}
