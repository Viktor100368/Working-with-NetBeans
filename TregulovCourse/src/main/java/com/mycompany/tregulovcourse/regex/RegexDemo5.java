/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.regex;

import java.util.regex.*;

/**
 *
 * @author Victor
 */
public class RegexDemo5 {
    public static void main(String[] args) {
        String myString = "49503403234524563456356;"
                +  "78789456498465498748748;"
                +  "59987498465489784878945;";
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);
        
        while(matcher.find()){
            System.out.println("cvv = "+matcher.group(7));
        }
        
        String newMyString[] = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)").split(";");
        for(int i=0;i<newMyString.length;i++){
        System.out.println(newMyString[i]);
        }

    }
}
