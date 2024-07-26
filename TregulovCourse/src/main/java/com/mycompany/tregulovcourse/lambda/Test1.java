/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.lambda;

/**
 *
 * @author Victor
 */
public class Test1 {

    public void def(String s, I i) {
        System.out.println(i.abc(s));
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.def("hello dolly", i -> i.length());
        System.out.println("==================");
        t.def("hello dolly", i->i.compareToIgnoreCase("hello DOLLY"));
    }
}

interface I {

    int abc(String s);
}
