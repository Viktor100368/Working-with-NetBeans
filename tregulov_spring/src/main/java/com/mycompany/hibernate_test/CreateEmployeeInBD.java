/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_test;

import com.mycompany.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class CreateEmployeeInBD {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Petr", "Petrov", "driver", 450);
            session.beginTransaction();
            session.save(emp);            
            session.getTransaction().commit();
            System.out.println(emp);
            System.out.println("done");
        }
    }

}
