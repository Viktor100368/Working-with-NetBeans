/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Victor
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        String s="";
//        s = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("[ABC]");
//         s="QERATBSSEC09D";
//         Pattern pattern1 = Pattern.compile("[ABC]");
        s="ABCOPAB7DOP";
         Pattern pattern1 = Pattern.compile("AB[C-F]OP");
        Matcher matcher = pattern1.matcher(s);
        while(matcher.find()){
            System.out.println("Position "+matcher.start()+ "  " +matcher.group());
        }
                
    }
}
