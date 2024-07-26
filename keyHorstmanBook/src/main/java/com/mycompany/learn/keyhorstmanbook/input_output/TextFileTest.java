/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class TextFileTest {
    public static void main(String[] args) throws IOException {
        Employee[] staff = new Employee[3];
        
        staff[0]=new Employee("Carl Cracker",75000,LocalDate.of(1987,12,15));
        staff[1]=new Employee("Harry Hacker",50000, LocalDate.of(1989,10,1));
        staff[2]=new Employee("Tony Tester",40000, LocalDate.of(1990,3,15));
      try(PrintWriter out = new PrintWriter("employee.dat","UTF-8")){
          writeData(staff,out);
      }
      try(Scanner in = new Scanner(new FileInputStream("employee.dat"),"UTF-8")){
          Employee[] newStaff = readData(in);
          for(Employee e:newStaff){
              System.out.println(e);
          }
      }
    }
    public static void writeData(Employee[] employees,PrintWriter out )throws IOException{
        out.println(employees.length);
        for(Employee e:employees){
            writeEmployee(out,e);
        }
    }
    private static Employee[] readData(Scanner in){
        int n = in.nextInt();
        in.nextLine();
        Employee[] employees = new Employee[n];
        for(int i=0;i<employees.length;i++){
            employees[i]= readEmployee(in);
        }
        return employees;
    }
    public static void writeEmployee(PrintWriter out,Employee e){
        out.println(e.getName()+"|"+e.getSalary()+"|"+e.getHireDay());
    }
    public static Employee readEmployee(Scanner in){
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        int salary = Integer.parseInt(tokens[1]);
        LocalDate hireDate = LocalDate.parse(tokens[2]);
        int year = hireDate.getYear();
        int month = hireDate.getMonthValue();
        int day = hireDate.getDayOfMonth();
        return new Employee(name,salary,LocalDate.of(year, month,day));
    }
}
