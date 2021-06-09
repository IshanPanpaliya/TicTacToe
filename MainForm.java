package com.company;

import javax.swing.*;

public class MainForm {
    private JLabel titleLabel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel panel2;
    public boolean players;

    public JPanel getPanel2(){
        return panel2;

    }
//    public void setPlayers(boolean players){
//        this.players = players;
//    }
    public MainForm(boolean players){
        this.players = players;
        if (players== true){
            titleLabel.setText("You are playing against another player!");
        }
        else if (players == false){
            titleLabel.setText("You are playing against the computer!");
        }
    }

}
