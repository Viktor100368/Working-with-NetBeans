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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Victor
 */
public class Coder implements ActionListener {

    JTextField jtfPlain;
    JTextField jtfCoder;
    JLabel jlabPlain;
    JLabel jlabCoder;
    JButton jbtnEncode;
    JButton jbtnDecode;
    JButton jbtnReset;

    Coder() {
        JFrame jfrm = new JFrame("Coding text");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(250, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtfPlain = new JTextField(20);
        jtfCoder = new JTextField(20);
        jtfPlain.setActionCommand("Encode");
        jtfCoder.setActionCommand("Decode");
        jtfPlain.addActionListener(this);
        jtfCoder.addActionListener(this);
        jlabPlain = new JLabel("Enter a plain text");        
        jlabCoder = new JLabel("this show coding text");
        jbtnEncode = new JButton("Encode");
        jbtnDecode = new JButton("Decode");
        jbtnReset = new JButton("Reset");
        jbtnEncode.addActionListener(this);
        jbtnDecode.addActionListener(this);
        jbtnReset.addActionListener(this);
        jfrm.getContentPane().add(jlabPlain);
        jfrm.getContentPane().add(jtfPlain);
        jfrm.getContentPane().add(jlabCoder);
        jfrm.getContentPane().add(jtfCoder);
        jfrm.getContentPane().add(jbtnEncode);
        jfrm.getContentPane().add(jbtnDecode);
        jfrm.getContentPane().add(jbtnReset);
        
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Encode")) {
            char[] s = jtfPlain.getText().toCharArray();
            for(int i=0;i<s.length;i++){
                s[i]=(char)(s[i]+1);
            }
            jtfCoder.setText(new String(s));
        }else if(e.getActionCommand().equals("Decode")){
            char[] s = jtfCoder.getText().toCharArray();
            for(int i=0;i<s.length; i++){
                s[i]= (char)(s[i]-1);
            }
            jtfPlain.setText(new String(s));
        }else if(e.getActionCommand().equals("Reset")){
            jtfPlain.setText("");
            jtfCoder.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new Coder());
    }

}
