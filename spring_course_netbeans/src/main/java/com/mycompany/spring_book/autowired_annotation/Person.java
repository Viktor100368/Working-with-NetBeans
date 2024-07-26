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
public class Person {
    private String name = "Ivan";
   
    private Parrot parrot;

//    public Person(Parrot parrot) {
//        this.parrot = parrot;
//    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
    

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }

 


}
