/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.simpleproga;

import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Victor
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury","Venus","Earth",
            "Mars","Jupiter","Saturn","Uranus","Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in destionary order");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length ");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));
        Timer t = new Timer(1000,event-> System.out.println("The time is "+new Date()));
        t.start();
        JOptionPane.showMessageDialog(null, "Quit programm?");
        System.exit(0);
    }
}
