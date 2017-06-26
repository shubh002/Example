package com.phone.gui_elements;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTable;

import com.phone.data.PhoneData;
import com.phone.phone_datamodel.entities.PhoneTableModel;
import java.awt.Color;
import javax.swing.JScrollPane;

public class ViewScreen extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewScreen frame = new ViewScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewScreen() {
		setType(Type.UTILITY);
		setTitle("VIEW SCREEN");
		PhoneTableModel phoneTableModel = new PhoneTableModel(PhoneData.readFromList());
		setBounds(100, 100, 1238, 582);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setToolTipText("");
		scrollPane.setBounds(23, 29, 1170, 490);
		contentPane.add(scrollPane);
		table = new JTable(phoneTableModel.getTableData(),phoneTableModel.getColumnNames());
		table.setFillsViewportHeight(true);
		table.setCellSelectionEnabled(true);
		table.setRowSelectionAllowed(true);
		table.setColumnSelectionAllowed(false);
		scrollPane.setViewportView(table);
		table.getColumnModel().getColumn(0).setPreferredWidth(1);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(10);
		table.getColumnModel().getColumn(5).setPreferredWidth(30);
		table.getColumnModel().getColumn(6).setPreferredWidth(30);
		table.getColumnModel().getColumn(7).setPreferredWidth(20);
		table.getColumnModel().getColumn(8).setPreferredWidth(150);
		table.getColumnModel().getColumn(9).setPreferredWidth(150);		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
	
		
	}

}
