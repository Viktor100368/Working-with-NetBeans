/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_many_bi.workingWithDataFromDB;

import com.mycompany.hibernate_course.hibernate_one_to_many_bi.entity.Department;
import com.mycompany.hibernate_course.hibernate_one_to_many_bi.entity.Workman;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class GetingWorkmanAndHisDepartment {
    public static void main(String[] args) {
        SessionFactory factory =  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Workman.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            Workman man= session.get(Workman.class, 3);
            System.out.println(man);
            System.out.println(man.getDepartment());
            session.getTransaction().commit();
            System.out.println("Done!!!");
        }
        finally{
            session.close();
            factory.close();
        }
    }
    
}
