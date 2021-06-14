package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.ButtonAddCancelListener;
import Listener.ScheduleAddListener;
import Manager.ScheduleManage;

public class ScheduleAdd extends JPanel  {
	WindowFrame frame;
	private ScheduleManage ScheduleManage;
	
	public ScheduleAdd(WindowFrame frame, ScheduleManage ScheduleManage) {
		this.frame = frame;
		this.ScheduleManage = ScheduleManage;
		
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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new ScheduleAddListener(fieldStartTimeHour, fieldStartTimeMinute, fieldRequiredTime, fieldWeekday, fieldScheduleName, ScheduleManage));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ButtonAddCancelListener(frame));
	
		
		panel.add(saveButton);
		panel.add(cancelButton);
			
		
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		

		this.add(panel);
		
	}

}
