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
public class ScopeTest {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml")){
            Dog myDog = context.getBean("dogBean",Dog.class);
            Dog yourDog = context.getBean("dogBean",Dog.class);
//            System.out.println("переменные ссылаются на один объект "+(myDog==yourDog));
//            System.out.println(myDog);
//            System.out.println(yourDog);
            myDog.say();
            yourDog.say();
//            myDog.destroy();
//            yourDog.destroy();
                    
        }
    }
}
