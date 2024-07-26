/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class ButtonDemo implements ActionListener{
 JLabel jlab;
 
 ButtonDemo(){
  
     JFrame jfrm = new JFrame("A Button Example");
     jfrm.getContentPane().setLayout(new FlowLayout());
     jfrm.setSize(200, 100);
     jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     JButton jbtFirst = new JButton("First");
     JButton jbtSecond = new JButton("Second");
     jlab = new JLabel("Press a Button");
     jbtFirst.addActionListener(this);
     jbtSecond.addActionListener(this);
     jfrm.getContentPane().add(jbtFirst);
     jfrm.getContentPane().add(jbtSecond);
     jfrm.getContentPane().add(jlab);
     jfrm.setVisible(true);
 }

 
 
 
 
 
 
 
 
 
 
 
 
 
// ButtonDemo(){
//     JFrame jfrm = new JFrame("A Button Example");
//     jfrm.getContentPane().setLayout(new FlowLayout());
//     jfrm.setSize(220,90);
//     jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     JButton jbtnFirst = new JButton("First");
//     JButton jbtnSecond = new JButton("Second");
//     jbtnFirst.addActionListener(this);
//     jbtnSecond.addActionListener(this);
//     jlab = new JLabel("Press a Button");
//     
//     jfrm.getContentPane().add(jbtnFirst);
//     jfrm.getContentPane().add(jbtnSecond);
//     jfrm.getContentPane().add(jlab);
//     jfrm.setVisible(true);
//   
// }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equals("First")){
          jlab.setText("A Button First pressed");
      }else if(e.getActionCommand().equals("Second")){
          jlab.setText("A Button Second pressed");
      }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new ButtonDemo());
    }

   
    
}
