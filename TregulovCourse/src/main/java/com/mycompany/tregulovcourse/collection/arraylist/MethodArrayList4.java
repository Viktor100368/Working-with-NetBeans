/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.collection.arraylist;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Victor
 */
public class MethodArrayList4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1,sb2,sb3,sb4};
        List<StringBuilder> bilderList = Arrays.asList(array); 
        System.out.println(bilderList);//теперь bilderList тесно связан с array, и все изменения в array
        //будут отражаться и в bilderList
        array[0].append("!!!");
        System.out.println("array - "+Arrays.toString(array));
        System.out.println("bilderList - "+bilderList);
    }
}
