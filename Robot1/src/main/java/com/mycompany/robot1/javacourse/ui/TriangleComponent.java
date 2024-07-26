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
public class TriangleComponent extends JComponent{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    super.paintComponent(g);
        g.drawLine(5, getHeight() - 10, getWidth()/2 - 5, 5);
        g.drawLine(getWidth()/2 - 5, 5, getWidth() - 10, getHeight() - 10);
        g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);
    }
    
}
