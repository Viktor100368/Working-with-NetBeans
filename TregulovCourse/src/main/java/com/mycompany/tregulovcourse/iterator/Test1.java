/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Victor
 */
public class Test1 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ivan");//method add()
        list1.add("Anton");
        list1.add("Marija");
        list1.add("Anna");
        list1.add("Misha");
        list1.add("Pasha");
        list1.add("Lena");
        list1.add("Kostja");
        list1.add("Tanja");
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
