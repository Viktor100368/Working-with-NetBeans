/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

/**
 *
 * @author Victor
 */
public class WaitNotifyDemo {

    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread producerTh = new Thread(producer);
        Thread consumerTh = new Thread(consumer);
        System.out.println("Market is open");
        producerTh.start();
        consumerTh.start();
        try {
            producerTh.join();
            consumerTh.join();
        } catch (InterruptedException interruptedException) {
        }
        System.out.println("Market is closed");
    }
}

class Market {

    private final Object lock = new Object();
    private int breadCount = 0;

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait(500);
                } catch (InterruptedException interruptedException) {
                }
            }
            breadCount--;
            System.out.println("покупатель купил 1 хлеб");
            System.out.println("В магазине осталось - " + breadCount + "хлеб(ов)");
            lock.notify();
        }
    }

    public void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException interruptedException) {
                }
            }
            breadCount++;
            System.out.println("производитель добавил 1 хлеб");
            System.out.println("В магазине осталось - " + breadCount + "хлеб(ов)");
            lock.notify();
        }
    }
}

class Producer implements Runnable {

    Market producer;

    Producer(Market market) {
        this.producer = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            producer.putBread();
        }
    }
}

class Consumer implements Runnable {

    Market consumer;

    Consumer(Market market) {
        consumer = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            consumer.getBread();
        }
    }

}
