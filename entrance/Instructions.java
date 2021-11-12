package muet.entrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Instructions extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Instructions(String username){
        this.username = username;
        setBounds(250, 30, 880, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to MUET Computer Based Entry Test.");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setBounds(50, 30, 800, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setBounds(20, 80, 750, 400);
        l2.setText(
            "<html>"+
                "DEAR CANDIDATE PLEASE READ THE FOLLOWING INSTRUCTIONS CAREFULLY:" + "<br><br>"+
                "1. Smoking is strictly prohibited in test centre." + "<br><br>" +
                "2. For Invigilators attention, just raise your hand and do not leave your seat." + "<br><br>" +
                "3. Do not communicate with any other candidate." + "<br><br>" +
                "4. The use of Electronic devices such as Mobiles and Calculators are NOT Allowed." + "<br><br>" +
                "5. Please strictly FOLLOW the COVID-19 SOPs." + "<br><br>" +
                "   BEST OF LUCK!! " + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(400, 450, 100 , 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        Font font2 = new Font("Arial", Font.BOLD, 17);
        b1.setFont(font2);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(250, 450, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 17);
        b2.setFont(font);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new MuetEntrance().setVisible(true);
        }
        else if(ae.getSource() == b2){
            this.setVisible(false);
            new Questions(username).setVisible(true);
        }
    }

    public static void main(String[] args){
        new Instructions("");
    }
}
