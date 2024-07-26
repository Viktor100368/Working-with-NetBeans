/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.learn.simpleproga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Victor
 */
public class SimpleProga {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Anton", 2_100);
        Employee emp2 = new Employee("Vasilij", 1_900);
        Employee emp3 = new Employee("Ivan", 2_146);
       
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);
        System.out.println("==========================");
        
         List<Employee> list2 = new ArrayList<>();
        list2.add(emp1);
        list2.add(emp2);
        list2.add(emp3);
        
        Employee[] staff = new Employee[3];
        staff[0] = emp1;
        staff[1] = emp2;
        staff[2] = emp3;
        Arrays.sort(staff,(x,y)->{
           return x.getName().length()-y.getName().length();            
                });
        for (Employee emp : staff) {
            System.out.println(emp);
        }
        System.out.println("========================");
//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println("========================");
//        Collections.reverse(list);
//        System.out.println(list);
//        if (emp1 instanceof Comparable) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
        System.out.println("============================");
        Collections.sort(list2, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary()- o2.getSalary();
            }
            
        });
        System.out.println("list2 - "+list2);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31));
    }
}
// class SalaryComparator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//      return o2.getSalary()-o1.getSalary();
//    }
//}
