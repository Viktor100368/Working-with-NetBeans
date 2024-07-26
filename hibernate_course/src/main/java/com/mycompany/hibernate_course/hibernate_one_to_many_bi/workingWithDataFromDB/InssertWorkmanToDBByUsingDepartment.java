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
public class InssertWorkmanToDBByUsingDepartment {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Workman.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session= factory.getCurrentSession();
            Department dep = new Department("HR",1200,800);
            Workman w1=new Workman("Petr","Petrov",800);
            Workman w2 = new Workman("Ivan","Ivanov",1200);
            Workman w3 = new Workman("Anna","Smirnova",900);
            dep.addWorkmanToDepartment(w1);
            dep.addWorkmanToDepartment(w2);
            dep.addWorkmanToDepartment(w3);
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
