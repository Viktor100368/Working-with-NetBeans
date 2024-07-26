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
public class ButtonIcons implements ActionListener {

    JLabel jlab;
    JButton jbtnFirst;
    JButton jbtnSecond;

    ButtonIcons() {
        ImageIcon myIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\rainbow-clock_50.gif");
        ImageIcon myDisIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\tutti-hourglass (1).gif");
        ImageIcon myRoIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\rainbow-clock_30.gif");
        ImageIcon myPIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\icons8-gif-64 (2).gif");
        JFrame jfrm = new JFrame("Image and Icon");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(220, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlab = new JLabel("Press a button");
        jbtnFirst = new JButton("First", myIcon);
        jbtnSecond = new JButton("Second", myIcon);
        jbtnFirst.setRolloverIcon(myRoIcon);
        jbtnSecond.setRolloverIcon(myRoIcon);
        jbtnFirst.setPressedIcon(myPIcon);
        jbtnSecond.setPressedIcon(myPIcon);
        jbtnFirst.setDisabledIcon(myDisIcon);
        jbtnSecond.setDisabledIcon(myDisIcon);
        jbtnSecond.setMnemonic('s');
        jbtnFirst.addActionListener(this);
        jbtnSecond.addActionListener(this);
        jfrm.getContentPane().add(jlab);
        jfrm.getContentPane().add(jbtnFirst);
        jfrm.getContentPane().add(jbtnSecond);
        jfrm.getRootPane().setDefaultButton(jbtnFirst); //активация кнопки по умолчанию
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("First")) {
            jlab.setText("First Button was pressed");
            if (jbtnSecond.isEnabled()) {
                jlab.setText("Second Button was disabled");
                jbtnSecond.setEnabled(false);                
            }else{
                jlab.setText("Second Button was enabled");
                jbtnSecond.setEnabled(true);
            }
        }else{
            jlab.setText("Second Button was pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ButtonIcons());
    }
}
