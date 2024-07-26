/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_book.context_with_annotation_bean;

import com.mycompany.spring_book.context_with_annotation_bean.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Victor
 */
public class Main {
    public static void main(String[] args) {
        
       try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
       Parrot p = context.getBean(Parrot.class);
       String s = context.getBean(String.class);
        System.out.println(p.getName());
        System.out.println(s);
       }
    }
    
}
