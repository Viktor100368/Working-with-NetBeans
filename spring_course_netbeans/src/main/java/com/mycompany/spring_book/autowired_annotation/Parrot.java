/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_book.autowired_annotation;

import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
public class Parrot {
    private String name = "Koka";

    @Override
    public String toString() {
        return "Parrot{" + "name=" + name + '}';
    }
    
    
}
