/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate_course.hibernate_one_to_one.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Victor
 */
@Entity
@Table(name="details")
public class Detail implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "phone_number")
    private String phone;
    
    @Column(name = "email")
    private String email;
    
    //для создания one_to_one_bi_direction связи, нужно внести в класс Detail изменения
    //а именно: связываем поле employee класса Detail с полем empDetail класса Employee2
    //указываем каскад
//    @OneToOne(mappedBy="empDetail",
//            cascade = CascadeType.ALL)
      @OneToOne(mappedBy="empDetail",
           cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Employee2 employee;

    public Detail() {
    }

    public Detail(String city, String phone, String email) {
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee2 getEmployee() {
        return employee;
    }

    public void setEmployee(Employee2 employee) {
        this.employee = employee;
    }
    

    @Override
    public String toString() {
        return "Detail{" + "id=" + id + ", city=" + city + ", phone=" + phone + ", email=" + email + '}';
    }
    
    
}
