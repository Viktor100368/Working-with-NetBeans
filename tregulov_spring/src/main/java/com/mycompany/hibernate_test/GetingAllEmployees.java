/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_test;

import com.mycompany.hibernate_test.entity.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Victor
 */
public class GetingAllEmployees {
    public static void main(String[] args) {
       try(SessionFactory factory = new Configuration()
               .configure("hibernate.cfg.xml")
               .addAnnotatedClass(Employee.class)
               .buildSessionFactory()){
           
           Session session = factory.getCurrentSession();
           session.beginTransaction();
           List<Employee> emps = session.createQuery("from Employee").getResultList();
           session.getTransaction().commit();
           for(Employee emp : emps){
               System.out.println(emp);
           }
           System.out.println("done!");
       }
    }
}
