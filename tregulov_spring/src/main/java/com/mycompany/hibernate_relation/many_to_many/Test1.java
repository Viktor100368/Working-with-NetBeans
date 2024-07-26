/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_relation.many_to_many;

import com.mycompany.hibernate_relation.many_to_many.entity.Child;
import com.mycompany.hibernate_relation.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            //create seciton and insert children
          //  Section section1 = new Section("Football");
           // Child child1 = new Child("Oleg",5);
         //   Child child2 = new Child("Antoshka",4);
            //Child child3 = new Child("Masha",6);
            //section1.addChildrenToSection(child1);
            //section1.addChildrenToSection(child3);
//            
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            section.addChildrenToSection(child2);
//            session.save(section);
//            
//            session.getTransaction().commit();
//            System.out.println("Done!"); 

            //create child ad insert sections
//            Child child = new Child("Vasja",8);
//            Section sec1 = new Section("Chess");
//            Section sec2 = new Section("Driwing");
//            Section sec3 = new Section("Dance");
//            child.addSectionToChild(sec1);
//            child.addSectionToChild(sec2);
//            child.addSectionToChild(sec3);
//            session.beginTransaction();
//            session.save(child);
//            session.getTransaction().commit();
//            System.out.println("Done!");

                //Geting section and all information
//              session.beginTransaction();
//              Section section = session.get(Section.class, 1);
//              System.out.println(section);
//              section.getChildList().get(0);
//              session.getTransaction().commit();
//               System.out.println(section.getChildList());
//              System.out.println("Done!");

                //Geting child and all information
//                session.beginTransaction();
//                Child child = session.get(Child.class,4);
//                System.out.println(child);
//                System.out.println(child.getSectionList());
//                session.getTransaction().commit();
//                System.out.println("Done!");


                //Delete section
//                session.beginTransaction();
//                Section section = session.get(Section.class, 5);
//                session.delete(section);
//                session.getTransaction().commit();
//                System.out.println("Done!");

                //added cascade with using persist
//                Section section = new Section("Football");
//                Child ch1  = new Child("Vitja",10);
//                Child ch2  = new Child("Misha",11);
//                Child ch3  = new Child("Vitalja",9);
//                section.addChildrenToSection(ch1);
//                section.addChildrenToSection(ch2);
//                section.addChildrenToSection(ch3);
//                session.beginTransaction();
//                session.persist(section);
//                session.getTransaction().commit();
//                System.out.println("Done!");

                //delete child
                session.beginTransaction();
                Child child = session.get(Child.class, 4);
                session.delete(child);
                session.getTransaction().commit();
                System.out.println("Done!");
            
        }finally{
            session.close();
            factory.close();
        }
    }
}
