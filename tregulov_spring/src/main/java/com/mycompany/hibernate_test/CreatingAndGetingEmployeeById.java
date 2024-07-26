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
public class CreatingAndGetingEmployeeById {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()){
           
            Employee emp = new Employee("Petr","Marinin","Sales",650);
             Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(emp);
            //session.getTransaction().commit();
            int id = emp.getId();
            //session = factory.getCurrentSession();
            //session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            session.getTransaction().commit();
            System.out.println(employee);
            System.out.println("done!");
        }
    }
}
