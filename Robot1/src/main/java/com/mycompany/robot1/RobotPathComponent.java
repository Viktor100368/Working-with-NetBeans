/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robot1;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Victor
 */
public class RobotPathComponent extends JComponent{
    private Robot robot;
    
    public RobotPathComponent(Robot robot) {
        this.robot = robot;
    }   

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        for(RobotLine rl:robot.getLines()){
            int x1 = (int)Math.round(rl.getX1());
            int y1 = (int)Math.round(rl.getY1());
            int x2 = (int)Math.round(rl.getX2());
            int y2 = (int)Math.round(rl.getY2());
            g.drawLine(x1, y1, x2, y2);
            
        }
    }
    
}
