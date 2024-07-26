/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class TwoTBDemo implements ItemListener {

    JToggleButton jtbnAlpha;
    JToggleButton jtbnBeta;
    JLabel jlabAlpha;
    JLabel jlabBeta;

    TwoTBDemo() {
         ImageIcon myIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\rainbow-clock_50.gif");
        ImageIcon myDisIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\tutti-hourglass (1).gif");
        ImageIcon myRoIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\rainbow-clock_30.gif");
        ImageIcon myPIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\icons8-gif-64 (2).gif");
        ImageIcon mySelIcon = new ImageIcon("C:\\Users\\Victor\\Documents\\picture\\icons8-gif-64.gif");
        JFrame jfrm = new JFrame("Two toggle Button");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(290, 80);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabAlpha = new JLabel("Alpha is off");
        jlabBeta = new JLabel("Beta is off");
        jtbnAlpha = new JToggleButton("Alpha",myIcon);
        jtbnBeta = new JToggleButton("Beta",myIcon);
        jtbnAlpha.setDisabledIcon(myDisIcon);
        jtbnBeta.setDisabledIcon(myDisIcon);
        jtbnAlpha.setPressedIcon(myPIcon);
        jtbnBeta.setPressedIcon(myPIcon);
        jtbnAlpha.setRolloverIcon(myRoIcon);
        jtbnBeta.setRolloverIcon(myRoIcon);
        jtbnAlpha.setSelectedIcon(mySelIcon);
        jtbnBeta.setSelectedIcon(mySelIcon);
        jtbnAlpha.addItemListener(this);
        jtbnBeta.addItemListener(this);
        jfrm.getContentPane().add(jtbnAlpha);
        jfrm.getContentPane().add(jlabAlpha);
        jfrm.getContentPane().add(jtbnBeta);
        jfrm.getContentPane().add(jlabBeta);
        jfrm.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JToggleButton but = (JToggleButton) e.getItem();
        if (but == jtbnAlpha) {
            if (jtbnAlpha.isSelected()) {
                jlabAlpha.setText("Alpha is On");
            } else {
                jlabAlpha.setText("Alpha is Off");
            }
        } else {
            if(jtbnBeta.isSelected()){
                jlabBeta.setText("Beta is On");
            }else{
                jlabBeta.setText("Beta is Off");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TwoTBDemo());
    }

}
