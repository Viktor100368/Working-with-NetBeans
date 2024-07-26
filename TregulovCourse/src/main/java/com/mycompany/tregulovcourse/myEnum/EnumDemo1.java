/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.myEnum;

import static com.mycompany.tregulovcourse.myEnum.WeekDay.FRIDAY;
import static com.mycompany.tregulovcourse.myEnum.WeekDay.MONDAY;
import static com.mycompany.tregulovcourse.myEnum.WeekDay.SATURDAY;
import static com.mycompany.tregulovcourse.myEnum.WeekDay.SUNDAY;
import static com.mycompany.tregulovcourse.myEnum.WeekDay.THURSDAY;
import static com.mycompany.tregulovcourse.myEnum.WeekDay.TUESDAY;
import static com.mycompany.tregulovcourse.myEnum.WeekDay.WEDNESDAY;

/**
 *
 * @author Victor
 */
public class EnumDemo1 {

  
    public static void main(String[] args) {
        Today today = new Today(WeekDay.TUESDAY);
        today.daysInfo();
    }

}

enum WeekDay {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");
    
    private String mood;
    
    WeekDay(String mood){
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
    
}
class Today{
    private WeekDay weekDay;

    public Today(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("idi rabotaj");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("cidi doma");
                break;
        }
        System.out.println("nastroenie v etot den' "+weekDay.getMood());
    }  
}