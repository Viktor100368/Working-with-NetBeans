/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Victor
 */
public class ArrayDequeDemo1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(1);
        deque.addLast(10);
        deque.offerFirst(6);
        deque.offerLast(4);
        deque.addLast(11);
        deque.offerFirst(23);
        deque.offerLast(41);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque);
    }
}
