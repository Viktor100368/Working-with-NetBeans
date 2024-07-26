/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction.config_only_java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component("dogBean")
@Scope("singleton")
public class Dog implements Pet {

    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Dog : init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog : destroy method");
    }

    @Override
    public void say() {
        System.out.println("Dog say : Bow-Wow");
    }
}
