/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_many_to_many;

import com.mycompany.hibernate_course.hibernate_many_to_many.entity.Child;
import com.mycompany.hibernate_course.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class InsertChildtenAndSectionInDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            Section section = new Section("fotbaal");
            Child ch1 = new Child("Vanja",9);
            Child ch2 = new Child("Annja",7);
            Child ch3 = new Child("Oleg",6);
            section.addChildToSeciton(ch1);
            section.addChildToSeciton(ch2);
            section.addChildToSeciton(ch3);
            session.beginTransaction();
            session.save(section);
            session.getTransaction().commit();
            System.out.println("Done!!!");
            //*************************************
//            session = factory.getCurrentSession();
//            Section section1 = new Section("fotbaal");
//            Section section2 = new Section("chess");
//            Section section3 = new Section("dance");
//          
//            Child ch = new Child("Olesja",6);
//            ch.addSectionToChild(section1);
//            ch.addSectionToChild(section2);
//            ch.addSectionToChild(section3);
//            session.beginTransaction();
//            session.save(ch);
//            session.getTransaction().commit();
//            System.out.println("Done!!!"); 


        }
        finally{
            session.close();
            factory.close();
        }
    }
}
