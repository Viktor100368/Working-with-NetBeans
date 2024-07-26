/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Victor
 */
public class MapDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Poka");
        list.add("Kak dela?");
        list.add("ok");
        list.add("fine");
        List<Integer> list2 = list.stream().map(el -> el.length()).toList();
        System.out.println(list2);
        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        System.out.println("=========================");
        int[] array = {2, 4, 7, 5, 56, 7, 8, 5};
        System.out.println(Arrays.toString(array));
        int[] array2 = Arrays.stream(array).map(el -> {
            if (el % 2 == 0) {
                el *= 2;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(array2));
        System.out.println("==========================");
        Set<String> set = new TreeSet<>();
         set.add("Privet");
        set.add("Poka");
        set.add("Kak dela?");
        set.add("ok");
        set.add("fine");
        Set<Integer> newset=set.stream().map(el->el.length()).collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(newset);

    }
}
