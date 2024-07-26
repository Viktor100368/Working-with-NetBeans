/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.collection.arraylist;

import java.util.Objects;

/**
 *
 * @author Victor
 */
public class Student {
    private String name;
    private String sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, String sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", sex=" + sex + ", age=" + age + ", course=" + course + ", avgGrade=" + avgGrade + '}';
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
        if (this.age != other.age) {
            return false;
        }
        if (this.course != other.course) {
            return false;
        }
        if (Double.doubleToLongBits(this.avgGrade) != Double.doubleToLongBits(other.avgGrade)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.sex, other.sex);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.sex);
        hash = 41 * hash + this.age;
        hash = 41 * hash + this.course;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.avgGrade) ^ (Double.doubleToLongBits(this.avgGrade) >>> 32));
        return hash;
    }
    
    
    
}
