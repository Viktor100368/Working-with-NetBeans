/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component("personBean")
public class Person {
    //@Value("${person.name}")
    private String name ;
    //@Value("${person.age}")
    private int age  ;   
    
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
    
    public Person(){
        System.out.println("Person bean is created");
    }
    
    @Autowired
    public Person(@Qualifier("catBean")Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
    
//    @Autowired
//    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person set pet");
        this.pet = pet;
    }
    
    public void callYourPet(){
        System.out.println("Hello my lovle pet");
        pet.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
