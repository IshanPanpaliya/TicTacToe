package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainForm
{
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
    private JButton[] btnArr;
    public boolean players;

    public JPanel getPanel2()
    {
        return panel2;
    }

    public void playTurn(JButton buttonx){
        ArrayList<String> turn = new ArrayList<String>(Arrays.asList("X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X"));
        for (int i = 0; i < 1; )
        {
            if (buttonx.getText().equals("O"))
            {
                buttonx.setText("O");
                break;
            } else if (buttonx.getText().equals("X"))
            {
                buttonx.setText("X");
                //                                turn = true;
                break;
            } else
            {
                buttonx.setText(turn.get(0));
                turn.remove(0);
                i++;

            }
            if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
            {
                titleLabel.setText("Player 1 wins!");

                break;
            }
            if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
            {
                titleLabel.setText("Player 2 wins!");

                break;
            }
        }
    }

    public MainForm(boolean players){
        ArrayList<String> turn = new ArrayList<String>(Arrays.asList("X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X", "O", "X"));

        this.players = players;
        this.btnArr = new JButton[9];
        btnArr[0] = button1;
        btnArr[1] = button2;
        btnArr[2] = button3;
        btnArr[3] = button4;
        btnArr[4] = button5;
        btnArr[5] = button6;
        btnArr[6] = button7;
        btnArr[7] = button8;
        btnArr[8] = button9;

        if (players == true)
        {
            System.out.println("j");
            titleLabel.setText("You are playing against another player!");
            button1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    playTurn(button1);

                }
            });
//                turn = true;
            button2.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    for (int i = 0; i < 1; )
                    {
                        if (button2.getText().equals("O"))
                        {
                            button2.setText("O");
                            break;
                        } else if (button2.getText().equals("X"))
                        {
                            button2.setText("X");
//                                turn = true;
                            i++;
                        } else
                        {
                            button2.setText(turn.get(0));
                            turn.remove(0);
                            i++;
                        }
                        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
                        {
                            titleLabel.setText("Player 1 wins!");
                            break;
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
                        {
                            titleLabel.setText("Player 2 wins!");
                            break;
                        }
                    }


                }
            });
//                turn = true;
            button3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    for (int i = 0; i < 1; )
                    {
                        if (button3.getText().equals("O"))
                        {
                            button3.setText("O");
                            break;
                        } else if (button3.getText().equals("X"))
                        {
                            button3.setText("X");
//                                turn = true;
                            i++;
                        } else
                        {
                            button3.setText(turn.get(0));
                            turn.remove(0);
                        }
                        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
                        {
                            titleLabel.setText("Player 1 wins!");
                            break;
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
                        {
                            titleLabel.setText("Player 2 wins!");
                            break;
                        }
                    }


                }
            });
//                turn = true;
            button4.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    for (int i = 0; i < 1; )
                    {
                        if (button4.getText().equals("O"))
                        {
                            button4.setText("O");
                            break;
                        } else if (button4.getText().equals("X"))
                        {
                            button4.setText("X");
//                                turn = true;
                            i++;
                        } else
                        {
                            button4.setText(turn.get(0));
                            turn.remove(0);
                        }
                        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
                        {
                            titleLabel.setText("Player 1 wins!");
                            break;
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
                        {
                            titleLabel.setText("Player 2 wins!");
                            break;
                        }
                    }


                }
            });
//                turn = true;
            button5.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    for (int i = 0; i < 1; )
                    {
                        if (button5.getText().equals("O"))
                        {
                            button5.setText("O");
                            break;
                        } else if (button5.getText().equals("X"))
                        {
                            button5.setText("X");
//                                turn = true;
                            i++;
                        } else
                        {
                            button5.setText(turn.get(0));
                            turn.remove(0);
                        }
                        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
                        {
                            titleLabel.setText("Player 1 wins!");
                            break;
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
                        {
                            titleLabel.setText("Player 2 wins!");
                            break;
                        }
                    }


                }
            });
