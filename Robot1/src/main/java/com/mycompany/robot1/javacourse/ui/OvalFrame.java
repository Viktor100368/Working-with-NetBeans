/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robot1.javacourse.ui;

import javax.swing.JFrame;

/**
 *
 * @author Victor
 */
public class OvalFrame extends JFrame{
    public OvalFrame(){
        OvalComponent oc = new OvalComponent();
        add(oc);
        setBounds(200,200,300,250);
    }
    
}
