/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring_course_netbeans.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Victor
 */
public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
       try( ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml")){
           Person myPerson = context.getBean("personBean",Person.class);
           myPerson.callYourPet();
       }        
    }
}
