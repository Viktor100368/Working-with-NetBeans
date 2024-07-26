/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.work_with_file.programmer1;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Employee1 implements Serializable{
    private static final long serialVersionUID = 1;
    private String name;
    private String surname;
    private int age;
    private String department;
    private Car car;
  //transient  private double salary;

    public Employee1(String name, String surname, int age, String department, Car car) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.car = car;
    //    this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public Car getCar() {
        return car;
    }

//    public double getSalary() {
//        return salary;
//    }

    @Override
    public String toString() {
        return "Employee1{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", department=" + department + ", car=" + car +'}';
    }
    
}
