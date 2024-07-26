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
public class Test {
    public static void main(String[] args) {
    Pattern p = Pattern.compile("[а-яА-ЯёЁ]+");
    Matcher m = p.matcher("фдылвуаоФЫЛВА");
        System.out.println("matches "+m.matches());
        String s = "kjde";
        
    }
    
}
