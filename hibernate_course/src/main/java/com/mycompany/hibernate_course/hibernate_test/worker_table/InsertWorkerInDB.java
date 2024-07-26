/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_test.worker_table;

import com.mycompany.hibernate_course.hibernate_test.entity.Worker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class InsertWorkerInDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Worker.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            Worker worker = new Worker("Victor","Petrov",35,700);
            session.save(worker);
            session.getTransaction().commit();
        }
        finally{
            session.close();
            factory.close();
        }
    }
            
    
}
