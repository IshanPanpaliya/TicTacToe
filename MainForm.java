package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
//    public boolean game;
//    public boolean turn;

    public JPanel getPanel2(){
        return panel2;

    }
//    public void setPlayers(boolean players){
//        this.players = players;
//    }
    public MainForm(boolean players){
        final ArrayList<String>turn= new ArrayList<String>(Arrays.asList("X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X"));

        boolean game;
        game = true;
//        turn = false;
        this.players = players;
        if (players== true){
            titleLabel.setText("You are playing against another player!");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button1.getText().equals("O")) {
                            button1.setText("O");
                            break;
                        } else if (button1.getText().equals("X")){
                            button1.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button1.setText(turn.get(0));
                            turn.remove(0);
                            i++;
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }

                }
            });
//                turn = true;
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button2.getText().equals("O")) {
                            button2.setText("O");
                            break;
                        } else if (button2.getText().equals("X")){
                            button2.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button2.setText(turn.get(0));
                            turn.remove(0);
                            i++;
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }

                }
            });
//                turn = true;
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button3.getText().equals("O")) {
                            button3.setText("O");
                            break;
                        } else if (button3.getText().equals("X")){
                            button3.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button3.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }


                }
            });
//                turn = true;
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button4.getText().equals("O")) {
                            button4.setText("O");
                            break;
                        } else if (button4.getText().equals("X")){
                            button4.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button4.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }

                }
            });
//                turn = true;
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button5.getText().equals("O")) {
                            button5.setText("O");
                            break;
                        } else if (button5.getText().equals("X")){
                            button5.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button5.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }

                }
            });
//                turn = true;
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button6.getText().equals("O")) {
                            button6.setText("O");
                            break;
                        } else if (button6.getText().equals("X")){
                            button6.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button6.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }

                }
            });
//                turn = true;
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button7.getText().equals("O")) {
                            button7.setText("O");
                            break;
                        } else if (button7.getText().equals("X")){
                            button7.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button7.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }

                }
            });
//                turn = true;
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button8.getText().equals("O")) {
                            button8.setText("O");
                            break;
                        } else if (button8.getText().equals("X")){
                            button8.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button8.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }

                }
            });
//                turn = true;
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                        String turn = "X";
//                        button9.setText("O");

                    for (int i = 0; i<1;) {
                        if (button9.getText().equals("O")) {
                            button9.setText("O");
                            break;
                        } else if (button9.getText().equals("X")){
                            button9.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button9.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 1 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 2 wins!");
                    }


                }
            });
        }
        else if (players == false){
            if(turn.get(0) == "X"){
                titleLabel.setText("You are playing against the computer!");
                Random rand = new Random();
                int squares = 9;
                int AI_square = rand.nextInt(squares);
                if (AI_square == 0)
                {
                    for (int i = 0; i<1;) {
                            if (button1.getText().equals("O")) {
                                button1.setText("O");
                                break;
                            } else if (button1.getText().equals("X")){
                                button1.setText("X");
    //                                turn = true;
                                i++;
                            }
                            else {
                                button1.setText(turn.get(0));
                                turn.remove(0);
                                i++;
                            }

                        }
                        if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                            titleLabel.setText("player 2 wins!");
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                            titleLabel.setText("player 1 wins!");
                        }
                }
                else if (AI_square == 1)
                {
                    for (int i = 0; i<1;) {
                            if (button2.getText().equals("O")) {
                                button2.setText("O");
                                break;
                            } else if (button2.getText().equals("X")){
                                button2.setText("X");
    //                                turn = true;
                                i++;
                            }
                            else {
                                button2.setText(turn.get(0));
                                turn.remove(0);
                                i++;
                            }

                        }
                        if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                            titleLabel.setText("player 2 wins!");
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                            titleLabel.setText("player 1 wins!");
                        }
                }
                else if(AI_square == 2)
                {
                    if (button3.getText().equals("O")) {
                                button3.setText("O");
                                break;
                            } else if (button3.getText().equals("X")){
                                button3.setText("X");
    //                                turn = true;
                                i++;
                            }
                            else {
                                button3.setText(turn.get(0));
                                turn.remove(0);
                            }

                        }
                        if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                            titleLabel.setText("player 2 wins!");
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                            titleLabel.setText("player 1 wins!");
                        }
                }
                else if(AI_square == 3)
                {
                    if (button4.getText().equals("O")) {
                                button4.setText("O");
                                break;
                            } else if (button4.getText().equals("X")){
                                button4.setText("X");
    //                                turn = true;
                                i++;
                            }
                            else {
                                button4.setText(turn.get(0));
                                turn.remove(0);
                            }

                        }
                        if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                            titleLabel.setText("player 2 wins!");
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                            titleLabel.setText("player 1 wins!");
                        }
                }
                else if(AI_square == 4)
                {
                    for (int i = 0; i<1;) {
                            if (button5.getText().equals("O")) {
                                button5.setText("O");
                                break;
                            } else if (button5.getText().equals("X")){
                                button5.setText("X");
    //                                turn = true;
                                i++;
                            }
                            else {
                                button5.setText(turn.get(0));
                                turn.remove(0);
                            }

                        }
                        if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                            titleLabel.setText("player 2 wins!");
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                            titleLabel.setText("player 1 wins!");
                        }
                }
                else if(AI_square == 5)
                {
                    for (int i = 0; i<1;) {
                            if (button6.getText().equals("O")) {
                                button6.setText("O");
                                break;
                            } else if (button6.getText().equals("X")){
                                button6.setText("X");
    //                                turn = true;
                                i++;
                            }
                            else {
                                button6.setText(turn.get(0));
                                turn.remove(0);
                            }
                }
                else if (AI_square == 6)
                {
                    for (int i = 0; i<1;) {
                            if (button7.getText().equals("O")) {
                                button7.setText("O");
                                break;
                            } else if (button7.getText().equals("X")){
                                button7.setText("X");
    //                                turn = true;
                                i++;
                            }
                            else {
                                button7.setText(turn.get(0));
                                turn.remove(0);
                            }

                        }
                        if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                            titleLabel.setText("player 2 wins!");
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                            titleLabel.setText("player 1 wins!");
                        }

                }
                else if (AI_square == 7)
                {
                    for (int i = 0; i<1;) {
                            if (button8.getText().equals("O")) {
                                button8.setText("O");
                                break;
                            } else if (button8.getText().equals("X")){
                                button8.setText("X");
    //                                turn = true;
                                i++;
                            }
                            else {
                                button8.setText(turn.get(0));
                                turn.remove(0);
                            }

                        }
                        if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                            titleLabel.setText("player 2 wins!");
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                            titleLabel.setText("player 1 wins!");
                        }
                }}
                else{button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button1.getText().equals("O")) {
                            button1.setText("O");
                            break;
                        } else if (button1.getText().equals("X")){
                            button1.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button1.setText(turn.get(0));
                            turn.remove(0);
                            i++;
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }

                }
            });
