/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.simpleproga;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Victor
 */
public class Employee implements Cloneable{//implements Comparable<Employee>{

 
    private String name;
    private int salary;
    private Date hiredate;
    

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        hiredate = new Date();
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(int year,int mont ,int day) {
       Date newHiredate= new GregorianCalendar(year,mont-1,day).getTime();
       hiredate.setTime(newHiredate.getTime());
    }
    
    public void reiseSalary(int percentange){
        this.salary = this.salary + this.salary/100*percentange;
    }
    
    @Override
    public Employee clone() throws CloneNotSupportedException{
        Employee clone = (Employee)super.clone();
        clone.hiredate = (Date)hiredate.clone();
        return clone;
    }

//     @Override
//    public int compareTo(Employee o) {
//        //return Double.compare(this.salary,o.salary);
//        return this.salary - o.salary;  
//    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + ", hiredate=" + hiredate + '}';
    }

   
    
    
}

    
