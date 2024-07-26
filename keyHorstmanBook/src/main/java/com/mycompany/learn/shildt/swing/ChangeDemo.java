/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.FlowLayout;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Victor
 */
public class ChangeDemo {
    JButton jbtn;
    JLabel jlab;
    ChangeDemo(){
        JFrame jfrm = new JFrame("Change Model");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(250, 160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlab = new JLabel();
        jbtn = new JButton("Press for Change event test");
        jbtn.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel mod = jbtn.getModel();
                String wat = "";
                if(mod.isArmed()) wat += "Armed<br>";
                if(mod.isEnabled()) wat += "Enabled<br>";
                if(mod.isPressed()) wat += "Pressed<br>";
                if(mod.isRollover()) wat += "Rollover<br>";
                jlab.setText("<html>Current model:<br>"+wat);
            }
        }); 
        jfrm.getContentPane().add(jbtn);
        jfrm.getContentPane().add(jlab);
        jfrm.getRootPane().setDefaultButton(jbtn);
        jfrm.setVisible(true);

           
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new ChangeDemo());
    }
}
