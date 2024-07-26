/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_many_uni.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Victor
 */
@Entity
@Table(name="department")
public class Department1 implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;
    @Column(name="name")
    private String departmentName;
    @Column(name="max_salary")
    private int maxSalary;
    @Column(name="min_salary")
    private int minSalary;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="department_id")
    private List<Workman1> workmanList;

    public Department1() {
    }

    public Department1(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }
    public void addWorkmanToDepartment1(Workman1 wm){
        if(workmanList==null){
            workmanList=new ArrayList();
        }
        workmanList.add(wm);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Workman1> getWorkmanList() {
        return workmanList;
    }

    public void setWorkmanList(List<Workman1> workmanList) {
        this.workmanList = workmanList;
    }

    @Override
    public String toString() {
        return "Department1{" + "id=" + id + ", departmentName=" + departmentName + ", maxSalary=" + maxSalary + ", minSalary=" + minSalary + '}';
    }
    
}
