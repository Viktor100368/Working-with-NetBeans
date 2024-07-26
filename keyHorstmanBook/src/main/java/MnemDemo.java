
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor
 */
public class MnemDemo implements ActionListener{
    MnemDemo(){
        JFrame jfrm = new JFrame("Demonstrate Mnemonics");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(250,150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab1 = new JLabel("E-mail adderss");
        JLabel jlab2 = new JLabel ("Name");
        jlab1.setDisplayedMnemonic('e');
        jlab2.setDisplayedMnemonic('n');
        JTextField jtf1 = new JTextField(20);
        JTextField jtf2 = new JTextField(20);
        jtf1.setActionCommand("jtf1");
        jtf2.setActionCommand("jtf2");
        jlab1.setLabelFor(jtf1);
        jlab2.setLabelFor(jtf2);
        JLabel jlab3 = new JLabel("<html>top<br>botom");
        jlab3.setEnabled(false);
        jfrm.getContentPane().add(jlab1);
        jfrm.getContentPane().add(jtf1);
        jfrm.getContentPane().add(jlab2);
        jfrm.getContentPane().add(jtf2);
        jfrm.getContentPane().add(jlab3);
        jfrm.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new MnemDemo());
    }
}
