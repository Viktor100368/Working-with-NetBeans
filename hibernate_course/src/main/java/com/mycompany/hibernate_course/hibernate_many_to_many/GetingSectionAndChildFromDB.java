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
public class GetingSectionAndChildFromDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try{
            
            session = factory.getCurrentSession();
             session.beginTransaction();
            Section sec = session.get(Section.class, 2);
            System.out.println(sec);
            System.out.println(sec.getChllds());
            
            session.getTransaction().commit();
            System.out.println("Done!!!");
            
            
             //++++++++++++++++++++++++++++++++
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class, 7);
//            System.out.println(child);
//            System.out.println(child.getSections());
//            
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

        }
        finally{
            session.close();
            factory.close();
        }
    }
    
}
