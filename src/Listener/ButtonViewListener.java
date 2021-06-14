package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import Manager.ScheduleManage;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ScheduleManage ScheduleManage = getObject("ScheduleManage.ser");
		ScheduleViewer viewer = frame.getScheduleViewer();
		
		JButton b = (JButton) e.getSource();
		frame.getContentPane().add(viewer);
		frame.setupPanel(viewer);
	}

	public static ScheduleManage getObject(String filename) {
		ScheduleManage ScheduleManage = null;
		FileInputStream file;
		try{
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			ScheduleManage = (ScheduleManage) in.readObject();
			
			in.close();
			file.close();
			
		}catch(FileNotFoundException e) {
			return ScheduleManage;
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ScheduleManage;
	}

	ScheduleManage ScheduleManage = getObject("ScheduleManage.ser");
}
