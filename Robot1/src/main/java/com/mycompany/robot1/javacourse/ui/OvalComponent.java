/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robot1.javacourse.ui;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Victor
 */
public class OvalComponent extends JComponent{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.fillOval(5,5, getWidth() -10, getHeight()-10);
    }
    
    
}
