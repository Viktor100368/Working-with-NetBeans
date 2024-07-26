/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.Generics;

/**
 *
 * @author Victor
 */
public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello dolly");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);
        
        Info<Integer> info2 = new Info<>(543);
        System.out.println(info2);
        int i = info2.getValue();
        System.out.println(i);
    }
    
}
class Info<T>{
    private T value;
    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "{["+value+"]}";
    }
    public T getValue(){
        return value;
    }
}