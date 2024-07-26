/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.map_interface;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Victor
 */
public class TreeMapDemo2 {

    public static void main(String[] args) {
        // TreeMap<Student,Double> treeMap = new TreeMap<>();//если Student имплементит Comparable<Student>, или :
        TreeMap<Student, Double> treeMap = new TreeMap<>((Student o1, Student o2) -> {
            int result = o1.getName().compareTo(o2.getName());
            if (result == 0) {
                result = o1.getSurname().compareTo(o2.getSurname());
            }
            return result;
        });

        Student st1 = new Student("Ivan", "Ivanov", 4);
        Student st2 = new Student("Petr", "Smirnov", 2);
        Student st3 = new Student("Anton", "Antonov", 4);
        Student st4 = new Student("Nina", "Sinicina", 4);
        Student st5 = new Student("Ivana", "Ivanova", 4);
        Student st6 = new Student("Renata", "Smirnova", 2);
        Student st7 = new Student("Anton", "MIchailov", 4);
        Student st8 = new Student("Irina", "Lastochkina", 4);
        treeMap.put(st1, 8.2);
        treeMap.put(st2, 9.2);
        treeMap.put(st3, 8.6);
        treeMap.put(st4, 8.4);
        treeMap.put(st5, 7.3);
        treeMap.put(st6, 7.9);
        treeMap.put(st7, 9.1);
        treeMap.put(st8, 8.5);
        for (Map.Entry<Student, Double> m : treeMap.entrySet()) {
            System.out.println(m);
        }
    }
}
