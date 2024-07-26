/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_test.worker_table;

import com.mycompany.hibernate_course.hibernate_test.entity.Worker;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class GetingWorkerFromDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Worker.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            Worker worker = session.get(Worker.class, 1);
            System.out.println(worker);
            session.getTransaction().commit();
            System.out.println("Done!!!!!");
            session = factory.getCurrentSession();
            session.beginTransaction();
            List<Worker> workerList = session.createQuery("from Worker where name = 'Victor'"
                    + "AND age>30")
                    .getResultList();
            session.getTransaction().commit();
            for(Worker w:workerList){
                System.out.println(w);
            }
            System.out.println("Done!!!!!");
        }
        finally{
            session.close();
            factory.close();
        }
    }
    
}
