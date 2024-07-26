/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class TwoTFDemo implements ActionListener{
        
    JLabel jlab;
    JTextField jtf1;
    JTextField jtf2;
    
    TwoTFDemo(){
        JFrame jfrm = new JFrame("Two text field");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(220,150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);
        jtf1.setActionCommand("One");
        jtf2.setActionCommand("Two");
        jtf1.addActionListener(this);
        jtf2.addActionListener(this);
        jfrm.getContentPane().add(jtf1);
        jfrm.getContentPane().add(jtf2);
        jlab = new JLabel("");
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("One")){
        jlab.setText("text field One: "+jtf1.getText());
        }else if(e.getActionCommand().equals("Two")){
            jlab.setText("text field Two: "+jtf2.getText());
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new TwoTFDemo());
    }
    
}
