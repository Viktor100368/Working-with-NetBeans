/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_many_uni;

import com.mycompany.hibernate_course.hibernate_one_to_many_uni.entity.Department1;
import com.mycompany.hibernate_course.hibernate_one_to_many_uni.entity.Workman1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class InsertWorkmanByUsingDepartment {
    public static void main(String[] args) {
        SessionFactory factory  = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department1.class)
                .addAnnotatedClass(Workman1.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            Department1 dep=new Department1("IT",1300,300);
            Workman1 wm1= new Workman1("Anna","Sidorova",900);
            Workman1 wm2 =new Workman1("Sergi","Semenov",1100);
            dep.addWorkmanToDepartment1(wm1);
            dep.addWorkmanToDepartment1(wm2);
            session.beginTransaction();
            session.save(dep);
            session.getTransaction().commit();
            System.out.println("Done!!!");
        }
        finally{
            session.close();
            factory.close();
        }
    }
}
