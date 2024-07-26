/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class BorderDemo implements ActionListener{
    BorderDemo(){
        JFrame jfrm = new JFrame("use Line and Etched Border");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(220,90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("The use a Line Border");
        jlab.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel jlab2 = new JLabel("the use a Etched Border");
        jlab2.setBorder(BorderFactory.createEtchedBorder());
        jfrm.getContentPane().add(jlab);
        jfrm.getContentPane().add(jlab2);
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new BorderDemo());
    }
}
