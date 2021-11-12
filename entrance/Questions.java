package muet.entrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Questions extends JFrame implements ActionListener{
    
    JButton next, submit;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    Questions(String username){
        this.username = username;
        setBounds(0, 0, 1600, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("muet/entrance/icon/m.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1440, 392);
        add(l1);
        
        qno = new JLabel("");
        qno.setFont(new Font("Arial", Font.PLAIN, 24));
        qno.setBounds(100, 380, 50, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Arial", Font.PLAIN, 24));
        question.setBounds(150, 380, 900, 30);
        add(question);
        
        q[0][0] = "The Fundamental units in Physics are?";
        q[0][1] = "6";
        q[0][2] = "2";
        q[0][3] = "7";
        q[0][4] = "NOT";

        q[1][0] = "Resistance will be ____ if absolute temperature is zero";
        q[1][1] = "0";
        q[1][2] = "1";
        q[1][3] = "10";
        q[1][4] = "NOT";

        q[2][0] = "Longitudinal Waves Are?";
        q[2][1] = "Perpendicular";
        q[2][2] = "Parallel";
        q[2][3] = "May be Both";
        q[2][4] = "NOT";

        q[3][0] = "10x3-6+10=?";
        q[3][1] = "30";
        q[3][2] = "40";
        q[3][3] = "22";
        q[3][4] = "34";

        q[4][0] = "(a+b)^2=?";
        q[4][1] = "a^2+2ab+b^2";
        q[4][2] = "a^2-2ab";
        q[4][3] = "a^2+b^2";
        q[4][4] = "NOT";

        q[5][0] = "Electric Intensity is _____ Quantity";
        q[5][1] = "Scalar";
        q[5][2] = "Vector";
        q[5][3] = "Both";
        q[5][4] = "NOT";

        q[6][0] = "Alcohol Prepare From?";
        q[6][1] = "METHANOL";
        q[6][2] = "ETHANOL";
        q[6][3] = "C02";
        q[6][4] = "NOT";

        q[7][0] = "Formula of Water is?";
        q[7][1] = "H2O";
        q[7][2] = "H20";
        q[7][3] = "D2O";
        q[7][4] = "NOT";

        q[8][0] = "General Formula of Dichloromethane?";
        q[8][1] = "CH2Cl2";
        q[8][2] = "CH2O";
        q[8][3] = "CH2H6";
        q[8][4] = "NOT";

        q[9][0] = "Nonene?";
        q[9][1] = "C9H18";
        q[9][2] = "C9H17";
        q[9][3] = "C9H16";
        q[9][4] = "NOT";
        
        qa[0][1] = "7";
        qa[1][1] = "0";
        qa[2][1] = "Parallel";
        qa[3][1] = "34";
        qa[4][1] = "a^2+2ab+b^2";
        qa[5][1] = "Vector";
        qa[6][1] = "METHANOL";
        qa[7][1] = "H2O";
        qa[8][1] = "CH2Cl2";
        qa[9][1] = "C9H18";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(170, 420, 700, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 460, 700, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 500, 700, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 540, 700, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Arial", Font.BOLD, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(900, 550, 150, 40);
        add(next);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.BOLD, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(1070, 550, 150, 40);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }
        else if(ae.getSource() == ""){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 900, 550);
        }
        else {
            g.drawString("Times Up!!", 900, 550);
        }
        
        timer--; // 14
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }
        else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }
                else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }
                    else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }
            else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }
                else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    
    public static void main(String[] args){
        new Questions("").setVisible(true);
    }
}
