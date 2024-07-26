/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Victor
 */
public class SynchronizedCollectionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
        ArrayList<Integer> target = new ArrayList<>();
        List<Integer> synchList = Collections.synchronizedList(target);
        Runnable runnable = ()->target.addAll(source);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException interruptedException) {
        }
        
        System.out.println(synchList);

    }
}
