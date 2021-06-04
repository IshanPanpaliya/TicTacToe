package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class LoginPage {
    private JButton enterButton;
    private JTextField usernameTF;
    private JTextField passwordTF;
    private JLabel usernameLabel;
    private JPanel panel1;
    private  JLabel passwordLabel;
    private JLabel welcomeLabel;
    private JLabel welcome2Label;
    private JPanel panel2;
    private JLabel titleLabel;
    private Connection con;
    private JLabel loginLabel;
    MainMenu newM = new MainMenu();

    public MainMenu getNewM() {
        return newM;
    }
//
//    public static void setConnection(Connection con) {
//        con = connect();
//    }


    public JPanel getPanel1() {
        return panel1;
    }
//    public static void newPage (JFrame frame, JPanel panel1){
//        if (!panel1.isVisible())
//            frame.setContentPane(new MainPage().getPanel2());
//    }

    public boolean isShown (JPanel panel1){
        if (panel1.isVisible()){
            return true;
        }
        else {
            return false;
        }
    }




//    public Connection connect(){
//        String url = "jdbc:postgresql://localhost:5432/KennelDB";
//        String user = "postgres";
//        String password = "Rafanadal18";
//
//        try {
//            Connection c = DriverManager.getConnection(url, user, password);
//            Statement st = c.createStatement();
//            ResultSet rs = st.executeQuery("SELECT VERSION()");
//            if (rs.next()) {
//                System.out.println(rs.getString(1));
//            }
//            return c;
//        } catch (SQLException ex) {
//            System.out.println("SQL Driver error");
//            return null;
//        }
//
//        try {
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("select * from public.\"Students\";");
//            rs.next();
//            usernameLabel.setText(rs.getString("ITEM"));
//        } catch (SQLException ex){
//            System.out.println("SQL error");
//        }
//    }
public LoginPage() {
    //con = connect();  // returns null
    //LoginPage.setConnection(con);

    enterButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

                if (usernameTF.getText().equals("Prithvi") && passwordTF.getText().equals("Rangaswami")) {
                    welcome2Label.hide();
                    JFrame frame = new JFrame("My app");  // create an instance, title in ""
                    frame.setContentPane(newM.getPanel3());  // adds the panel
                    frame.setSize(800,600);         // set it’s size
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLocation(200,100);     // where to place it
                    frame.setVisible(true);
                }
                else if (usernameTF.getText().equals("") && passwordTF.getText().equals("")){
                    welcomeLabel.setForeground(Color.red);
                    welcome2Label.setForeground(Color.red);
                    welcomeLabel.setText("Please enter a username");
                    welcome2Label.setText("and password");
                }
                else if (usernameTF.getText().equals("")){
                    welcomeLabel.setForeground(Color.red);
                    welcome2Label.hide();
                    welcomeLabel.setText("Please enter a username");
                }
                else if (passwordTF.getText().equals("")){
                    welcomeLabel.setForeground(Color.red);
                    welcome2Label.hide();
                    welcomeLabel.setText("Please enter a password");
                }
                else if (!usernameTF.getText().equals("Prithvi") && !passwordTF.getText().equals("Rangaswami")) {
                    welcomeLabel.setForeground(Color.red);
                    welcome2Label.setForeground(Color.red);
                    welcomeLabel.setText("Incorrect username");
                    welcome2Label.setText("and password");
                } else if (!passwordTF.getText().equals("Rangaswami")) {
                    welcomeLabel.setForeground(Color.red);
                    welcome2Label.hide();
                    welcomeLabel.setText("Incorrect password");
                } else if (!usernameTF.getText().equals("Prithvi")) {
                    welcomeLabel.setForeground(Color.red);
                    welcome2Label.hide();
                    welcomeLabel.setText("Incorrect username");
                }
            }




    });

}

}