//                turn = true;
            button6.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    for (int i = 0; i < 1; )
                    {
                        if (button6.getText().equals("O"))
                        {
                            button6.setText("O");
                            break;
                        } else if (button6.getText().equals("X"))
                        {
                            button6.setText("X");
//                                turn = true;
                            i++;
                        } else
                        {
                            button6.setText(turn.get(0));
                            turn.remove(0);
                        }
                        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
                        {
                            titleLabel.setText("Player 1 wins!");
                            break;
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
                        {
                            titleLabel.setText("Player 2 wins!");
                            break;
                        }
                    }


                }
            });
//                turn = true;
            button7.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    for (int i = 0; i < 1; )
                    {
                        if (button7.getText().equals("O"))
                        {
                            button7.setText("O");
                            break;
                        } else if (button7.getText().equals("X"))
                        {
                            button7.setText("X");
//                                turn = true;
                            i++;
                        } else
                        {
                            button7.setText(turn.get(0));
                            turn.remove(0);
                        }
                        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
                        {
                            titleLabel.setText("Player 1 wins!");
                            break;
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
                        {
                            titleLabel.setText("Player 2 wins!");
                            break;
                        }
                    }


                }
            });
//                turn = true;
            button8.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    for (int i = 0; i < 1; )
                    {
                        if (button8.getText().equals("O"))
                        {
                            button8.setText("O");
                            break;
                        } else if (button8.getText().equals("X"))
                        {
                            button8.setText("X");
//                                turn = true;
                            i++;
                        } else
                        {
                            button8.setText(turn.get(0));
                            turn.remove(0);
                        }
                        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
                        {
                            titleLabel.setText("Player 1 wins!");
                            break;
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
                        {
                            titleLabel.setText("Player 2 wins!");
                            break;
                        }
                    }


                }
            });
//                turn = true;
            button9.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
