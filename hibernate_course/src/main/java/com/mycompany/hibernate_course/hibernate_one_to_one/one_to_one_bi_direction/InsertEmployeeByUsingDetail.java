/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_one.one_to_one_bi_direction;

import com.mycompany.hibernate_course.hibernate_one_to_one.entity.Detail;
import com.mycompany.hibernate_course.hibernate_one_to_one.entity.Employee2;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class InsertEmployeeByUsingDetail {

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
            Detail detail = session.get(Detail.class,3);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();
            System.out.println("Done!");
            
            
            
            
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            List<Detail> detailList = session.createQuery("from Detail where city = 'Sverdlovsk'")
//                    .getResultList();
//            for(Detail d:detailList){
//                System.out.println(d.getEmployee()+" - "+d);
//            }
//            session.getTransaction().commit();
//            System.out.println("Done!");
        }finally{
            session.close();
            factory.close();
        }
        
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee2.class)
//                .addAnnotatedClass(Detail.class)
//                .buildSessionFactory();
//        Session session = null;
//        try {
//            session = factory.getCurrentSession();
//                Employee2 emp = new Employee2("NIkolaj","Nikolaev","IT",800);
//                Detail detail = new Detail("Sverdlovsk","8978465489","nikolja@gmail.com");
//                emp.setEmpDetail(detail);
//                detail.setEmployee(emp);
//                session.beginTransaction();
//                session.save(emp);
//                session.getTransaction().commit();
//                System.out.println("Done!");                
//        }finally{
//            session.close();
//            factory.close();
//        }
    }

}
