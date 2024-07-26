/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_relation.bi_derctional_one_to_many;

import com.mycompany.hibernate_relation.entity.Department;
import com.mycompany.hibernate_relation.entity.Worker;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class Terst1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Worker.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            //создание департамента и сохраниния в нем работников
//            Department dep = new Department("IT",500,1000);
//            Worker worker1 = new Worker("Ivan","Sidorov",600);
//            Worker worker2 = new Worker("Anna","Ivanova",1000);
//            Worker worker3 = new Worker("Semen", "Petrov",900);
//            dep.addWorkerToDepartment(worker1);
//            dep.addWorkerToDepartment(worker2);
//            dep.addWorkerToDepartment(worker3);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//            System.out.println("Done!");

        //получение из базы департамента и работников
            session.beginTransaction();
            System.out.println("Get department");
            Department dep = session.get(Department.class, 1);
            System.out.println("show department");
            System.out.println(dep);
            System.out.println("show workers of the department");
            dep.getWorkers().get(0);
            session.getTransaction().commit();
             System.out.println(dep.getWorkers());
            System.out.println("Done!");
            

        // получение из базы работника и департамента в котором он работает
//        session.beginTransaction();
//        Worker worker = session.get(Worker.class,1);
//            System.out.println(worker);
//            System.out.println(worker.getDepartment());
//        session.getTransaction().commit();
//            System.out.println("Done!");

            //удаление работника из базы
            //что бы при удалении одного работника не произошло удаление всей имформации
            //нужно в entity классах изменить cascade с ALL на PERSIST ,REFRESH,MERGE,DETACH
            
//            session.beginTransaction();
//            Worker worker = session.get(Worker.class,4);
//            session.delete(worker);
//            session.getTransaction().commit();
//            System.out.println("Done!");
            
        }finally{
            session.close();
            factory.close();
                    
        }
    }
}
