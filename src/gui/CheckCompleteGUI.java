package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CheckCompleteGUI extends JFrame{

	public CheckCompleteGUI(){
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Schedule Name");
		model.addColumn("Weekday");
		model.addColumn("Start Time");
		model.addColumn("Required Time(M)");
		model.addColumn("Complete date");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setContentPane(panel);\
		this.setTitle("CheckComplete");
		this.setVisible(true);
		
	}
}
