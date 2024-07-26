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
public class RegexDemo1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscov, Lenin street, 51,Flat 48,"
                + "email: ivanov@mail.ru, Postcode: AA99, Phone      Number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18,"
                + "email: masha@jandex.ru, Postcode:    UKR54, Phone       Number: +987654321;"
                + "Chuck Norris, USA Hollivood, All starts street, 87, Flat 21,"
                + "email: chuck@gmail.com, Postcode          USA23, Phone Number +434532435";
        Pattern pattern;
        //pattern = Pattern.compile("\\w+");//вывлдит все слова и числа
        //pattern = Pattern.compile("\\b\\d{2}\\b"); //все числа из двух цыфр, по краям гранича числа
        //pattern = Pattern.compile("\\+\\d{9}");//номера телефонов
        //pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");//email
        //pattern = Pattern.compile("\\w\\s+\\w");// s - пробельный символ и буквы их обрамлячщиие
        pattern = Pattern.compile("\\D{2,6}");
                
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
        System.out.println(matcher.group());
        }
        
    }
    
}
