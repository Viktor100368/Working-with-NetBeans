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
public class Employee implements Serializable{
    private static final long serialVersionUID = 1;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", department=" + department + ", age=" + age + ", salary=" + salary + ", car=" + car + '}';
    }

    public Car getCar() {
        return car;
    }

    
    
}
