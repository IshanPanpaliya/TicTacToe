package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainForm {
    private JLabel titleLabel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel panel2;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    public boolean players;
    public boolean game;
    public boolean turn;

    public JPanel getPanel2(){
        return panel2;

    }
//    public void setPlayers(boolean players){
//        this.players = players;
//    }
    public MainForm(boolean players){
        game = false;
        turn = true;
        this.players = players;
        if (players== true){
            titleLabel.setText("You are playing against another player!");
        }
        else if (players == false){
            titleLabel.setText("You are playing against the computer!");
        }
//        for (turn = true){
        while (turn = true) {
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("O");
                    turn = false;
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button2.setText("O");
                    turn = false;
                }
            });
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button3.setText("O");
                    turn = false;
                }
            });
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button4.setText("O");
                    turn = false;
                }
            });
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button5.setText("O");
                    turn = false;
                }
            });
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button6.setText("O");
                    turn = false;
                }
            });
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button7.setText("O");
                    turn = false;
                }
            });
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button8.setText("O");
                    turn = false;
                }
            });
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button9.setText("O");
                    turn = false;
                }
            });
        }

            while (turn =false){
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = true;
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = false;
                }
            });
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = false;
                }
            });
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = false;
                }
            });
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = false;
                }
            });
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = false;
                }
            });
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = false;
                }
            });
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = false;
                }
            });
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1.setText("X");
                    turn = false;
                }
            });
//            if (button1.getText() == "O" && button2.getText() == "O" && button3.getText() == "O") {
//                game = true;
//                turn
//                titleLabel.setText("gg");
//            }
        }


//        }






    }

}
