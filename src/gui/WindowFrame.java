package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.MenuManager;
import Manager.ScheduleManage;

public class WindowFrame extends JFrame{
	
	MenuSelection MenuSelection;
	

	ScheduleAdd ScheduleAdd;
	ScheduleViewer ScheduleViewer;
	CompleteScheduleGUI CompleteScheduleGUI;
	CheckCompleteGUI CheckCompleteGUI;
	ScheduleManage ScheduleMange;
	
	public WindowFrame(ScheduleManage ScheduleManage) {
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.ScheduleMange = ScheduleManage;
		this.MenuSelection = new MenuSelection(this);
		this.ScheduleAdd = new ScheduleAdd(this, this.ScheduleMange);
		this.ScheduleViewer = new ScheduleViewer(this, this.ScheduleMange);
		this.CompleteScheduleGUI = new CompleteScheduleGUI(this);
		this.CheckCompleteGUI = new CheckCompleteGUI(this);

		
		this.setupPanel(MenuSelection);
////		this.add(a);
////		this.add(b);
//		this.add(e);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuSelection() {
		return MenuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		MenuSelection = menuSelection;
	}

	public ScheduleAdd getScheduleAdd() {
		return ScheduleAdd;
	}

	public void setScheduleAdd(ScheduleAdd scheduleAdd) {
		ScheduleAdd = scheduleAdd;
	}

	public ScheduleViewer getScheduleViewer() {
		return ScheduleViewer;
	}

	public void setScheduleViewer(ScheduleViewer scheduleViewer) {
		ScheduleViewer = scheduleViewer;
	}

	public CompleteScheduleGUI getCompleteScheduleGUI() {
		return CompleteScheduleGUI;
	}

	public void setCompleteScheduleGUI(CompleteScheduleGUI completeScheduleGUI) {
		CompleteScheduleGUI = completeScheduleGUI;
	}

	public CheckCompleteGUI getCheckCompleteGUI() {
		return CheckCompleteGUI;
	}

	public void setCheckCompleteGUI(CheckCompleteGUI checkCompleteGUI) {
		CheckCompleteGUI = checkCompleteGUI;
	}
	
}
