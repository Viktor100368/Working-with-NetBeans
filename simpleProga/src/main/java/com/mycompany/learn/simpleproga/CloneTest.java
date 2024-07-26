/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.simpleproga;

/**
 *
 * @author Victor
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("Victor", 500);
            original.setHiredate(2000, 1, 1);
            Employee copy = original.clone();
            copy.reiseSalary(10);
            copy.setHiredate(2004, 12, 23);
            System.out.println("original "+original);
            System.out.println("copy "+copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
    }
}
