package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartForm {
    private JPanel panel1;
    private JLabel titleLabel;
    private JButton singlePlayerButton;
    private JButton multiPlayerButton;

    public JPanel getPanel1(){return panel1;}

    public StartForm(){

        singlePlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("My app");  // create an instance, title in ""
                frame.setContentPane(new MainForm(false).getPanel2());  // adds the panel
                frame.setSize(800,600);         // set it’s size
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocation(200,100);     // where to place it
                frame.setVisible(true);
            }
        });
        multiPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("My app");  // create an instance, title in ""
                frame.setContentPane(new MainForm(true).getPanel2());  // adds the panel
                frame.setSize(800,600);         // set it’s size
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocation(200,100);     // where to place it
                frame.setVisible(true);
            }
        });
    }
}

