package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.HourFormatException;
import Exception.MinuteFormatException;
import Manager.ScheduleManage;
import Schedule.Schedule;
import Schedule.ScheduleInput;
import Schedule.ScheduleWeekday;

public class ScheduleAddListener implements ActionListener {

	JTextField fieldStartTimeH;
	JTextField fieldStartTimeM;
	JTextField fieldRequiredTime;
	JTextField fieldWeekday;
	JTextField fieldScheduleName;
	ScheduleManage ScheduleManage;
	@Override
	public void actionPerformed(ActionEvent e) {	
	
		ScheduleInput Schedule = new Schedule();
		
		try {
			Schedule.setStartTimeH(Integer.parseInt(fieldStartTimeH.getText()));
			Schedule.setStartTimeM(Integer.parseInt(fieldStartTimeM.getText()));
			Schedule.setTimeRequired(Integer.parseInt(fieldRequiredTime.getText()));
			Schedule.setScheduleName(fieldScheduleName.getText());
			String a = fieldWeekday.getText();

			if (a.equals("Monday"))
				Schedule.setWeekday(ScheduleWeekday.Monday);
			if (a.equals("Tuesday"))
				Schedule.setWeekday(ScheduleWeekday.Tuesday);
			if (a.equals("Wednesday"))
				Schedule.setWeekday(ScheduleWeekday.Wednesday);
			if (a.equals("Thursday"))
				Schedule.setWeekday(ScheduleWeekday.Thursday);
			if (a.equals("Friday"))
				Schedule.setWeekday(ScheduleWeekday.Friday);
			if (a.equals("Saturday"))
				Schedule.setWeekday(ScheduleWeekday.Saturday);
			if (a.equals("Sunday"))
				Schedule.setWeekday(ScheduleWeekday.Sunday);
			ScheduleManage.AddSchedule(Schedule);
			putObject(ScheduleManage, "ScheduleManage.ser");
			Schedule.printinfo();
		} catch (HourFormatException | NumberFormatException | MinuteFormatException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public ScheduleAddListener(JTextField fieldStartTimeH, JTextField fieldStartTimeM, JTextField fieldRequiredTime,
			JTextField fieldWeekday, JTextField fieldScheduleName, ScheduleManage ScheduleManage) {
		super();
		this.fieldStartTimeH = fieldStartTimeH;
		this.fieldStartTimeM = fieldStartTimeM;
		this.fieldRequiredTime = fieldRequiredTime;
		this.fieldWeekday = fieldWeekday;
		this.fieldScheduleName = fieldScheduleName;
		this.ScheduleManage = ScheduleManage;
	}
	
	public static ScheduleManage putObject(ScheduleManage ScheduleManage, String filename) {
		
			try{
				FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(file);
			
				out.writeObject(ScheduleManage);
			
				out.close();
				file.close();
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			return ScheduleManage;
		}

}
