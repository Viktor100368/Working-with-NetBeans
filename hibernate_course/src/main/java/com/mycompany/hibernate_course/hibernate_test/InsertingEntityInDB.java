/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_test;

import com.mycompany.hibernate_course.hibernate_test.entity.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class InsertingEntityInDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
           
            session.beginTransaction();
            List<Employee> list = session.createQuery("from Employee where salary > 800")
                    .getResultList();
            session.getTransaction().commit();
            System.out.println("Done!");
            for(Employee e:list){
                System.out.println(e);
            }
        }finally{
            session.close();
            factory.close();
        }
        
        
        
        
        
        
        
        
        
        
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .buildSessionFactory();
//        Session session = null;
//        try{
//            session = factory.getCurrentSession();
//            Employee emp1 = new Employee("Anton","Antonov","HR",900);
//            session.beginTransaction();
//            session.save(emp1);
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            System.out.println(emp1);
//        }
//        finally{
//            session.close();
//            factory.close();
//        }
    
    }
    
}
