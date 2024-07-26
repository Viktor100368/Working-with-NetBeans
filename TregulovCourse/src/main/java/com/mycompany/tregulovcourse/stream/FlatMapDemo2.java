/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class FlatMapDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("Privet");
        list1.add("Poka");
        list1.add("Hello");
        list2.add("Ivan");
        list2.add("Anna");
        list2.add("Semen");
        List<ArrayList<String>> listFull = new ArrayList<>();
        listFull.add(list1);
        listFull.add(list2);
       // list1.stream().map(list->list.toUpperCase()).forEach(System.out::println);
        listFull.stream().flatMap(list->list.stream().map(el->el.toUpperCase())).forEach(System.out::println);
    }
}
