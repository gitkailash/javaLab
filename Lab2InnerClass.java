package kls.assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab2InnerClass extends JFrame{
        JTextField t;
        JButton b;
        Lab2InnerClass(){
            setTitle("click");
            setBounds(200,200,500,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(new FlowLayout());
            getContentPane().setBackground(Color.cyan);

            t = new JTextField(30);
            add(t);

            b=new JButton("CLICK");
            b.addActionListener(new InnerClass());
//        b.setActionCommand("click");
            add(b);
        }

        public class InnerClass implements ActionListener {
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource().equals(b)) {
                    t.setText("Clicked");
                }
            }
        }

        public static void main(String[] args) {
            new Lab2InnerClass();
        }
    }
