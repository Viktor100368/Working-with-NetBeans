/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Victor
 */
public class MethodArrayList5 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ivan");//method add()
        list1.add("Anton");
        list1.add("Marija");
        list1.add(1, "Anna");//add() по индексу
        list1.add(1, "Misha");
        list1.add(1, "Pasha");
        list1.add(1, "Lena");
        list1.add(1, "Kostja");
        list1.add(1, "Tanja");

        Object[] array = list1.toArray();//method toArray()
        System.out.println("array = " + Arrays.toString(array));
        String[] array2 = list1.toArray(new String[0]);//method toArray() with cast String
        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("==========================");
        List<String> sList = list1.subList(1, 4);//method subList()
        System.out.println("sList  = " + sList);//subList не является отдельным объектом, а лишь представлением list1
        //при этом, любые изменения в list1, можно внести только через sList, иначе будет выброшен Exception
        System.out.println("=====================");
        List<Integer> list10 = List.of(1,2,4,6,7,8);//создается неизменяемый list10 так же не может содержать null
        System.out.println(list10);
        List<String> list20 = List.copyOf(list1);//так же не изменяемый list20 так же не может содержать null
        System.out.println(list20);
        


    }

}
