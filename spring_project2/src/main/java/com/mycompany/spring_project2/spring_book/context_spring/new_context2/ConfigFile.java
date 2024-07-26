/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_project2.spring_book.context_spring.new_context2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Victor
 */
@Configuration
@ComponentScan(basePackages = "com.mycompany.spring_project2.spring_book.context_spring.new_context2")
public class ConfigFile {
    @Bean
    Parrot parrot1(){
        Parrot p=new Parrot();
        p.setName("Popka");
        return p;
    }
    @Bean
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }
    
}
