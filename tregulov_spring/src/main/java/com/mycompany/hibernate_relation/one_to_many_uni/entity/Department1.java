/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_relation.one_to_many_uni.entity;


import com.mycompany.hibernate_relation.one_to_many_uni.entity.Worker1;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Victor
 */
@Entity
@Table(name="departments")
public class Department1 {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String departmentName;
    @Column(name = "min_salary")
    private int minSalary;
    @Column(name = "max_salary")
    private int maxSalary;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private List<Worker1> workers; 

    public Department1() {
    }

    public Department1(String departmentName, int minSalary, int maxSalary) {
        this.departmentName = departmentName;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }
    public void addWorkerToDepartment(Worker1 worker){
        if(workers == null){
            workers = new ArrayList<>();
        }
        workers.add(worker);
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

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public List<Worker1> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker1> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Department1{" + "id=" + id + ", departmentName=" + departmentName + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + '}';
    }
    
    
}
