package kls.assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab6 extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b;
    Lab6(){
        setTitle("Sum of number");
        setBounds(200,200,500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.cyan);

        l1 = new JLabel("Num1: ");
        t1 = new JTextField(30);
        l2 = new JLabel("Num2: ");
        t2 = new JTextField(30);
        l3 = new JLabel("Sum: ");
        t3 = new JTextField(30);
        b = new JButton("Click");
        b.setBackground(Color.red);
        b.addActionListener(this);
        b.setActionCommand("sum");

        //adding all the fields
        add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b);

    }
    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = a + b;
            if (e.getActionCommand().equals("sum")) {
                t3.setText("Sum is: " + String.valueOf(sum));
            }
        }catch (NumberFormatException n){
            JOptionPane.showMessageDialog(new JFrame(),"Empty Fields Not Allowed");
        }
    }

    public static void main(String[] args) {
        new Lab6();
    }
}
