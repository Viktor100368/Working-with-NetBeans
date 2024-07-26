/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.vector;

import java.util.Vector;

/**
 *
 * @author Victor
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>() ;
        vector.add("Ivan");
        vector.add("Semen");
        vector.add("Anna");
        vector.add("Anton");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(2));
        vector.remove("Anton");
        System.out.println(vector);
        
    }
}
