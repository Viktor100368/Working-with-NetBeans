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
public class PeekDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(45);
        list.add(412);
        list.stream().filter(el->el>6).peek(el->System.out.println(el)).map(el->el%3==0).forEach(System.out::println);
    }
}
