/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Victor
 */
public class FlatMapDemo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.6);
        Student st2 = new Student("Anna",'f',26,5,9.2);
        Student st3 = new Student("Anton",'m',32,4,8.1);
        Student st4 = new Student("Irina",'f',19,1,7.6);
        Student st5 = new Student("Nikolay",'m',20,2,9.0);
        Faculty f1 = new Faculty("history");
        Faculty f2 = new Faculty("economix");
        f1.addStudentOnFaculty(st1);
        f1.addStudentOnFaculty(st2);
        f1.addStudentOnFaculty(st3);
        f2.addStudentOnFaculty(st4);
        f2.addStudentOnFaculty(st5);
        List<Faculty>facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        facultyList.stream().flatMap(faculty->faculty.getStudentOnFaculty().stream())
                .forEach(el->System.out.println(el.getName()));
    }
}
class Faculty{
    private String name;
    List<Student> studentOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }
    public void addStudentOnFaculty(Student st){
        studentOnFaculty.add(st);
    }
}