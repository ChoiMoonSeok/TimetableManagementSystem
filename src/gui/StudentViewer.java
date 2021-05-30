package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentViewer extends JFrame {

	public StudentViewer() {

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Schedule Name");
		model.addColumn("Weekday");
		model.addColumn("Start Time");
		model.addColumn("Required Time(M)");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setContentPane(panel);
		this.setVisible(true);
	}
}
