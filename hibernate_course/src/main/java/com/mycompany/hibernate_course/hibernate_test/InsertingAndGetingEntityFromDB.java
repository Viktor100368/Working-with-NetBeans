/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_test;

import com.mycompany.hibernate_course.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class InsertingAndGetingEntityFromDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            Employee emp = new Employee("Semen","Semenov","Sales",840);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            int myId = emp.getId();
            session=factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println("employee = "+employee);
            System.out.println("Done!!!!");
        }finally{
            session.close();
            factory.close();
        }
    }
    
            
    
}
