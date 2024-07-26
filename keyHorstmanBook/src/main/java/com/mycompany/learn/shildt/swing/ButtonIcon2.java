/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class ButtonIcon2 {

    JLabel jlab;
    JButton jbtnFirst;
    JButton jbtnSecond;

    ButtonIcon2() {
        ImageIcon myIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\rainbow-clock_50.gif");
        ImageIcon myDisIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\tutti-hourglass (1).gif");
        ImageIcon myRoIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\rainbow-clock_30.gif");
        ImageIcon myPIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\icons8-gif-64 (2).gif");
        JFrame jfrm = new JFrame("Button and Icon 2");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(200, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlab = new JLabel("Press a Button");
        jbtnFirst = new JButton("First", myIcon);
        jbtnSecond = new JButton("Second", myIcon);
        jbtnFirst.setRolloverIcon(myRoIcon);
        jbtnSecond.setRolloverIcon(myRoIcon);
        jbtnFirst.setDisabledIcon(myDisIcon);
        jbtnSecond.setDisabledIcon(myDisIcon);
        jbtnFirst.setPressedIcon(myPIcon);
        jbtnSecond.setPressedIcon(myPIcon);
        jbtnSecond.setMnemonic('s');
        jbtnFirst.setMnemonic('f');
        jbtnFirst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("First")) {
                    jlab.setText("First Button was pressed");
                    if (jbtnSecond.isEnabled()) {
                        
                        jlab.setText("Second Button is disabled");
                        jbtnSecond.setEnabled(false);
                    } else {
                        jlab.setText("Second Button is enabled");
                        jbtnSecond.setEnabled(true);
                    }
                }
            }
        });
        jbtnSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Second")) {
                    jlab.setText("Second Button was perssed");
                }
            }            
        });
        jfrm.getContentPane().add(jlab);
        jfrm.getContentPane().add(jbtnFirst);
        jfrm.getContentPane().add(jbtnSecond);
        jfrm.getRootPane().setDefaultButton(jbtnFirst);
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new ButtonIcon2());
    }
}
