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
public class Test4 {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_1.xml")){
            Dog myDog = context.getBean("myPet",Dog.class);
            Dog yourDog = context.getBean("myPet",Dog.class);
            System.out.println("переменные ссылаются на один и тот же объект ? "+(myDog==yourDog));
        }
    }
}
