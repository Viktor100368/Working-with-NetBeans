/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Victor
 */
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(5,"Viktor",800);
        Employee emp2 = new Employee(45,"Anton",850);
        Employee emp3 = new Employee(1,"Elena",900);
        Employee emp4 = new Employee(24,"Aleksej",1000);
        Employee emp5 = new Employee(1,"Semen",600);
        Employee emp6 = new Employee(45,"Anton",850);
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(emp1);
        listEmp.add(emp2);
        listEmp.add(emp3);
        listEmp.add(emp4);
        listEmp.add(emp5);
        Collections.sort(listEmp);
        for(Employee e:listEmp){
        System.out.println(e);
        }
        int result = Collections.binarySearch(listEmp,new Employee(45,"Anton",850));
        System.out.println(result);
    }
    
}
