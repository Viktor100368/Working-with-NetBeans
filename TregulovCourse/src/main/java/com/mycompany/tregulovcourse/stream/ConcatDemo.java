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
public class ConcatDemo {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1,2,3,4,5);
        Stream<Integer> s2 = Stream.of(6,7,8);
        Stream<Integer> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);
    }
}
