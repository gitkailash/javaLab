package kls.assignments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lab1InnerClass extends JFrame{
    JTextField t;
    JButton b;
    Lab1InnerClass(){
        setTitle("clicked");
        setBounds(200,200,500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.cyan);

        t = new JTextField(30);
        t.setBounds(100,100,200,60);
        add(t);

        b=new JButton("CLICK");
        b.setBounds(100,200,200,60);
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
        new Lab1InnerClass();
    }
}
