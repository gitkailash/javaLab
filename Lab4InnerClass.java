package kls.assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4InnerClass extends JFrame {
        JLabel l1,l2,l3;
        JTextField t1,t2,t3;
        JButton b1,b2;
        Lab4InnerClass(){
            setTitle("Sum of number");
            setBounds(200,200,500,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(new FlowLayout());
            getContentPane().setBackground(Color.cyan);
            JLabel l6 = new JLabel("CALCULATOR");
            add(l6);

            l1 = new JLabel("First Number: ");
            t1 = new JTextField(30);
            l2 = new JLabel("Second Number: ");
            t2 = new JTextField(30);
            l3 = new JLabel("Result: ");
            t3 = new JTextField(30);
            b1 = new JButton("add");
            b1.setBackground(Color.red);
            b1.addActionListener(new InnerClass());
            b1.setActionCommand("add");
            b2 = new JButton("Div");
            b2.setBackground(Color.pink);
            b2.addActionListener(new InnerClass());

            //adding all the fields
            add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);

        }
        public class InnerClass implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int sum = a + b;
                    float div = (float)a / (float)b;

                    if (e.getActionCommand().equals("add")) {
                        t3.setText("Sum is: " + String.valueOf(sum));
                    } else {
                        t3.setText("div is: " + String.valueOf(div));
                    }
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(new JFrame(), "Empty Fields Not Allowed");
                }
            }
        }
        public static void main(String[] args) {
            new Lab4InnerClass();
        }
    }
