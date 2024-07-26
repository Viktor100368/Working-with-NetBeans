/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction.config_only_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Victor
 */
public class Test2 {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile2.class)){
            Person2 person = context.getBean("person",Person2.class);
            person.callYourPet();
            System.out.println(person.getAge());
            System.out.println(person.getName());
        }
    }
}
