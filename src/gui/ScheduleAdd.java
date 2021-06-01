package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ScheduleAdd extends JFrame  {

	public ScheduleAdd() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelStartTimeHour = new JLabel("Start Time(H) : ", JLabel.TRAILING);
		JTextField fieldStartTimeHour = new JTextField(10);
		labelStartTimeHour.setLabelFor(fieldStartTimeHour);
		panel.add(labelStartTimeHour);
		panel.add(fieldStartTimeHour);
		
		
		JLabel labelStartTimeMinute = new JLabel("Start Time(M) : ", JLabel.TRAILING);
		JTextField fieldStartTimeMinute = new JTextField(10);
		labelStartTimeMinute.setLabelFor(fieldStartTimeMinute);
		panel.add(labelStartTimeMinute);
		panel.add(fieldStartTimeMinute);
		
		JLabel labelRequiredTime = new JLabel("Required Time(M) : ", JLabel.TRAILING);
		JTextField fieldRequiredTime = new JTextField(10);
		labelRequiredTime.setLabelFor(fieldRequiredTime);
		panel.add(labelRequiredTime);
		panel.add(fieldRequiredTime);
		
		JLabel labelScheduleName = new JLabel("Scheudle Name : ", JLabel.TRAILING);
		JTextField fieldScheduleName = new JTextField(10);
		labelScheduleName.setLabelFor(fieldScheduleName);
		panel.add(labelScheduleName);
		panel.add(fieldScheduleName);
		
		JLabel labelWeekday = new JLabel("Weekday : ", JLabel.TRAILING);
		JTextField fieldWeekday = new JTextField(10);
		labelWeekday.setLabelFor(fieldWeekday);
		panel.add(labelWeekday);
		panel.add(fieldWeekday);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("cancel"));
		
		
		
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setTitle("Schedule add");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
		
	}

}
