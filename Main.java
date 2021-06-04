package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My app");  // create an instance, title in ""
        frame.setContentPane(new StartForm().getPanel1());  // adds the panel
        frame.setSize(800,600);         // set it’s size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(200,100);     // where to place it
        frame.setVisible(true);
    }
}
