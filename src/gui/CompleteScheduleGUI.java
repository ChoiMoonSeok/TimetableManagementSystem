package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CompleteScheduleGUI extends JFrame{

	public CompleteScheduleGUI() {
		this.setSize(300, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel label1 = new JLabel("Schedule Name : ", JLabel.TRAILING);
		JTextField blank = new JTextField(10);
		label1.setLabelFor(blank);
		panel.add(label1);
		panel.add(blank);
		
		
		JLabel label2 = new JLabel("Complete date : ", JLabel.TRAILING);
		JTextField blank2 = new JTextField(10);
		label2.setLabelFor(blank2);
		panel.add(label2);
		panel.add(blank2);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 3, 3, 3, 3);

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("CompleteSchedule");
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
