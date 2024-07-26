/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robot1;

/**
 *
 * @author Victor
 */
public class RobotExt extends Robot{
  
    public RobotExt(double x,double y,double course){
        super(x,y);
        setCourse(course);
    }
    public void back(int distance){
        forward(-distance);
    }
    
}
