/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.nestedclasses.local_inner_class;

/**
 *
 * @author Victor
 */
public class LocalInner2 {
    public static void main(String[] args) {
        class Slogenie implements Math2{

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }            
        }
        Slogenie slogenie = new Slogenie();
        System.out.println(slogenie.doOperation(5,8));
    }
}
interface Math2{
    int doOperation(int a,int b);
}