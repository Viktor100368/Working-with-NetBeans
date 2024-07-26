/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Victor
 */
public class Test2 {
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
        for(Student s:stList){
            System.out.println(s);
        }
        Collections.sort(stList, (a,b)->a.getAge()-b.getAge());
        System.out.println("===========================");
        for(Student s:stList){
            System.out.println(s);
        }
        Collections.sort(stList,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
              return o1.getCourse()-o2.getCourse();
            }           
        });
        System.out.println("=================================");
        for(Student s:stList){
            System.out.println(s);
        }
    }
       
}
