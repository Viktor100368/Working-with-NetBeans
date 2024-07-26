/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.stream.Stream;

/**
 *
 * @author Victor
 */
public class CountDemo {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,2,3,3,3,4);
       // System.out.println(s.count());
        System.out.println(s.distinct().count());
        
    }
}
