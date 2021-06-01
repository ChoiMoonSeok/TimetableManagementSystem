package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	public MenuSelection() {
		this.setSize(300, 300);
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selcetion");
		
		JButton button1 = new JButton("Add Schedule");
		JButton button2 = new JButton("Complete Schedule");
		JButton button3 = new JButton("Check Complete Schedule");
		JButton button4 = new JButton("Edit/Delete Schedule");
		JButton button5 = new JButton("View Schedules");
		JButton button6 = new JButton("Exit");
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setTitle("MenuSelection");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
