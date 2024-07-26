/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Victor
 */
public class TestStudnet {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
            University university = context.getBean("university", University.class);
            university.addStudent();
            try {
                List<Student> students = university.getStudent();
                for (Student s : students) {
                    System.out.println("studnet : " + s);
                }
            } catch (Exception e) {
                System.out.println("перехватили исключение "+ e);
            }
        }
    }
}
