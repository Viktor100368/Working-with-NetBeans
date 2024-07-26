/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction.config_only_java;

/**
 *
 * @author Victor
 */
public class Cat2 implements Pet {

    Cat2() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Cat say : Meow-Meow");
    }
}
