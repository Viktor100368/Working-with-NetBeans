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
public class InsertEntryInDBByUsingCascadeButNotRemove {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            Section sec = new Section("football");
            Child ch1 = new Child("Petja",6);
            Child ch2 = new Child("Vanja",5);
            Child ch3 = new Child("Serega",8);
            sec.addChildToSeciton(ch1);
            sec.addChildToSeciton(ch2);
            sec.addChildToSeciton(ch3);
            session.beginTransaction();
            session.persist(sec);
            session.getTransaction().commit();
            System.out.println("Done!!!");
        }
        finally{
            session.close();
            factory.close();
        }
    }
    
}
