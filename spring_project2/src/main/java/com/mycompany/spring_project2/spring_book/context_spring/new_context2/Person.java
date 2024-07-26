/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_project2.spring_book.context_spring.new_context2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
public class Person {
    private String name = "Semen";
    private final Parrot parrot;

    public Person(@Qualifier("parrot1")Parrot parrot) {
        this.parrot = parrot;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

   
    
    
}
