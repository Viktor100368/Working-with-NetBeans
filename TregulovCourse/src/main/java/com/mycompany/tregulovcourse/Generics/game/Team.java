/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.Generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Victor
 */
public class Team <T extends Participant>{
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    public void addParticipant(T participant){
        participants.add(participant);
        System.out.println("В команду "+name+" был добавлен новый участник по имени "+participant.getName());
    }
    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int win = random.nextInt(2);
        if(win == 0){
            winnerName = this.name;
        }else{
            winnerName = team.name;
        }
        System.out.println("В игре победила команда под названием "+winnerName);
    }
}
