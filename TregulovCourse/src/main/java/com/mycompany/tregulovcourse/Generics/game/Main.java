/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.Generics.game;

/**
 *
 * @author Victor
 */
public class Main {

    public static void main(String[] args) {
        Scooler sc1 = new Scooler("Ivan", 14);
        Scooler sc2 = new Scooler("Marina", 12);
        Student st1 = new Student("Anton", 22);
        Student st2 = new Student("Semen", 20);
        Employee emp1 = new Employee("Andrej", 43);
        Employee emp2 = new Employee("Anna", 30);
        Team<Scooler> scoolerTeam1 = new Team("Pilot");
        scoolerTeam1.addParticipant(sc1);
        scoolerTeam1.addParticipant(sc2);
        Team<Student> t2 = new Team("Drakonj");
        t2.addParticipant(st1);
        t2.addParticipant(st2);
        Team<Scooler> scoolerTeam2 = new Team("Parazitj");
        Scooler sc3 = new Scooler("Ivana", 12);
        Scooler sc4 = new Scooler("Maxim", 13);
        scoolerTeam1.playWith(scoolerTeam2);
      
        
    }

}
