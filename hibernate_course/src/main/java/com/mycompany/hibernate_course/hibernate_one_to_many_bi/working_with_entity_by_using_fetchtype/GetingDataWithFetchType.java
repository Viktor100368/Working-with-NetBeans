/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_many_bi.working_with_entity_by_using_fetchtype;

import com.mycompany.hibernate_course.hibernate_one_to_many_bi.entity.Department;
import com.mycompany.hibernate_course.hibernate_one_to_many_bi.entity.Workman;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class GetingDataWithFetchType {
    public static void main(String[] args) {
        SessionFactory factory =new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Workman.class)
                .buildSessionFactory();
        Session session = null;
        
        //=============================================
        //используем Eager fetchType в department указываем:
        //  @OneToMany(cascade=CascadeType.ALL,mappedBy="department",fetch=FetchType.EAGER)
        
//        try{
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Department department = session.get(Department.class, 5);
//            System.out.println(department);
//            System.out.println(department.getWorkmanList());
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//        }
//        finally{
//            session.close();
//            factory.close();
//        }

 //=============================================
        //используем LAZY fetchType в department указываем:
        //  @OneToMany(cascade=CascadeType.ALL,mappedBy="department",fetch=FetchType.LAZY)
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class, 5);
            System.out.println(department);
            //чтоб не получить exception при работе с LAZY FetchType
            //нужно сделать небольшой трюк,
            //подгружаем работников так:
            department.getWorkmanList().get(0);
            //теперь exception выброшен не будет
            session.getTransaction().commit();
            System.out.println(department.getWorkmanList());
            System.out.println("Done!!!");
        }
        finally{
            session.close();
            factory.close();
        }
    }
        
}
