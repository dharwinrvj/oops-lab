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
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingSnowMan extends JFrame {
    JButton lefttbt = new JButton("Left");
    JButton toptbt = new JButton("Top");
    JButton botbt = new JButton("Bottom");
    JButton rightbt = new JButton("Right");
    SnowmanPane mainPanel = new SnowmanPane();// private int xPos;

    public MovingSnowMan() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(lefttbt);
        buttonPanel.add(toptbt);
        buttonPanel.add(botbt);
        buttonPanel.add(rightbt);
        mainPanel.setBackground(Color.BLACK);
        this.add(mainPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);
        lefttbt.addActionListener(new ButtonListener());
        rightbt.addActionListener(new ButtonListener());
        toptbt.addActionListener(new ButtonListener());
        botbt.addActionListener(new ButtonListener());
    }

    public static void main(String args[]) {
        MovingSnowMan window = new MovingSnowMan();
        window.setTitle("Moving a ball");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Don't pack here. Instead return a preferred size forthe
        // custom comonent end..
        // window.setSize(300, 200);
        // ..pack() the window.
        window.pack();
        window.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent buttonPressed) {
            if (buttonPressed.getSource() == lefttbt) {
                mainPanel.left();
            } else if (buttonPressed.getSource() == rightbt) {
                mainPanel.right();
            } else if (buttonPressed.getSource() == toptbt) {
                mainPanel.up();
            } else if (buttonPressed.getSource() == botbt) {
                mainPanel.down();
            }
        }
    }

    class SnowmanPane extends JPanel {
        int xPos = -1;
        int yPos = -1;
        Dimension preferredSize = new Dimension(600, 600);

        public void left() {
            xPos -= 5;
            repaint();
        }

        public void right() {
            xPos += 5;
            repaint();
        }

        public void up() {
            yPos -= 5;
            repaint();
        }

        public void down() {
            yPos += 5;
            repaint();
        }

        @Override
        public Dimension getPreferredSize() {
            return preferredSize;
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (xPos < 0 || yPos < 0) {
                xPos = getWidth() / 2;
                yPos = getHeight() / 2;
            }
            // setBackground(new Color(0, 0, 0));
            g.setColor(Color.WHITE);
            // head
            g.fillOval(xPos - 20, yPos - 60, 40, 40);
            // upper body
            g.fillOval(xPos - 35, yPos - 25, 70, 50);// lower body
            g.fillOval(xPos - 50, yPos + 20, 100, 60);
            g.setColor(Color.black);
            // left eye
            g.fillOval(xPos - 10, yPos - 50, 5, 5);
            // right eye
            g.fillOval(xPos + 5, yPos - 50, 5, 5);
            // smile
            g.drawArc(xPos - 10, yPos - 40, 20, 10, 190, 160);
            g.setColor(Color.ORANGE);
            // left arm
            g.drawLine(xPos - 25, yPos, xPos - 50, yPos - 20);
            // right arm
            g.drawLine(xPos + 25, yPos, xPos + 55, yPos);
            // brim of hat
            g.drawLine(xPos - 20, yPos - 55, xPos + 20, yPos - 55);
            // hat
            g.fillRect(xPos - 15, yPos - 80, 30, 25);
        }
    }
}