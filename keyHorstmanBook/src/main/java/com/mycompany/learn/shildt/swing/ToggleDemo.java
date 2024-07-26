/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class ToggleDemo {
    JLabel jlab;
    JToggleButton jtbn;
    ToggleDemo(){
        JFrame jfrm = new JFrame("Toggle Button");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(280, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlab = new JLabel("Toggle Button is off");
        jtbn  = new JToggleButton("On/Off",false);
        jtbn.addItemListener((ItemEvent e) -> {
            if(jtbn.isSelected()){
                jlab.setText("Button is On");
                jtbn.setText("On");
            }else{
                jlab.setText("Button is Off");
                jtbn.setText("Off");
            }
        });
        jfrm.getContentPane().add(jtbn);
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new ToggleDemo());
    }
        
}
