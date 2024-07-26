/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 *
 * @author Victor
 */
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger();
        List<Action> friend1 = new ArrayList();
        friend1.add(Action.БУМАГА);
        friend1.add(Action.НОЖНИЦЫ);
        friend1.add(Action.КАМЕНЬ);
        
        List<Action> friend2 = new ArrayList();
        friend2.add(Action.КАМЕНЬ);
        friend2.add(Action.НОЖНИЦЫ);
        friend2.add(Action.БУМАГА);
        new BestFriend("Ivan",exchanger,friend1);
        new BestFriend("Semen",exchanger,friend2);
        
    }
    
}
enum Action{
    КАМЕНЬ,НОЖНИЦЫ,БУМАГА
}
class BestFriend extends Thread{
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> myAction;

    public BestFriend(String name, Exchanger<Action> exchanger, List<Action> myAction) {
        this.name = name;
        this.exchanger = exchanger;
        this.myAction = myAction;
        this.start();
    }
    public void whoWins(Action myAction,Action friendAction){
        if((myAction== Action.БУМАГА && friendAction == Action.КАМЕНЬ) ||
                (myAction== Action.КАМЕНЬ && friendAction == Action.НОЖНИЦЫ) ||
                (myAction == Action.НОЖНИЦЫ && friendAction == Action.БУМАГА)){
            System.out.println(name+" your a winner");
        }else {
            System.out.println("no winners");
        }
    }
    public void run(){
        Action reply;
        for(Action action:myAction){
            try {
                reply = exchanger.exchange(action);
                whoWins(action,reply);
                Thread.sleep(2000);
            } catch (InterruptedException interruptedException) {
            }
        }
    }
    
}
