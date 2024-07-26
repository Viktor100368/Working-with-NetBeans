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
public class RemoveIf {
    static void check(ArrayList<Student> al,Predicate<Student> p){
        for(Student s:al){
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Privet");
        list.add("Poka");
        list.add("ok");
        list.add("Kak dela");
        list.add("Normalno");
        System.out.println(list);
        System.out.println("================");    
        list.removeIf(x->x.length()<=4);
        Predicate<String> p = el->el.length()<7;
        System.out.println(list);
        list.removeIf(p);
        System.out.println(list);
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
        Predicate<Student> p1 = el->el.getAge()>25;
        Predicate<Student> p2 = el->el.getSex()== 'f';
        Predicate<Student> p3 = el->el.getAvgGrade()>8.0;
        Predicate<Student> p4 = p1.and(p2);
        System.out.println("=========================");
        check(stList,p1);
        System.out.println("========================");
        check(stList,p2);
        System.out.println("==========================");
        check(stList,p3);
        System.out.println("=====================");
        check(stList,p4);
    }
}
