/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.regex;

/**
 *
 * @author Victor
 */
public class RegexDemo4 {
    public static void main(String[] args) {
        String s ="Privet     kak     idet     izuchenie       java                  ?";
     //   s = s.replace("java", "SQL");
    // s = s.replaceAll(" {2,}"," ");
     //s = s.replaceAll("\\bi\\w+", "4444");
     s = s.replaceFirst("\\bi\\w+", "555");
        System.out.println(s);
    }
    
}
