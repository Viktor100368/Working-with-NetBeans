/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Victor
 */
public class ConfigWithAnnotation {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml")){
          Person person = context.getBean("personBean",Person.class);
            System.out.println("name is "+person.getName());
            System.out.println("age is "+person.getAge());
          person.callYourPet();
        }
    }
    
}
