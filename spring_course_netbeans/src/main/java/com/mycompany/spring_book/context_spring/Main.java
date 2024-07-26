/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_book.context_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Victor
 */
public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class)){
         Parrot p = context.getBean(Parrot.class);
         Owner o = context.getBean(Owner.class);
            System.out.println(p.getName());
            System.out.println(o.getName());
            System.out.println("owner + parrot "+o.getParrot());
        }
    }
}
