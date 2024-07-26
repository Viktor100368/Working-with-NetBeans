/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_project2.spring_book.context_spring.test;

import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
public class Parrot {
    private String name ="Popka";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" + "name=" + name + '}';
    }
    
}
