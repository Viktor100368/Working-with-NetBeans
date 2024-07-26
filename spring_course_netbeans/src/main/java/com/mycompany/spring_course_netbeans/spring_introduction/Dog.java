/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_course_netbeans.spring_introduction;



/**
 *
 * @author Victor
 */
//@Component
public class Dog implements Pet{
   // private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    

    public Dog() {
        System.out.println("Dog bean is created");
    }
    public void init(){
        System.out.println("Class Dog : init method");
    }
    public void destroy(){
        System.out.println("Class Dog : destroy method");
    }
    
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
