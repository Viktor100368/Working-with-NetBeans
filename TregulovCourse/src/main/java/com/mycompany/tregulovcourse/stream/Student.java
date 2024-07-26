/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stream;

import java.util.Objects;

/**
 *
 * @author Victor
 */
public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
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

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.sex;
        hash = 59 * hash + this.age;
        hash = 59 * hash + this.course;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.avgGrade) ^ (Double.doubleToLongBits(this.avgGrade) >>> 32));
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
        if (this.sex != other.sex) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.course != other.course) {
            return false;
        }
        if (Double.doubleToLongBits(this.avgGrade) != Double.doubleToLongBits(other.avgGrade)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
}
