/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_relation.one_to_one;

import com.mycompany.hibernate_relation.entity.Detail;
import com.mycompany.hibernate_relation.entity.Employee1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class CreateAndSaveJavaObjectToBD {
    public static void main(String[] args) {
      try(SessionFactory factory = new Configuration()
              .addAnnotatedClass(Employee1.class)
              .addAnnotatedClass(Detail.class)
              .configure("hibernate.cfg.xml")
              .buildSessionFactory()){
          
          Session session = factory.getCurrentSession();
          Employee1 emp = new Employee1("Anna","Semenova","Sales",800);
          Detail detail = new Detail("Baku","90345801205","anna@gmail.com");
          emp.setEmpDetail(detail);
          session.beginTransaction();
          session.save(emp);
          session.getTransaction().commit();
          System.out.println("Done!");
      }
    }
}
