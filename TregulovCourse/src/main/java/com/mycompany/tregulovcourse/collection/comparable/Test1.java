/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.collection.comparable;

import com.mycompany.tregulovcourse.collection.comparable.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Victor
 */
public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Anton");
        list.add("Marija");
        System.out.println("list before sorting "+list);
        Collections.sort(list);
        System.out.println("list after sorting "+list);
        System.out.println("==========================");
        
        Employee emp1 = new Employee(10,"Ivan","Petrov",500);
        Employee emp2 = new Employee(43,"Anton","Antonov",750);
        Employee emp3 = new Employee(1,"Marija","Semenova",600);
        Employee emp4 = new Employee(234,"Semen","Ivanov",380);
        Employee emp5 = new Employee(45,"Ivan","Anisimov",550);
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        System.out.println("list employee before sorting");
        for(Employee e:empList){
            System.out.println(e);
        }
        Collections.sort(empList);
        System.out.println("list employee after sorting");
        for(Employee e:empList){
            System.out.println(e);
        }
    }

}
