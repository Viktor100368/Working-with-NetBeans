/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.IO.SerializationAndDeserialization.Programmer1;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Employee implements Serializable{
    private String name;
    private String department;
    private int age;
   transient private double salary;
    private Car car;

    public Employee(String name, String department, int age, double salary,Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Car getCar() {
        return car;
    }
    

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", department=" + department + ", age=" + age + ", salary=" + salary + "car="+car+'}';
    }
    
    
}
