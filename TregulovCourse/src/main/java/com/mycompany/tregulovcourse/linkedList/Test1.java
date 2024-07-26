/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.linkedList;

import java.util.LinkedList;

/**
 *
 * @author Victor
 */
public class Test1 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Anna", 3);
        Student st3 = new Student("Anton", 3);
        Student st4 = new Student("Marija", 3);
        Student st5 = new Student("Oleg", 3);
        LinkedList<Student> listStudent = new LinkedList<>();
        listStudent.add(st1);
        listStudent.add(st2);//method add()
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);
        System.out.println("listStudent - "+ listStudent);
        System.out.println(listStudent.get(1));//method get()
        Student st6 = new Student("Petr", 1);
        listStudent.add(1,st6);// method get() по индексу
        System.out.println(listStudent);
        listStudent.remove(2);//method remove() for index
        System.out.println("listStudent");
        listStudent.remove(st4);//method remove() for object
        System.out.println(listStudent);
    }

}

class Student {

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", course=" + course + '}';
    }

}
