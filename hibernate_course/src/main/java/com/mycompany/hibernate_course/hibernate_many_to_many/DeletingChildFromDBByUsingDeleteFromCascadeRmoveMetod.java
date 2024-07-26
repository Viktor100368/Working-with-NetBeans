/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_many_to_many;

import com.mycompany.hibernate_course.hibernate_many_to_many.entity.Child;
import com.mycompany.hibernate_course.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class DeletingChildFromDBByUsingDeleteFromCascadeRmoveMetod {
        public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try{
            //для правильного удаления(что бы небыло каскадного удаления), нужно
            //убрать из каскада remove, а что бы при insert-е касаадно доьавлялись 
            //записи, нужно изменить session.save() на session.persist().
            session = factory.getCurrentSession();
            session.beginTransaction();
            Section sec = session.get(Section.class, 2);
            session.delete(sec);
            session.getTransaction().commit();
            
        }
        finally{
            session.close();
            factory.close();
        }
    }
}
