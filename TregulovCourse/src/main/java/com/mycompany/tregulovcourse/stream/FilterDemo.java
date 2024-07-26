/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class FilterDemo {
    public static void main(String[] args) {
        Utils utils = new Utils();
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
        System.out.println("================================");
        stList.stream().filter(st->st.getAvgGrade()>8.5)
                .filter(st->st.getSex()=='f')
                .filter(st->st.getAge()<30)
               .forEach(System.out::println);
        System.out.println("=================================");
        stList.stream().forEach(utils::myMethod);
    }
    
}
class Utils{
    public  void myMethod(Student s){
        int learning = 5;
        int ostatok =learning - s.getCourse();
        int yearOut = ostatok+s.getAge();
        System.out.println("Student "+s.getName()+ " закончит обучение в "+ yearOut+ " лет, т.е. через "+ostatok+" лет");
    }
}