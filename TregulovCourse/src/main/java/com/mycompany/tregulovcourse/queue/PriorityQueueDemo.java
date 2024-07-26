/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.queue;

import java.util.Objects;
import java.util.PriorityQueue;

/**
 *
 * @author Victor
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(432);
        priorityQueue.add(1);
        priorityQueue.add(6);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println("======================================");
        
        Student st1 = new Student("Ivan",4);
        Student st2 = new Student("Anton",1);
        Student st3 = new Student("Maria",5);
        Student st4 = new Student("Petr",2);
        Student st5 = new Student("Anna",3);
        PriorityQueue<Student> studentQueue = new PriorityQueue<>();
        studentQueue.add(st1);
        studentQueue.add(st2);
        studentQueue.add(st3);
        studentQueue.add(st4);
        studentQueue.add(st5);
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        System.out.println(studentQueue.remove());
        
    }
}
class Student implements Comparable<Student>{
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
        hash = 53 * hash + this.course;
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
        return this.course == other.course;
    }

 

    @Override
    public int compareTo(Student o) {
       return this.course - o.course;
    }
    
    
}
