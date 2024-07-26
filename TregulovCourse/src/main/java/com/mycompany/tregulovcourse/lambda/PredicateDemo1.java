/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author Victor
 */
public class PredicateDemo1 {
     static void check(ArrayList<Student> al,Predicate<Student> p){
         for(Student s:al){
             if(p.test(s)){
                 System.out.println(s);
             }
         }
     }
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
        check(stList,s->s.getAvgGrade()>8.5);
        System.out.println("==========================");
        check(stList,s->s.getAge()>25 && s.getCourse()>=4 && s.getSex()=='m');
    }
}
