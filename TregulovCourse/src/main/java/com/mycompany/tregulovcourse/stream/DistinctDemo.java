/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author Victor
 */
public class DistinctDemo {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,1,1,3,3,4,4,5,5);
        s.distinct().forEach(System.out::println);
             Student st1 = new Student("Ivan", 'm', 22, 3, 8.6);
        Student st2 = new Student("Anna", 'f', 26, 5, 9.2);
        Student st3 = new Student("Anton", 'm', 32, 4, 8.1);
         Student st4 = new Student("Anton", 'm', 32, 4, 8.1);
        Student st5 = new Student("Irina", 'f', 19, 1, 7.6);
        Student st6 = new Student("Irina", 'f', 19, 1, 7.6);
        Student st7 = new Student("Nikolay", 'm', 20, 2, 9.0);
        ArrayList<Student> stList = new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);
        stList.add(st6);
        stList.add(st7);
        stList.stream().distinct().forEach(System.out::println);
    }
}
