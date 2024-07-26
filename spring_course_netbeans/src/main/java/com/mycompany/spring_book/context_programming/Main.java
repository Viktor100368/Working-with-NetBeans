/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_book.context_programming;

import java.util.function.Supplier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Victor
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            Parrot p = new Parrot();
            p.setName("Kiki");
            Supplier<Parrot> parrotSupplier = ()-> p;
             context.registerBean("parrot1",
                Parrot.class,
                parrotSupplier,
                bc -> bc.setPrimary(true));
             Parrot parrot = context.getBean(Parrot.class);
             System.out.println(parrot.getName());
        }
    }
