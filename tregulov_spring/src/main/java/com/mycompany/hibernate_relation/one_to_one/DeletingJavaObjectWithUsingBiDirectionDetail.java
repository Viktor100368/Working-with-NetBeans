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
public class DeletingJavaObjectWithUsingBiDirectionDetail {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Detail.class)
                .addAnnotatedClass(Employee1.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            //Detail detail = session.get(Detail.class, 4);
            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();
            System.out.println("Done!");
        }finally{
            session.close();
            factory.close();
        }
    }
}
