/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robot1;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Robot {
    
    private String name;
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    private Operator operator;
    private ArrayList<RobotLine> lines = new ArrayList<>();
    public Robot(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Robot(String name){
        this.name=name;
    }

    

    void forward(int distance) {
        final double xOld = x;
        final double yOld =y;
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.sin(course / 180 * Math.PI);
        lines.add(new RobotLine(xOld,yOld,x,y));
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public ArrayList<RobotLine> getLines(){
        return lines;
    }
    

    @Override
    public String toString() {
        return "Robot{" + "name=" + name + '}';
    }
    

}
