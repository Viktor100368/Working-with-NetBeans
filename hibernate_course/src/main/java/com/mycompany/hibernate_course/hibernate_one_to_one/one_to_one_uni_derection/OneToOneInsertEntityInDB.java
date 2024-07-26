/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_one.one_to_one_uni_derection;

import com.mycompany.hibernate_course.hibernate_one_to_one.entity.Detail;
import com.mycompany.hibernate_course.hibernate_one_to_one.entity.Employee2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class OneToOneInsertEntityInDB {
    public static void main(String[] args) {
       SessionFactory factory = new Configuration()
               .configure("hibernate.cfg.xml")
               .addAnnotatedClass(Employee2.class)
               .addAnnotatedClass(Detail.class)
               .buildSessionFactory();
       Session session = null;
       try{
           session = factory.getCurrentSession();
           Employee2 emp = new Employee2("Victor","Victorov","Sales",800);
           Detail detail = new Detail("Moscow","04958039456","vic@gmail.com");
           emp.setEmpDetail(detail);
           session.beginTransaction();
           session.save(emp);
           session.getTransaction().commit();
           System.out.println("Done!!!!");
       }
       finally{
           session.close();
           factory.close();
       }
        
    }
    
}
