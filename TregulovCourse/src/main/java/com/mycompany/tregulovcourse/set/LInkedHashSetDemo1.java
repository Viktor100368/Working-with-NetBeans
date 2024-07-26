/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.set;

import java.util.LinkedHashSet;

/**
 *
 * @author Victor
 */
public class LInkedHashSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(6);
        lhs.add(2);
        lhs.add(8);
        lhs.add(4);
        lhs.add(1);
        System.out.println(lhs);
        lhs.remove(8);
        System.out.println(lhs);
        System.out.println("contains lhs 8 - "+lhs.contains(8));
    }
}
