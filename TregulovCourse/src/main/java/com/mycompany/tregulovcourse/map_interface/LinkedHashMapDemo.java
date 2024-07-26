/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Victor
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student>lhm= new LinkedHashMap<>(16,0.75f,true);
           Student st1 = new Student("Ivan", "Ivanov", 4);
        Student st2 = new Student("Petr", "Smirnov", 2);
        Student st3 = new Student("Anton", "Antonov", 4);
        Student st4 = new Student("Nina", "Sinicina", 4);
       
        
        lhm.put(8.2, st1);
        lhm.put(9.2, st2);
        lhm.put(8.6, st3);
        lhm.put(8.4, st4);
        for(Map.Entry<Double,Student> l:lhm.entrySet()){
        System.out.println(l);
        }
        System.out.println(lhm.get(9.2));
        System.out.println(lhm.get(8.6));
        for(Map.Entry<Double,Student>l:lhm.entrySet()){
        System.out.println(l);
        }
}
}