//                turn = true;
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button2.getText().equals("O")) {
                            button2.setText("O");
                            break;
                        } else if (button2.getText().equals("X")){
                            button2.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button2.setText(turn.get(0));
                            turn.remove(0);
                            i++;
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }

                }
            });
//                turn = true;
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button3.getText().equals("O")) {
                            button3.setText("O");
                            break;
                        } else if (button3.getText().equals("X")){
                            button3.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button3.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }


                }
            });
//                turn = true;
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button4.getText().equals("O")) {
                            button4.setText("O");
                            break;
                        } else if (button4.getText().equals("X")){
                            button4.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button4.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }

                }
            });
//                turn = true;
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button5.getText().equals("O")) {
                            button5.setText("O");
                            break;
                        } else if (button5.getText().equals("X")){
                            button5.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button5.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }

                }
            });
//                turn = true;
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button6.getText().equals("O")) {
                            button6.setText("O");
                            break;
                        } else if (button6.getText().equals("X")){
                            button6.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button6.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }

                }
            });
//                turn = true;
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button7.getText().equals("O")) {
                            button7.setText("O");
                            break;
                        } else if (button7.getText().equals("X")){
                            button7.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button7.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }

                }
            });
//                turn = true;
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i<1;) {
                        if (button8.getText().equals("O")) {
                            button8.setText("O");
                            break;
                        } else if (button8.getText().equals("X")){
                            button8.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button8.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }

                }
            });
//                turn = true;
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                        String turn = "X";
//                        button9.setText("O");

                    for (int i = 0; i<1;) {
                        if (button9.getText().equals("O")) {
                            button9.setText("O");
                            break;
                        } else if (button9.getText().equals("X")){
                            button9.setText("X");
//                                turn = true;
                            i++;
                        }
                        else {
                            button9.setText(turn.get(0));
                            turn.remove(0);
                        }

                    }
                    if (( button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X"))  || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X"))) {
                        titleLabel.setText("player 2 wins!");
                    }
                    if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O"))  || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O"))  || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O"))) {
                        titleLabel.setText("player 1 wins!");
                    }
}
        }
//        while (game) {
//            if (turn == true) {

//                });
//                turn = false;
//                turn = false;
//            }

//            if (turn == false) {

//                turn = true;
//                turn = true;
//            }
//

//        }


//        }






    }

}
