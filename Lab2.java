package kls.assignments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lab2 extends JFrame implements ActionListener{
    JTextField t;
    JButton b;
    Lab2(){
        setTitle("Sum of number");
        setBounds(200,200,500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.cyan);

        t = new JTextField(30);
        add(t);

        b=new JButton("CLICK");
        b.addActionListener(this);
//        b.setActionCommand("click");
        add(b);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(b)){
            t.setText("Clicked");
        }
    }

    public static void main(String[] args) {
        new Lab2();
    }
}
