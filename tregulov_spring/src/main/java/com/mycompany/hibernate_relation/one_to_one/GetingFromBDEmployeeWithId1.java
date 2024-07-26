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
public class GetingFromBDEmployeeWithId1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Detail.class)
                .addAnnotatedClass(Employee1.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee1 emp = session.get(Employee1.class, 2);
            session.getTransaction().commit();
            System.out.println(emp);
            //System.out.println(emp.getEmpDetail());
            System.out.println("done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
