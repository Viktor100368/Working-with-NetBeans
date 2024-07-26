/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_many_bi.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Victor
 */
@Entity
@Table(name="workman")
public class Workman implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="salary")
    private int salary;
    
    @ManyToOne(cascade=CascadeType.ALL)
    //@ManyToOne(cascade={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST
   //         ,CascadeType.REFRESH})
    @JoinColumn(name = "department_id")
    private Department department;

    public Workman() {
    }

    public Workman(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

   
    

    @Override
    public String toString() {
        return "Workman{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + '}';
    }

  
    
}
