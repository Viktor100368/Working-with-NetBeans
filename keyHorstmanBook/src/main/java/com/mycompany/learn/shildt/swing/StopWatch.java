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
public class StopWatch implements ActionListener{
    long start;
    JLabel jlab;
    JButton jbtnStart;
    JButton jbtnStop;
    StopWatch(){
        JFrame jfrm = new JFrame("Simple StopWatch");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(220, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlab = new JLabel("Press Start to begin timing");
        jbtnStart = new JButton("Start");
        jbtnStop = new JButton("Stop");
        jbtnStart.addActionListener(this);
        jbtnStop.addActionListener(this);
        
        jfrm.getContentPane().add(jbtnStart);
        jfrm.getContentPane().add(jbtnStop);
        jfrm.getContentPane().add(jlab);
        jfrm.setVisible(true);
    }    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar cal = Calendar.getInstance();
       if(e.getActionCommand().equals("Start")){
          start = cal.getTimeInMillis();
          jlab.setText("StopWatch is running...");
       }else if(e.getActionCommand().equals("Stop")){
           jlab.setText("Elapsed time is "+
                   (double)(cal.getTimeInMillis()-start)/1000+" sec");
       }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new StopWatch());
     
    }
}
