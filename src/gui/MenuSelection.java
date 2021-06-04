package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Listener.ButtonAddListener;
import Listener.ButtonCheckListener;
import Listener.ButtonCompleteListener;
import Listener.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;

		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selcetion");
		
		JButton button1 = new JButton("Add Schedule");
		JButton button2 = new JButton("Complete Schedule");
		JButton button3 = new JButton("Check Complete Schedule");
		JButton button4 = new JButton("Edit/Delete Schedule");
		JButton button5 = new JButton("View Schedules");
		JButton button6 = new JButton("Exit");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonCompleteListener(frame));
		button3.addActionListener(new ButtonCheckListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		button5.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
	}
}
