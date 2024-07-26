/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.binary_search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Victor
 */
public class Test1 {
    public static void main(String[] args) {
        Integer array[] ={2,4,45,67,7,4,76,-34,0,-24};
        List<Integer> list1 =Arrays.asList(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int res = Arrays.binarySearch(array, 45);
        System.out.println(res);
        Collections.sort(list1);
        int request = Collections.binarySearch(list1, -50);
        System.out.println(request);
    }
    
}
