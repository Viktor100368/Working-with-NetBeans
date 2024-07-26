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
public class MethodArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ivan");//method add()
        list1.add("Anton");
        list1.add("Marija");
        list1.add("Anna");
        list1.add("Ivan");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ivanka");//method add()
        list2.add("Antoshka");
        list2.add("Marinka"); 
        System.out.println(list2);
        list1.addAll(2,list2);
        System.out.println(list1);
        int index = list1.indexOf("Anton");//method indexOf()
        System.out.println("index = "+index);
        int lastIndex = list1.lastIndexOf("Ivan");//method lastIndexOf()
        System.out.println("lastIndex = "+lastIndex);
        System.out.println("size = "+list1.size());//method size()
//        list1.clear();//method clear()
//        System.out.println(list1);
        boolean isEmpty = list1.isEmpty();//method isEmpty()
        System.out.println("list is empty = "+ isEmpty);
        System.out.println("contains list1 Anton - "+list1.contains("Anton"));
         boolean resut =list1.containsAll(list2);//method containsAll()
        System.out.println("list1 contains All list2 - "+resut);
//        list1.removeAll(list2);//method removeAll()
        list1.retainAll(list2);//method retainAll()
        System.out.println("list1 - "+list1);
       
    }
}
