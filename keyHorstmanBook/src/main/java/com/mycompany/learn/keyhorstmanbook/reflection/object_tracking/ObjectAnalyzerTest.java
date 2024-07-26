/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.keyhorstmanbook.reflection.object_tracking;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i=1;i<=5;i++){
            squares.add(i*i);            
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
