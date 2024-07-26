/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_many_bi.entity;

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
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String departmentName;
    @Column(name="max_salary")
    private int maxSalary;
    @Column(name="min_salary")
    private int minSalary;
    
    @OneToMany(cascade=CascadeType.ALL,mappedBy="department",fetch=FetchType.LAZY)
//    @OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST
//            ,CascadeType.REFRESH},mappedBy="department")
    private List<Workman> workmanList;

    public Department() {
    }

    public Department( String departmentName, int maxSalary, int minSalary) {
       
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }
    
    public void addWorkmanToDepartment(Workman workman){
        if(workmanList == null){
            workmanList = new ArrayList();
        }
        workmanList.add(workman);
        workman.setDepartment(this);
    }

    public List<Workman> getWorkmanList() {
        return workmanList;
    }

    public void setWorkmanList(List<Workman> workmanList) {
        this.workmanList = workmanList;
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

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", departmentName=" + departmentName + ", maxSalary=" + maxSalary + ", minSalary=" + minSalary + '}';
    }
    
    
}
