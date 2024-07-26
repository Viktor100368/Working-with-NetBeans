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
public class GetingEntityAndUpdateField {

    public static void main(String[] args) {
       SessionFactory factory = new Configuration()
               .configure("hibernate.cfg.xml")
               .addAnnotatedClass(Employee.class)
               .buildSessionFactory();
       Session session = null;
       try{
           session = factory.getCurrentSession();           
        //   Employee emp = new Employee("Elena","Petrova","IT",850);
           session.beginTransaction();
           Employee emp = session.get(Employee.class, 5);
           emp.setSalary(emp.getSalary()+600);
                   
      //     session.save(emp);
            session.createQuery("update Employee set salary = salary * 2 where name = 'Anna'")
                    .executeUpdate();
       //     int my_id = emp.getId();
           session.getTransaction().commit();
//           session = factory.getCurrentSession();
//           session.beginTransaction();
//           Employee employee= session.get(Employee.class, my_id);          
           System.out.println("Done!!!!!");
  //         System.out.println(employee);
       }finally{
           session.close();
           factory.close();
       }

    }
}
