package kls.assignments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lab7 extends JFrame implements ActionListener{
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b;

    //constructor
    Lab7() {
        setVisible(true);
        setTitle("Inner Class Event Handling");
        setBounds(100, 100, 300, 400);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Length");
        t1 = new JTextField(20);
        l2 = new JLabel("Breadth");
        t2 = new JTextField(20);
        l3 = new JLabel("Area");
        t3 = new JTextField(20);
        b = new JButton("Rectangle");

        //Button registering
        b.addActionListener(this);

        //adding fields to frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int l = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = l * b;
            t3.setText("Area is : " + String.valueOf(sum));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(new JFrame(), "Empty Fields Not Allowed");
        }
    }
    public static void main(String[] args) {
        new Lab7();
    }
}
