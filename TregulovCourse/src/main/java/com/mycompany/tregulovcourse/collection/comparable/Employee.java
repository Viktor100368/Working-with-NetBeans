/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.collection.comparable;

/**
 *
 * @author Victor
 */
public class Employee implements Comparable<Employee> {

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
//        if(this.id>o.id)return 1;
//        else if(this.id == o.id)return 0;
//        else return -1;
// можно написать по другому, а именно:
        //  return this.id - o.id;
        //изменим компаратор, будем сортировать по именам

        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surName.compareTo(o.surName);
        }
        return result;
    }
}
