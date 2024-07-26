/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.stack;

import java.util.Stack;

/**
 *
 * @author Victor
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ivan");
        stack.push("Petr");
        stack.push("Natalia");
        stack.push("Anton");
        System.out.println(stack);
        System.out.println("=========================");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack);
        }     
        
    }
    
}
