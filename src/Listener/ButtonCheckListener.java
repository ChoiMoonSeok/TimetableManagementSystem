package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.CheckCompleteGUI;
import gui.ScheduleViewer;
import gui.WindowFrame;

public class ButtonCheckListener implements ActionListener {

	WindowFrame frame;
	public ButtonCheckListener(WindowFrame frame) {
		this.frame = frame;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		CheckCompleteGUI check = frame.getCheckCompleteGUI();
		frame.setupPanel(check);
	}

}
