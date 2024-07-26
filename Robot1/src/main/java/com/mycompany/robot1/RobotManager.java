/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.robot1;

import com.mycompany.robot1.Robot;
import com.mycompany.robot1.RobotExt;

import javax.swing.JFrame;

/**
 *
 * @author Victor
 */
public class RobotManager {

    public static void main(String[] args) {
       
      
         // Количество сторон многоугольника
        final int COUNT = 5;
        // Длина стороны
        final int SIDE = 100;
 
        Robot robot = new Robot(200, 50);
        // Создаем замкнутую фигуру с количеством углов COUNT
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }
 
        // Создаем форму для отрисовки пути нашего робота
        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }
}
