/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Victor
 */
public class FindFirstMinMaxAndOther {
    public static void main(String[] args) {
                   Student st1 = new Student("Ivan",'m',22,3,8.6);
        Student st2 = new Student("Anna",'f',26,5,9.2);
        Student st3 = new Student("Anton",'m',32,4,8.1);
        Student st4 = new Student("Irina",'f',19,1,7.6);
        Student st5 = new Student("Nikolay",'m',20,2,9.0);
        ArrayList<Student> stList = new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);
        Student first = stList.stream().filter(el->el.getAge()>23).findFirst().get();
        System.out.println(first);
        Student min = stList.stream().min((a,b)->a.getAge()-b.getAge()).get();
        Student max = stList.stream().max((a,b)->a.getAge()-b.getAge()).get();
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        stList.stream().filter(el->el.getAvgGrade()>8.0).limit(1).forEach(System.out::println);
        stList.stream().filter(el->el.getAvgGrade()>8.0).skip(1).forEach(System.out::println);
        List<Integer> course = stList.stream().mapToInt(el->el.getAge())
        .boxed().collect(Collectors.toList());
        System.out.println(course);
    }
    
}
