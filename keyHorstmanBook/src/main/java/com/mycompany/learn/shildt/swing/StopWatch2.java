/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class StopWatch2 implements ActionListener{
    JButton jbtn;
    JLabel jlab;
    long start;
    
    StopWatch2(){
        JFrame jfrm = new JFrame("StopWatch 2");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(200, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlab = new JLabel("StopWatch stoping");
        jbtn = new JButton("Start");
        jbtn.addActionListener(this);
        jfrm.getContentPane().add(jlab);
        jfrm.getContentPane().add(jbtn);
        jfrm.setVisible(true);    
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar cal = Calendar.getInstance();
        
        if(e.getActionCommand().equals("Start")){
            start = cal.getTimeInMillis();
            jlab.setText("StopWatch is run.....");
            jbtn.setText("Stop");
        }else if(e.getActionCommand().equals("Stop")){
            jlab.setText("time "+(double)(cal.getTimeInMillis()-start)/1000+" sec");
            jbtn.setText("Start");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new StopWatch2());
    }
}
