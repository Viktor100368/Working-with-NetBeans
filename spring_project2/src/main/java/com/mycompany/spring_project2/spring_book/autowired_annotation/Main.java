/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_project2.spring_book.autowired_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Victor
 */
public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class)){
            Person p = context.getBean(Person.class);
            System.out.println(p.getName());
            System.out.println(p.getParrot());
        }
    }
    
}
