/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslab;

/**
 *
 * @author dharwin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KiloMeter implements ActionListener {
    JFrame frame;
    JLabel l1, l2;
    JTextField tf1, tf2;
    JButton b1;

    KiloMeter() {
        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setTitle("Miles to Kilometers Converter");
        FlowLayout FL = new FlowLayout(FlowLayout.CENTER, 20, 20);
        frame.setLayout(FL);
        Font f = new Font("Verdana", Font.BOLD, 12);
        Dimension d = new Dimension(100, 30);
        l1 = new JLabel("Miles : ", SwingConstants.RIGHT);
        l2 = new JLabel("Kilometers : ", SwingConstants.RIGHT);
        l1.setFont(f);
        l1.setPreferredSize(d);
        l2.setFont(f);
        l2.setPreferredSize(d);
        tf1 = new JTextField("", 12);
        tf2 = new JTextField("", 12);
        tf1.setFont(f);
        tf2.setFont(f);
        b1 = new JButton("Convert");
        b1.setFont(f);
        b1.setPreferredSize(d);
        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(b1);
        b1.addActionListener(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        double m = Double.parseDouble(tf1.getText());
        double km = m * 1.609;
        tf2.setText(Double.toString(km));
    }

    public static void main(String as[]) {
        new KiloMeter();
    }
}