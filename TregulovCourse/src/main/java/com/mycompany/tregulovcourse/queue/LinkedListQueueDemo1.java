/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Victor
 */
public class LinkedListQueueDemo1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ivan");
        queue.add("Anna");
        queue.add("Semen");
        queue.add("Petr");
        queue.add("Anton");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.element());
        
    }
}
