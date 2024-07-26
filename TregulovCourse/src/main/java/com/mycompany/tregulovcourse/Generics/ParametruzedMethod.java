/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.Generics;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ParametruzedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(30);
        al.add(10);
        al.add(60);
        System.out.println(GenMethod.genMethod(al));
        ArrayList<String> as = new ArrayList<>();
        as.add("hello");
        as.add("poka");
        as.add("ok");
        String s = GenMethod.genMethod(as);
        System.out.println(s);
    }
    
}

class GenMethod {

    public static <T> T genMethod(ArrayList<T> al) {
        return al.get(1);
    }
}
