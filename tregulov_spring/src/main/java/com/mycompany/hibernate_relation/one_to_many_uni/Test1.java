/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_relation.one_to_many_uni;

import com.mycompany.hibernate_relation.one_to_many_uni.entity.Department1;
import com.mycompany.hibernate_relation.one_to_many_uni.entity.Worker1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Worker1.class)
                .addAnnotatedClass(Department1.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            //Cоздание департамета и раюотников
//            Worker1 worker1 = new Worker1("Elena","Mihailova",900);
//            Worker1 worker2 = new Worker1("Alisa","Petrova",850);
//            Department1 dep = new Department1("Sales",300,1200);
//            dep.addWorkerToDepartment(worker1);
//            dep.addWorkerToDepartment(worker2);
//            session.beginTransaction();
//            session.save(dep);            
//            session.getTransaction().commit();
//            System.out.println("Done!");

            //получение департамента и работников
//            session.beginTransaction();
//            Department1 dep = session.get(Department1.class, 2);            
//            System.out.println(dep);
//            System.out.println(dep.getWorkers());
//            session.getTransaction().commit();
//            System.out.println("Done!");

            //Удаление работника и департамента
            session.beginTransaction();
         //   Worker1 worker = session.get(Worker1.class, 3);
         //   session.delete(worker);  
         Department1 dep = session.get(Department1.class, 3);
            session.delete(dep);
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }

}
