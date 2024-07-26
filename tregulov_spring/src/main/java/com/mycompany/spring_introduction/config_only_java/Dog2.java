/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction.config_only_java;

/**
 *
 * @author Victor
 */
public class Dog2 implements Pet{
     private String name;

    public Dog2() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog : init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Dog : destroy method");
//    }

    @Override
    public void say() {
        System.out.println("Dog say : Bow-Wow");
    }
}
