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
public class GetingEntityWithHQL {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            //получение всех работников
  //          List<Employee> list = session.createQuery("from Employee").getResultList();
            //получение работников по именам
         //   List<Employee> list = session.createQuery("from Employee where name = 'Anna'")
           //         .getResultList();
            //получение данных работника условию
          List<Employee> list = session.createQuery("from Employee where salary > 800")
                  .getResultList();
            session.getTransaction().commit();
                  for(Employee emp : list){
                System.out.println(emp);
                      
            System.out.println("Done!!!!!");
            }
        }finally{
            session.close();
            factory.close();
        }
    }
}
