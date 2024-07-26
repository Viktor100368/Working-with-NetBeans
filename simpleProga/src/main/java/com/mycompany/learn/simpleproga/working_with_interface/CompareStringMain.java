/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.simpleproga.working_with_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Victor
 */
public class CompareStringMain {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Privet");
        list.add("Poka");
        list.add("kak tebja zovut");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("=====================");
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                    return o2.length()-o1.length();
            }            
        });
        System.out.println("after sorting "+list);
        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
        System.out.println(list);
    }
}
