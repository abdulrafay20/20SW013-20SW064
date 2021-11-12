package muet.entrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MuetEntrance extends JFrame implements ActionListener{
    
    JButton b1, b2;
    JTextField t1;
    MuetEntrance(){
        setBounds(50, 100, 1200, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("muet/entrance/icon/pic.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 700, 500);
        add(l1);
        
        JLabel l3 = new JLabel("Enter Your Seat Number:");
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        l3.setBounds(735, 160, 300, 20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(735, 200, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        b1 = new JButton("Instructions");
        b1.setBounds(735, 270, 150, 30);
        b1.setBackground(new Color(30, 144, 254));
        Font font = new Font("Arial", Font.BOLD, 17);
        b1.setFont(font);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(900, 270, 120, 30);
        b2.setBackground(new Color(30, 144, 254));
        Font font2 = new Font("Arial", Font.BOLD, 17);
        b2.setFont(font2);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Instructions(name);
        }else{
            System.exit(0);
        }
    }
}
