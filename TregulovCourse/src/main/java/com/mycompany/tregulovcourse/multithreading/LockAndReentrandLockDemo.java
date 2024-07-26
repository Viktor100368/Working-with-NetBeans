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
public class LockAndReentrandLockDemo {

    public static void main(String[] args) {
        Call call = new Call();
        new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsupCall();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        }).start();
    }
}

class Call {

    Lock lock = new ReentrantLock();

    public void mobileCall() {
        lock.lock();
        System.out.println("mobile call starts");
        try {
            Thread.sleep(3000);
            System.out.println("mobile call ends");
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void whatsupCall() {
        lock.lock();
        System.out.println("whatsupp call starts");
        try {
            Thread.sleep(5000);
            System.out.println("whatsup call ends");
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {       
        lock.unlock();
        }
    }

    public void skypeCall() {
        lock.lock();
        System.out.println("skype call starts");
        try {
            Thread.sleep(7000);
            System.out.println("skype call ends");
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }finally{        
        lock.unlock();
        }
    }
}
