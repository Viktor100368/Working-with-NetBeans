/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Victor
 */
public class BankomatDemo {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Victor", lock);
        new Employee("Anna", lock);
        new Employee("Semen", lock);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        new Employee("Marija", lock);
        new Employee("Petr", lock);
        new Employee("Oleg", lock);

    }
}

class Employee extends Thread {

    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
//        System.out.println(name+" ждет.....");
//        lock.lock();
            System.out.println(name + " работает с банкомотом");
            try {
                Thread.sleep(2000);
                System.out.println(name + " закончил работу с банкоматом");
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            } finally {
                lock.unlock();
            }
        }else{
            System.out.println(name+" не хочет ждать очереди");
        }
    }

}
