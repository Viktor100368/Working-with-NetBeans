/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Victor
 */
public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(64);
        list.add(23);
        int result = list.stream().reduce((ac,el)->ac* el).get();
        System.out.println(result);
        System.out.println("=======================");
     
        Optional<Integer> o=list.stream().reduce((ac,el)->ac*el);
        if(o.isPresent()){
            System.out.println(o.get());
        }else{
            System.out.println("list100 is null");
        }
        int result2 = list.stream().reduce(1,(ac,el)->ac*el);
        System.out.println("result 2 = "+result);
        int result3 = list.stream().reduce(0,(ac, el)->ac+el);
        System.out.println("result 3 = "+ result3);
    }
}
