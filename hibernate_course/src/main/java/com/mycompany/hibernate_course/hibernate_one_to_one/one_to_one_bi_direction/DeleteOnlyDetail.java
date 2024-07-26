/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_one.one_to_one_bi_direction;

import com.mycompany.hibernate_course.hibernate_one_to_one.entity.Detail;
import com.mycompany.hibernate_course.hibernate_one_to_one.entity.Employee2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Victor
 */
public class DeleteOnlyDetail {
    public static void main(String[] args) {
        //для того, чтобы удалить только detail, нужно отключить каскадное удаление
        //для этого нужно:изменить
//          @OneToOne(mappedBy="empDetail",
//            cascade = CascadeType.ALL)
//            private Employee2 employee; на
//======================================
//          @OneToOne(mappedBy="empDetail",
//            cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
//            private Employee2 employee;
//          В классе Detail

//=================================================================
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee2.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            Detail dt = session.get(Detail.class, 1);
            //сначала нужно разорвать связь Employee с Detail, иначе foreign key 
            //не позволит сделать это
            dt.getEmployee().setEmpDetail(null);
            //теперь можно спокойно удалить детали
            session.delete(dt);
            session.getTransaction().commit();
            System.out.println("Done!!!!");
        }
        finally{
            session.close();
            factory.close();
        }
    }
    
}
