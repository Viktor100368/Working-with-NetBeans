/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor
 */
public class VildCard {
    public static void main(String[] args) {
        VildCard vc = new VildCard();
        List<String> al1 = new ArrayList<>();
        al1.add("privet");
        al1.add("poka");
        al1.add("ok");
        vc.showListInfo(al1);
        
        List<Integer> al2 = new ArrayList<>();
        al2.add(5);
        al2.add(90);
        al2.add(9034);
        vc.showListInfo(al2);
        
        ArrayList<Double> doblList = new ArrayList<>();
        doblList.add(4.90);
        doblList.add(45.1);
        doblList.add(42.4);
        doblList.add(14.0);
        System.out.println(vc.sum(doblList));
        
    }
    public void showListInfo(List<?> al){
        System.out.println("moj list sodergit "+al);
    }
    public double sum(ArrayList<? extends Number>al){
        double sum=0;
        for(Number n:al){
            sum += n.doubleValue();
        }
        return sum;
    }
}
