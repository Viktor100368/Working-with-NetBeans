/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Victor
 */
public class ListIteratorDemo {

    public static void main(String[] args) {
        String s = "MADOM";
        List<Character> charList = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            charList.add(ch);
        }
        boolean isPalindrom = true;
        ListIterator<Character> iterator = charList.listIterator();
        ListIterator<Character> reverseIterator = charList.listIterator(charList.size());
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom){
            System.out.println("is Palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}
