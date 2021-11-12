package muet.entrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        setTitle("Result");
        setBounds(300, 100, 750, 420);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("muet/entrance/icon/muett.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 120, 300, 250);
        add(l1);
        
        JLabel l2 = new JLabel("PROJECT BY 20SW013 & 20SW064");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Arial", Font.ITALIC, 40));
        l2.setBounds(50, 50, 700, 30);
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is " + score + "%");
        l3.setBounds(350, 120, 300, 30);
        l3.setFont(new Font("Arial", Font.BOLD, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        JButton b1 = new JButton("DONE");
        b1.setBackground(new Color(0x1E9DFF));
        b1.setForeground(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 17);
        b1.setFont(font);
        b1.addActionListener(this);
        b1.setBounds(400, 160, 120, 30);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new MuetEntrance().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
