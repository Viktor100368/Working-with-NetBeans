/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.regex;

/**
 *
 * @author Victor
 */
public class PrintfDemo {
    static String employeeInfo(Employee emp){
//        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
//                emp.getId(),emp.getName(),emp.getSurName(),emp.getSalary()*(1+emp.getBonusPst()));
    String newStr=String.format("%03d \t %-12s \t %-12s \t %,.1f ",
                emp.getId(),emp.getName(),emp.getSurName(),emp.getSalary()*(1+emp.getBonusPst()));
    return newStr;
    
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(13,"Viktor","Petrov",1000500,0.3);
        Employee emp2 = new Employee(1,"Semen","Semenov",1600,0.15);
        Employee emp3 = new Employee(3,"Viktorija","Petrova",1550,0.2);
        System.out.println(employeeInfo(emp1));
        System.out.println(employeeInfo(emp2));
        System.out.println(employeeInfo(emp3));
    }
    
}
class Employee{
    private int id;
    private String name;
    private String surName;
    private int salary;
    private double bonusPst;

    public Employee(int id, String name, String surName, int salary, double bonusPst) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.bonusPst = bonusPst;
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

    public double getBonusPst() {
        return bonusPst;
    }
    
    
}