/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robot1;

import javax.swing.JFrame;

/**
 *
 * @author Victor
 */
public class RobotFrame extends JFrame{
    public RobotFrame(Robot robot){
        setTitle("Robot Frame");
        add(new RobotPathComponent(robot));
        setBounds(100,100,500,500);
    }
}
