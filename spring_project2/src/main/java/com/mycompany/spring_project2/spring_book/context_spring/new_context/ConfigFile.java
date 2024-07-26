/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_project2.spring_book.context_spring.new_context;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Victor
 */
@Configuration
public class ConfigFile {

    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Popka");
        return p;
    }

    @Bean
    Parrot parrot2() {
        Parrot p2 = new Parrot();
        p2.setName("Miki");
        return p2;
    }

    @Bean
    //Person person(Parrot parrot2) {
        Person person(@Qualifier("parrot2")Parrot parrot){        
        Person person = new Person();
        person.setName("Ivan");
        person.setParrot(parrot);
        //person.setParrot(parrot2);
        return person;
    }
}
