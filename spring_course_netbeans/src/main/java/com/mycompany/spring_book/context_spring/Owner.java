/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_book.context_spring;

import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
public class Owner {
    private String name;
    private Parrot parrot;

    public Owner() {
        System.out.println("Class Owner bean created");
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

    @Override
    public String toString() {
        return "Owner{" + "name=" + name + '}';
    }
    
}
