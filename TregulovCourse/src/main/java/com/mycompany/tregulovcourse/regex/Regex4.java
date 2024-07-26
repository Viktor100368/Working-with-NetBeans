/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.regex;

import java.util.regex.Pattern;

/**
 *
 * @author Victor
 */
public class Regex4 {
    public void checkRegex(String ip){

      String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"
              + "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println("ip "+ip+ " is ok? - "+Pattern.matches(regex, ip));
  
    }
    public static void main(String[] args) {
        Regex4 reg = new Regex4();
        String ip1="255.43.192.10";
        String ip2 = "255.263.192.10";
        reg.checkRegex(ip1);    
        reg.checkRegex(ip2);
    }
    
}
