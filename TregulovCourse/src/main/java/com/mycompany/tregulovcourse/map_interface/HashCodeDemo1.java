/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Victor
 */
public class HashCodeDemo1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan","Ivanov",4);
    Student st2 = new Student("Petr","Smirnov",2);
    Student st3 = new Student("Anton","Antonov",4);
    Student st4 = new Student("Nina","Sinicina",4);
    Map<Student,Double> map = new HashMap<>();        
    map.put(st1,8.9);
    map.put(st2,7.8);
    map.put(st3,8.0);
    map.put(st4,9.3);
    
    for(Map.Entry<Student,Double> e:map.entrySet()){
                System.out.println(e);

    }
    
        Student st5 = new Student("Petr","Smirnov",2);
        System.out.println(map.containsKey(st5));
    
    }
    
    
    
}
class Student{// implements Comparable<Student>{
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }
    

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", course=" + course + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.surname);
        hash = 89 * hash + this.course;
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
        final Student other = (Student) obj;
        if (this.course != other.course) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surname, other.surname);
    }

//    @Override
//    public int compareTo(Student o) {
//       int result = this.name.compareTo(o.name);
//       if(result == 0){
//           result = this.surname.compareTo(o.surname);
//       }
//       return result;
//    }
    
    
}