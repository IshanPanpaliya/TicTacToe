package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Font textFont = new Font("Arial", Font.PLAIN, 22);
        JButton bLogin = new JButton("Submit");
        JPanel panel = new JPanel();
        JLabel username = new JLabel("Username:");
        JLabel password = new JLabel("Password:");
        JTextField tUser = new JTextField(15);
        JPasswordField tpass = new JPasswordField(15);
        private Connection con;
        Boolean loggedIn = false;
    }
}
