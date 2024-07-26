/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.lambda;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Victor
 */
public class TestEmplosyee {

    public static double avgOfSome(ArrayList<Employee> al, Function<Employee, Double> f) {
        double result = 0;
        for (Employee e : al) {
            result += f.apply(e);
        }
        return result / al.size();
    }

    public static ArrayList<Employee> checkEmployee(ArrayList<Employee> al, Predicate<Employee> p) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e : al) {
            if (p.test(e)) {
                list.add(e);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Viktor", "Ivanov", 34, 400);
        Employee emp2 = new Employee("Semen", "Petrov", 45, 600);
        Employee emp3 = new Employee("Viktorja", "Ivanova", 33, 500);
        Employee emp4 = new Employee("Anton", "Antonov", 54, 650);
        Employee emp5 = new Employee("Maria", "Smirnova", 23, 450);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println("средний возраст работника = " + avgOfSome(list, emp -> (double) emp.getAge()));
        System.out.println("средняя зарплата работника = " + avgOfSome(list, emp -> (double) emp.getSalary()));
        Predicate<Employee> p = emp->emp.getSalary()>500;
        ArrayList<Employee> l=checkEmployee(list,p);
        System.out.println(l);
    }

}

class Employee implements Comparable<Employee> {

    private String name;
    private String surName;
    private int age;
    private int salary;

    public Employee(String name, String surName, int age, int salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.surName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surName, other.surName);
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surName.compareTo(o.surName);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surName=" + surName + ", age=" + age + ", salary=" + salary + '}';
    }

}
