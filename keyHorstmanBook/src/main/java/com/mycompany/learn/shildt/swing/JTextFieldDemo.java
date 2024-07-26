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
public class JTextFieldDemo implements ActionListener{
    JTextField jtf;
    JLabel jlab;
    JTextFieldDemo(){
        JFrame jfrm = new JFrame("A text field example");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(220,90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf = new JTextField(10);
        jtf.addActionListener(this);
        jfrm.getContentPane().add(jtf);
        jlab = new JLabel("");
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jlab.setText(jtf.getText());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new JTextFieldDemo());
    }
    
}
