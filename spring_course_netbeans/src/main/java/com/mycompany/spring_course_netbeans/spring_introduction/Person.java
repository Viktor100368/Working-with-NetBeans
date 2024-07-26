/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_course_netbeans.spring_introduction;



import org.springframework.stereotype.Component;



/**
 *
 * @author Victor
 */
@Component("personBean")
public class Person {
    private String surname;
    private int age;
  
    private Pet pet;

   
//    public Person(Pet pet) {
//        System.out.println("person bean is created constructor with argument");
//        this.pet = pet;
//    }
//       public Person() {
//        System.out.println("person bean is created empty constructor");        
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Person set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Perosn set age");
        this.age = age;
    }
       

    public void setPet(Pet pet) {
        System.out.println("class Peson set pet");
        this.pet = pet;
    }
    

    
    public void callYourPet(){
        System.out.println("Hello my lovle Pet");
        pet.say();
    }
}
