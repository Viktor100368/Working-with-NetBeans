/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robot1.javacourse.ui;

import javax.swing.JFrame;
import java.awt.GridLayout;

/**
 *
 * @author Victor
 */
public class ShapeFrame extends JFrame{
    public ShapeFrame(){
        setLayout(new GridLayout(2,3));
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
        add(new OvalComponent());
        add(new RectangleComponent());
        add(new TriangleComponent());
        setBounds(200,200,450,350);
    }
    
}
