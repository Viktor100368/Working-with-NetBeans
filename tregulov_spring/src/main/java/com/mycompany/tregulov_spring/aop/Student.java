/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulov_spring.aop;

/**
 *
 * @author Victor
 */
public class Student {
    private String nameSurname;
    private int course;
    private double avggrade;

    public Student(String nameSurname, int course, double avggrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avggrade = avggrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvggrade() {
        return avggrade;
    }

    public void setAvggrade(double avggrade) {
        this.avggrade = avggrade;
    }

    @Override
    public String toString() {
        return "Student{" + "nameSurname=" + nameSurname + ", course=" + course + ", avggrade=" + avggrade + '}';
    }
    
}
