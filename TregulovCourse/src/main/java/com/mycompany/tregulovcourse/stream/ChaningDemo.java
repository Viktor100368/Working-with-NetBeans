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
public class ChaningDemo {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.6);
        Student st2 = new Student("Anna", 'f', 26, 5, 9.2);
        Student st3 = new Student("Anton", 'm', 32, 4, 8.1);
        Student st4 = new Student("Irina", 'f', 19, 1, 7.6);
        Student st5 = new Student("Nikolay", 'm', 20, 2, 9.0);
        ArrayList<Student> stList = new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);
        stList.stream().map(el->
        {
            el.setName(el.getName().toUpperCase());
            return el;
        }).filter(el -> el.getSex() == 'f')
                .sorted((a,b)->a.getAge()-b.getAge())
                .forEach(el -> System.out.println(el));

    }
}
