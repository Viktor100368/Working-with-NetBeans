/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.regex;

import java.util.Arrays;

/**
 *
 * @author Victor
 */
public class RegexDemo3 {
    public static void main(String[] args) {
         String s = "Ivanov Vasiliy, Russia, Moscov, Lenin street, 51,Flat 48,"
                + "email: ivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18,"
                + "email: masha@jandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA Hollivood, All starts street, 87, Flat 21,"
                + "email: chuck@gmail.com, Postcode USA23, Phone Number +434532435";
         String s2 = "masha@jandex.ru";
         boolean res = s2.matches("\\w+@\\w+\\.(ru|com)");
         System.out.println("res = "+ res);
         System.out.println("===========================");
         String[] array = s.split(",");
         for(int i=0;i<array.length;i++){
             System.out.println(array[i]);
         }
         
    }
    
}
