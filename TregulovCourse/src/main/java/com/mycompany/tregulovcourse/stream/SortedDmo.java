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
public class SortedDmo {
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
        List<Student> st = stList.stream().sorted((a,b)->a.getAge()-b.getAge()).collect(Collectors.toList());
        System.out.println(st);
        st = stList.stream().sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList());
        System.out.println(st);
        
    }
}
