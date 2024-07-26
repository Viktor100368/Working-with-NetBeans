/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robot1;

/**
 *
 * @author Victor
 */
public class RobotTotal extends Robot{
    private double totalDistance = 0;
    public RobotTotal(double x,double y){
        super(x,y);
    }

    @Override
    void forward(int distance) {
        super.forward(distance); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        totalDistance += distance;
        System.out.println("Robot total");
    }

    public double getTotalDistance() {
        return totalDistance;
    }
    
     
    
}
