/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.spring_book.context_spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Victor
 */
@Configuration
public class ConfigFile {
    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Popka");
        return p;
    }
    @Bean
    Owner owner(){//(Parrot parrot){
    Owner o = new Owner();
     o.setName("Ivan");
     //o.setParrot(parrot);
     o.setParrot(parrot());
     return o;
    }
    
}