//                        String turn = "X";
//                        button9.setText("O");

                    for (int i = 0; i < 1; )
                    {
                        if (button9.getText().equals("O"))
                        {
                            button9.setText("O");
                            break;
                        } else if (button9.getText().equals("X"))
                        {
                            button9.setText("X");
//                                turn = true;
                            i++;
                        } else
                        {
                            button9.setText(turn.get(0));
                            turn.remove(0);
                        }
                        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
                        {
                            titleLabel.setText("Player 1 wins!");
                            break;
                        }
                        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
                        {
                            titleLabel.setText("Player 2 wins!");
                            break;
                        }
                    }


                }
            });
        }
        else if (players == false)
        {
            titleLabel.setText("You are playing against the computer!");
            for(JButton b: btnArr){
                b.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        b.setText(turn.get(0));
                        turn.remove(0);
                        winProcedure();

                        int AIMove = getNextEmpty(btnArr);
                        btnArr[AIMove].setText(turn.get(0));
                        turn.remove(0);
                        winProcedure();
                    }
                });
            } //add action listeners
        }
        if (!button1.getText().equals("") && !button2.getText().equals("") && !button3.getText().equals("") && !button4.getText().equals("") && !button5.getText().equals("") && !button6.getText().equals("") && !button7.getText().equals("") && !button8.getText().equals("") && !button9.getText().equals(""))
        {
            titleLabel.setText("Draw");
        }

    }

    public int getNextEmpty(JButton[] arr){
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].getText().equals("")){
                return i;
            }
        }
        return -1;
    }
    public void winProcedure(){
        if ((button1.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button5.getText().equals("X") && button6.getText().equals("X")) || (button7.getText().equals("X") && button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X") && button8.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button5.getText().equals("X") && button7.getText().equals("X")))
        {
            titleLabel.setText("Player 1 wins!");
            System.exit(0);
        }
        if ((button1.getText().equals("O") && button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button5.getText().equals("O") && button6.getText().equals("O")) || (button7.getText().equals("O") && button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O") && button7.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O") && button8.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button5.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button5.getText().equals("O") && button7.getText().equals("O")))
        {
            titleLabel.setText("Player 2 wins!");
            System.exit(0);
        }
    }
}
if (button1.getText().equals(null)){
            if (button2.getText().equals("X") && button3.getText().equals("X")) || (button4.getText().equals("X") && button7.getText().equals("X")) || (button5.getText().equals("X") && button9.getText().equals("X")){
            button1.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button2.getText().equals(null)){
            else if (button1.getText().equals("X") && button3.getText().equals("X")) || (button5.getText().equals("X") && button8.getText().equals("X"))
        {
            button2.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button3.getText().equals(null)){
            else if (button2.getText().equals("X") && button1.getText().equals("X")) || (button6.getText().equals("X") && button9.getText().equals("X")) || (button5.getText().equals("X") && button6.getText().equals("X"))
        {
            button3.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button4.getText().equals(null)){
            else if (button5.getText().equals("X") && button6.getText().equals("X")) || (button1.getText().equals("X") && button7.getText().equals("X"))
            {
                button4.setText(turn.get(0));
                turn.remove(0);
            }}
        if (button5.getText().equals(null)){
            else if (button4.getText().equals("X") && button6.getText().equals("X")) || (button2.getText().equals("X") && button8.getText().equals("X")) || (button1.getText().equals("X") && button9.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X"))
        {
            button5.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button6.getText().equals(null)){
            else if (button5.getText().equals("X") && button4.getText().equals("X")) || (button3.getText().equals("X") && button9.getText().equals("X"))
        {
            button6.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button7.getText().equals(null)){
            else if (button8.getText().equals("X") && button9.getText().equals("X")) || (button1.getText().equals("X") && button4.getText().equals("X")) || (button5.getText().equals("X") && button3.getText().equals("X"))
        {
            button7.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button8.getText().equals(null)){
            else if (button7.getText().equals("X") && button9.getText().equals("X")) || (button2.getText().equals("X") && button5.getText().equals("X"))
            {
                button8.setText(turn.get(0));
                turn.remove(0);
            }}
        if (button9.getText().equals(null)){
            else if (button8.getText().equals("X") && button7.getText().equals("X")) || (button3.getText().equals("X") && button6.getText().equals("X")) || (button5.getText().equals("X") && button1.getText().equals("X"))
        {
            button9.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button1.getText().equals(null)){
            else if (button2.getText().equals("O") && button3.getText().equals("O")) || (button4.getText().equals("O") && button7.getText().equals("O")) || (button5.getText().equals("O") && button9.getText().equals("O")){
            button1.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button2.getText().equals(null)){
            else if (button1.getText().equals("O") && button3.getText().equals("O")) || (button5.getText().equals("O") && button8.getText().equals("X"))
        {
            button2.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button3.getText().equals(null)){
            else if (button2.getText().equals("O") && button1.getText().equals("O")) || (button6.getText().equals("O") && button9.getText().equals("O")) || (button5.getText().equals("O") && button6.getText().equals("O"))
        {
            button3.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button4.getText().equals(null)){
            else if (button5.getText().equals("X") && button6.getText().equals("O")) || (button1.getText().equals("O") && button7.getText().equals("O"))
        {
            button4.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button5.getText().equals(null)){
            else if (button4.getText().equals("X") && button6.getText().equals("O")) || (button2.getText().equals("O") && button8.getText().equals("O")) || (button1.getText().equals("O") && button9.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O"))
        {
            button5.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button6.getText().equals(null)){
            else if (button5.getText().equals("O") && button4.getText().equals("O")) || (button3.getText().equals("O") && button9.getText().equals("O"))
        {
            button6.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button7.getText().equals(null)){
            else if (button8.getText().equals("O") && button9.getText().equals("O")) || (button1.getText().equals("O") && button4.getText().equals("O")) || (button5.getText().equals("O") && button3.getText().equals("O"))
        {
            button7.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button8.getText().equals(null)){
            else if (button7.getText().equals("O") && button9.getText().equals("O")) || (button2.getText().equals("O") && button5.getText().equals("O"))
        {
            button8.setText(turn.get(0));
            turn.remove(0);
        }}
        if (button9.getText().equals(null)){
            else if (button8.getText().equals("O") && button7.getText().equals("O")) || (button3.getText().equals("O") && button6.getText().equals("O")) || (button5.getText().equals("O") && button1.getText().equals("O"))
        {
            button9.setText(turn.get(0));
            turn.remove(0);
        }}
