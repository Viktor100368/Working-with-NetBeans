/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Victor
 */
public class CollectDemo {
    public static void main(String[] args) {
          Student st1 = new Student("Ivan",'m',22,3,8.6);
        Student st2 = new Student("Anna",'f',26,3,9.2);
        Student st3 = new Student("Anton",'m',32,4,8.1);
        Student st4 = new Student("Irina",'f',19,3,7.6);
        Student st5 = new Student("Nikolay",'m',20,2,9.0);
        ArrayList<Student> stList = new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);
        List<Integer> courses=stList.stream().mapToInt(el->el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);
        System.out.println("=========================");
                
        Map<Integer,List<Student>> map;
        map=stList.stream().map(el->{
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.groupingBy(el->el.getCourse()));
        for(Map.Entry<Integer,List<Student>> en:map.entrySet()){
            System.out.println(en.getKey()+" "+en.getValue());
        }
        //======================================
        System.out.println("=========================");
        Map<Boolean,List<Student>> map2 = 
             stList.stream().collect(Collectors.partitioningBy(el->el.getAvgGrade()>8.5));
        for(Map.Entry<Boolean,List<Student>> en:map2.entrySet()){
            System.out.println(en.getKey()+" "+en.getValue());
        }
    }
}
