/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_one.one_to_one_bi_direction;

import com.mycompany.hibernate_course.hibernate_one_to_one.entity.Detail;
import com.mycompany.hibernate_course.hibernate_one_to_one.entity.Employee2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class DeleteEmployeeByUsingDetail {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee2.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee2 emp = session.get(Employee2.class, 2);
            session.delete(emp);
            session.getTransaction().commit();
            System.out.println("Done!");
        }finally{
            session.close();
            factory.close();
        }
                
    }
    
}
