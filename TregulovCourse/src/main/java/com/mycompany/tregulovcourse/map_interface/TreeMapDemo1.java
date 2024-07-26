/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.map_interface;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Victor
 */
public class TreeMapDemo1 {

    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Ivan", "Ivanov", 4);
        Student st2 = new Student("Petr", "Smirnov", 2);
        Student st3 = new Student("Anton", "Antonov", 4);
        Student st4 = new Student("Nina", "Sinicina", 4);
        Student st5 = new Student("Ivana", "Ivanova", 4);
        Student st6 = new Student("Renata", "Smirnova", 2);
        Student st7 = new Student("Anton", "MIchailov", 4);
        Student st8 = new Student("Irina", "Lastochkina", 4);
        treeMap.put(8.2, st1);
        treeMap.put(9.2, st2);
        treeMap.put(8.6, st3);
        treeMap.put(8.4, st4);
        treeMap.put(7.3, st5);
        treeMap.put(7.9, st6);
        treeMap.put(9.1, st7);
        treeMap.put(8.5, st8);
        for (Map.Entry<Double, Student> tm : treeMap.entrySet()) {
            System.out.println(tm);
        }
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(8.4));
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.pollLastEntry());
        System.out.println(treeMap.headMap(8.5));

    }
}
