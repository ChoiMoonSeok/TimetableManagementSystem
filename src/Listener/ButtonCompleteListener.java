package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.CompleteScheduleGUI;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonCompleteListener implements ActionListener {

	WindowFrame frame;
	public ButtonCompleteListener(WindowFrame frame) {
		this.frame = frame;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		CompleteScheduleGUI cs = frame.getCompleteScheduleGUI();
		frame.setupPanel(cs);
	}

}
