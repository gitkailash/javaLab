package kls.assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab3InnerClass extends JFrame{
        JLabel l1,l2,l3;
        JTextField t1,t2,t3;
        JButton b1,b2;
        Lab3InnerClass(){
            setTitle("Sum & Div");
            setBounds(200,200,500,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(null);
            getContentPane().setBackground(Color.cyan);
            JLabel l6 = new JLabel("CALCULATOR",JLabel.CENTER);
            l6.setBounds(140,20,100,30);
            add(l6);

            l1 = new JLabel("First Number: ",JLabel.LEFT);
            l1.setBounds(20,50,80,30);
            add(l1);

            t1 = new JTextField(30);
            t1.setBounds(140,50,120,25);
            add(t1);

            l2 = new JLabel("Second Number: ",JLabel.LEFT);
            l2.setBounds(20,85,100,30);
            add(l2);

            t2 = new JTextField(30);
            t2.setBounds(140,85,120,25);
            add(t2);

            l3 = new JLabel("Result: ",JLabel.LEFT);
            l3.setBounds(20,120,80,30);
            add(l3);

            t3 = new JTextField(30);
            t3.setBounds(140,120,120,25);
            add(t3);

            b1 = new JButton("Sum");
            b1.setBounds(50,150,80,30);
            b1.setBackground(Color.red);
            b1.addActionListener(new InnerClass());
            b1.setActionCommand("sum");
            add(b1);

            b2 = new JButton("Div");
            b2.setBounds(150,150,80,30);
            b2.setBackground(Color.pink);
            b2.addActionListener(new InnerClass());
            add(b2);

        }
        public class InnerClass implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int sum = a + b;
                    float div = (float)a/(float)b;

                    if (e.getActionCommand().equals("sum")) {
                        t3.setText("Sum is: " + String.valueOf(sum));
                    }else {
                        t3.setText("div is: " + String.valueOf(div));
                    }
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(new JFrame(), "Empty Fields Not Allowed");
                }
            }
        }
        public static void main(String[] args) {
            new Lab3InnerClass();
        }
    }