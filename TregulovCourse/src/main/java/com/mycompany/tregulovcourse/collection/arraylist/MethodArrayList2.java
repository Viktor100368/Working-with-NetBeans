/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class MethodArrayList2 {
    public static void main(String[] args) {
        Student st1 = new Student("Viktor","m",20,3,8.9);
        Student st2 = new Student("Anton","m",25,5,7.5);
        Student st3 = new Student("Viktorija","f",22,4,9.2);
        Student st4 = new Student("Anna","f",19,1,8.2);
        Student st5 = new Student("Semen","m",28,4,8.0);
        Student st6  = new Student("Viktorija","f",22,4,9.2); 
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);
        for(Student st:listStudent){
            System.out.println(st);
        }
        int index = listStudent.indexOf(st6);//method indexOf()
        System.out.println("index = "+index);
        listStudent.remove(st6);
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        for(Student st:listStudent){
            System.out.println(st);
        }
        
    }
    
}
