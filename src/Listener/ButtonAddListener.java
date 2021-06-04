package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ScheduleAdd;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		ScheduleAdd add = frame.getScheduleAdd();
		frame.setupPanel(add);
	}

}
