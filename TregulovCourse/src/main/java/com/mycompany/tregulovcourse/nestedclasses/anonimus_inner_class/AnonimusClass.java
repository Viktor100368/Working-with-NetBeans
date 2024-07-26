/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.nestedclasses.anonimus_inner_class;

/**
 *
 * @author Victor
 */
public class AnonimusClass {
    public static void main(String[] args) {
        Math m = new Math(){
            @Override
            public int doOperation(int a,int b){
                return a * b;
            }
        };
        System.out.println(m.doOperation(4,8));
        B b = new B(){
            @Override
            public int sqrt(int a) {
                return a*a*a;
            }            
        };
        System.out.println(b.sqrt(3));
    }
}
interface Math{
    int doOperation(int a,int b);
}
class B{
    public int sqrt(int a){
        return a*a;
    }
}