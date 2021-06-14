package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ScheduleAdd;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonAddCancelListener implements ActionListener {

	WindowFrame frame;
	public ButtonAddCancelListener(WindowFrame frame) {
		this.frame = frame;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
	}

}
