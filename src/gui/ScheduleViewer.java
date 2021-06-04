package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Manager.ScheduleManage;
import Schedule.ScheduleInput;

public class ScheduleViewer extends JPanel {
	WindowFrame frame;
	private ScheduleManage ScheduleManage;

	public ScheduleViewer(WindowFrame frame, ScheduleManage ScheduleManage) {
		this.frame = frame;
		this.ScheduleManage = ScheduleManage;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Schedule Name");
		model.addColumn("Weekday");
		model.addColumn("Start Time(H)");
		model.addColumn("Start Time(M)");
		model.addColumn("Required Time(M)");
		
		for (int i =  0; i < ScheduleManage.size(); i++) {
			Vector row = new Vector();
			ScheduleInput si = ScheduleManage.get(i);
			row.add(si.getScheduleName());
			row.add(si.getWeekday());
			row.add(si.getStartTimeH());
			row.add(si.getStartTimeM());
			row.add(si.getTimeRequired());
			
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
	}
}
