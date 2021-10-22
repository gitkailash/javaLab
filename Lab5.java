package kls.assignments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lab5 extends JFrame implements ActionListener{
	JLabel l;
	JButton b;
	Lab5(){
		setTitle("Proceed");
		setBounds(200,200,300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		getContentPane().setBackground(Color.cyan);

		l = new JLabel();
        l.setBounds(100,100,200,60);
		add(l);

		b=new JButton("Proceed");
        b.setBounds(100,200,100,40);
		b.addActionListener(this);
		b.setActionCommand("proceed");
		add(b);
	}

	public void actionPerformed(ActionEvent ae){
		if (ae.getActionCommand().equals("proceed")){
			l.setText("Do You Want To Proceed?");
		}
	}

	public static void main(String[] args) {
		new Lab5();
	}
}
