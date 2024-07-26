/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_many_to_many.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Victor
 */
@Entity
@Table(name="section")
public class Section implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String sectionName;
   // @ManyToMany(cascade = CascadeType.ALL)
    @ManyToMany(cascade={CascadeType.DETACH, CascadeType.MERGE,
        CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name="child_section"
            ,joinColumns = @JoinColumn(name="section_id")
            ,inverseJoinColumns = @JoinColumn(name="child_id"))
    private List<Child> childs;

    public Section() {
    }

    public Section(String sectionName) {
        this.sectionName = sectionName;
    }
    public void addChildToSeciton(Child child){
        if(childs == null){
            childs=new ArrayList();
        }
        childs.add(child);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public List<Child> getChllds() {
        return childs;
    }

    public void setChllds(List<Child> chllds) {
        this.childs = chllds;
    }
    

    @Override
    public String toString() {
        return "Section{" + "id=" + id + ", sectionName=" + sectionName + '}';
    }
    
    
    
}
