/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_project2.spring_book.autowired_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
public class Person {
    private String name = "Ivan";
    //@Autowired
    private Parrot parrot;

    public Person() {
    }

    
    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
        System.out.println("Class Person bean created and Parrot defined");
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

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
    
}
