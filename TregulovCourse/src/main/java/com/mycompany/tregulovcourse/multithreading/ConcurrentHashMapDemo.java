/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Victor
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, "Ivan");
        hashMap.put(2, "Semen");
        hashMap.put(3, "Irina");
        hashMap.put(4, "Nikolaj");
        hashMap.put(5, "Igor");
        System.out.println(hashMap);
        Runnable runnable1 = ()->{
            Iterator<Integer> iterator = hashMap.keySet().iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException interruptedException) {
                }
                Integer i= iterator.next();
                System.out.println(i+" : "+hashMap.get(i));
            }
        };
        Runnable runnable2 = ()->{
            try {
                Thread.sleep(300);
            } catch (InterruptedException interruptedException) {
            }
            hashMap.put(6,"Elena");
        };
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException interruptedException) {
        }
        for(Map.Entry<Integer,String>entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    
}
