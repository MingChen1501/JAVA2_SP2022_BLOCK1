package com.vn.slide2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableDataUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableDataUI window = new TableDataUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TableDataUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 90, 355, 136);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "fdf", "dfdfd", "fdf", "dfdfd"},
				{"2", "fdfd", "fdf", "dfd", "fdfdf"},
				{"3", "fdf", "dfd", "fdfd", "fdd"},
				{"3", "dfd", "dfd", "fdf", null},
				{"f", "fdfd", null, null, null},
				{null, "fd", null, null, null},
				{null, "fd", "fdf", null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{"fdf", "d", "fd", "fd", "fd"},
			},
			new String[] {
				"Stt", "Ho Ten", "New column", "New column", "No"
			}
		));
		scrollPane.setViewportView(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CH001", "CH002", "CH003"}));
		comboBox.setBounds(86, 34, 213, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("L\u01A1\u0301p");
		lblNewLabel.setBounds(46, 38, 30, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton bntLoad = new JButton("Load");
		bntLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bntLoad.setBounds(321, 34, 89, 23);
		frame.getContentPane().add(bntLoad);
	}
}
