/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
public class University {
    private List<Student> students = new ArrayList<>();
    
    public void addStudent(){
        Student st1 = new Student("Ivan Petrov",3,8.7);
        Student st2 = new Student("Semen Semenov",1,6.9);
        Student st3 = new Student("Marija Smirnova",4,9.0);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudent(){
        System.out.println("Начало работы метода getStudent");
        System.out.println(students.get(3));
        System.out.println("inform for method getStudent()");
        System.out.println(students);
        return students;
    }
    
}
