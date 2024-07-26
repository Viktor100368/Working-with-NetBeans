/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.collection.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class MethodsArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ivan");//method add()
        list1.add("Anton");
        list1.add("Marija");
        list1.add(1, "Anna");//add() по индексу
        list1.add("Misha");
        list1.add("Pasha");
        list1.add("Lena");
        list1.add("Kostja");
        list1.add("Tanja");
        System.out.println(list1);
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("method get(2) = " + list1.get(2));//method get()
        list1.set(0, "Vasja");//method set()
        System.out.println(list1);
        boolean res = list1.remove("Vasja");//method remove(Object)
        System.out.println("element remove = "+res);
        list1.remove(5);//method remove(index)
        System.out.println(list1);
        

    }

}
