/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class IconLabelDemo implements ActionListener {
 static JLabel jlabIconTxt2;
    IconLabelDemo() {
        JFrame jfrm = new JFrame("Default Icon and Text label");
        jfrm.getContentPane().setLayout(new GridLayout(4, 1));
        jfrm.setSize(350, 600);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\bear.jpg");
        JLabel jlabIcon = new JLabel(image);
        JLabel jlabIconTxt = new JLabel("this first text",image,SwingConstants.CENTER);
        jlabIconTxt2 = new JLabel("this second text",image,SwingConstants.LEFT);
        jlabIconTxt2.setHorizontalTextPosition(SwingConstants.CENTER);
        jlabIconTxt2.setVerticalTextPosition(SwingConstants.TOP);
       
        JLabel jlabIconTxt3 = new JLabel("this three text",image,SwingConstants.RIGHT);
        jlabIconTxt3.setHorizontalTextPosition(SwingConstants.LEFT);
        jlabIconTxt3.setVerticalTextPosition(SwingConstants.BOTTOM);
        jfrm.getContentPane().add(jlabIcon);
        jfrm.add(jlabIconTxt);
        jfrm.getContentPane().add(jlabIconTxt2);
        jfrm.getContentPane().add(jlabIconTxt3);
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new IconLabelDemo());
       
    try {
        Thread.sleep(3000);
        jlabIconTxt2.setEnabled(false);
    } catch (InterruptedException ex) {
        Logger.getLogger(IconLabelDemo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}
