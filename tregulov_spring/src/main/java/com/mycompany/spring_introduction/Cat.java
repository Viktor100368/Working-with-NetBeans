/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_introduction;

import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component("catBean")

public class Cat implements Pet{
    Cat(){
        System.out.println("Cat bean is created");
    }
    
    @Override
    public void say(){
        System.out.println("Cat say : Meow-Meow");
    }
    
}
