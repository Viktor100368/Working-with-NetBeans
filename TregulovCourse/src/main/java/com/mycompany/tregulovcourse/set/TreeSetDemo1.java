/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Victor
 */
public class TreeSetDemo1 {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(32);
        System.out.println(treeSet);
        System.out.println("=====================================");
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Anna", 2);
        Student st3 = new Student("Petr", 5);
        Student st4 = new Student("Anton", 2);
        Student st5 = new Student("Semen", 1);
        TreeSet<Student> studentSet = new TreeSet<>((a, b) -> {
            int result = a.course - b.course;
            if (result == 0) {
                result = a.name.compareTo(b.name);
            }
            return result;
        });
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);
        System.out.println(studentSet);
        System.out.println(studentSet.first());
        Student st6 = new Student("Anna", 2);
        Student st7 = new Student("Marija", 4);
        System.out.println(studentSet.headSet(st6));
        System.out.println(studentSet.tailSet(st6));
        System.out.println(studentSet.subSet(st6, st7));
        System.out.println(st2.equals(st6));
        System.out.println(st2.hashCode()== st6.hashCode());
    }
}

class Student {

    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", course=" + course + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + this.course;
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
        return Objects.equals(this.name, other.name);
    }
    

}
