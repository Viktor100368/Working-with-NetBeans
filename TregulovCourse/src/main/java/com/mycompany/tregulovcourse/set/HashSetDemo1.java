/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Victor
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ivan");
        set.add("Oleg");
        set.add("Petr");
        set.add("Anna");
        System.out.println(set);
        for(String s:set){
            System.out.println(s);
        }
        set.remove("Oleg");
        System.out.println(set);
        System.out.println("set contains Oleg - "+set.contains("Oleg"));
        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        System.out.println("=========================================");
        HashSet<Integer> hashset1 = new HashSet<>();
        hashset1.add(2);
        hashset1.add(5);
        hashset1.add(1);
        hashset1.add(3);
        hashset1.add(8);
        
        HashSet<Integer>hashset2 = new HashSet<>();
        hashset2.add(7);
        hashset2.add(4);
        hashset2.add(5);
        hashset2.add(3);
        hashset2.add(8);
        System.out.println("hashset1 = "+hashset1);
        System.out.println("hashset2 = "+hashset2);
        HashSet<Integer> union = new HashSet<>(hashset1);
        union.addAll(hashset2);
        System.out.println("union - "+union);
        HashSet<Integer> intersect = new HashSet<>(hashset1);
        intersect.retainAll(hashset2);
        System.out.println("intersect - "+intersect);        
        HashSet<Integer> subtract = new HashSet<>(hashset1);
        subtract.removeAll(hashset2);
        System.out.println("subtract - "+ subtract);
    }
}
