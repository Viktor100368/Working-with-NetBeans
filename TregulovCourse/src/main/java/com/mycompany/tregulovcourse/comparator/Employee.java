/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.comparator;


/**
 *
 * @author Victor
 */
public class Employee  implements Comparable<Employee>{

    private int id;
    private String name;
    private String surName;
    private int salary;

    public Employee(int id, String name, String surName, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", surName=" + surName + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }
    

}
