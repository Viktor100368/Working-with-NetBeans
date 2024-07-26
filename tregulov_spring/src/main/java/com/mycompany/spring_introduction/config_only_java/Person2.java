/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction.config_only_java;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author Victor
 */
public class Person2 {
    
    @Value("${person.name}")
        private String name ;
    @Value("${person.age}")
    private int age  ;   
    

    private Pet pet;
    
    public Person2(){
        System.out.println("Person bean is created");
    }
    

    
    public Person2(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
    

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
