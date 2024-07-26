/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learn.shildt.swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class AlignLabelDemo implements ActionListener{

    AlignLabelDemo(){
        JLabel[] jlabs = new JLabel[9];
        JFrame jfrm = new JFrame("Horizontal and Vertikal alignment");
        jfrm.getContentPane().setLayout(new GridLayout(3,3,4,4));
        jfrm.setSize(500, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabs[0] = new JLabel("left,top",SwingConstants.LEFT);
        jlabs[0].setVerticalAlignment(SwingConstants.TOP);
        jlabs[1] = new JLabel("center, top",SwingConstants.CENTER);
        jlabs[1].setVerticalAlignment(SwingConstants.TOP);
        jlabs[2] = new JLabel("right, top",SwingConstants.RIGHT);
        jlabs[2].setVerticalAlignment(SwingConstants.TOP);
        jlabs[3] = new JLabel("left",SwingConstants.LEFT);
        jlabs[4] = new JLabel("center",SwingConstants.CENTER);
        jlabs[5] = new JLabel("right",SwingConstants.RIGHT);
        jlabs[6] = new JLabel("left , bottom",SwingConstants.LEFT);
        jlabs[6].setVerticalAlignment(SwingConstants.BOTTOM);
        jlabs[7] = new JLabel("center, bottom",SwingConstants.CENTER);
        jlabs[7].setVerticalAlignment(SwingConstants.BOTTOM);
        jlabs[8] = new JLabel("right, bottom",SwingConstants.RIGHT);
        jlabs[8].setVerticalAlignment(SwingConstants.BOTTOM);
        for(int i=0;i<jlabs.length;i++){
            jlabs[i].setBorder(BorderFactory.createEtchedBorder());
        }
        for(int i=0;i<jlabs.length;i++){
            jfrm.getContentPane().add(jlabs[i]);
        }
        JPanel cp = (JPanel)jfrm.getContentPane();
        cp.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
        jfrm.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new AlignLabelDemo());
    }
    
}
