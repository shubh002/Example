package com.phone.gui_elements;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;

import com.phone.data.PhoneData;
import com.phone.phone_datamodel.entities.Features;
import com.phone.phone_datamodel.entities.Phone;
import com.phone.phone_datamodel.entities.PhoneTableModel;
import com.phone.phone_datamodel.enums.BrandType;
import com.phone.phone_datamodel.enums.ModelApple;
import com.phone.phone_datamodel.enums.ModelHtc;
import com.phone.phone_datamodel.enums.ModelLenovo;
import com.phone.phone_datamodel.enums.ModelLg;
import com.phone.phone_datamodel.enums.ModelOneplus;
import com.phone.phone_datamodel.enums.ModelSamsung;
import com.phone.phone_datamodel.enums.OSType;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;

public class ViewScreen extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private JPopupMenu popupMenu;
	private JMenuItem update;
	private JMenuItem delete;
	
	
	
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
		
		popupMenu = new JPopupMenu();
		update = new JMenuItem("Update");
		update.addActionListener(this);
		delete = new JMenuItem("Delete");
		delete.addActionListener(this);
		popupMenu.add(update);
		popupMenu.add(new JSeparator());
		popupMenu.add(delete);
		table.setComponentPopupMenu(popupMenu);
		
		
	
		
	}

	
	public void actionPerformed(ActionEvent e)
	{
		JMenuItem menu = (JMenuItem) e.getSource();
		if(menu == update)
		{
			int selectedRow = table.getSelectedRow();
			if(selectedRow==-1)
			{
				JOptionPane.showMessageDialog(null, "Please Select a Row first");
			}
			else
			{
				int row = table.getSelectedRow();
				Phone phone = populatePhoneSelected(row,table.getModel());
				UpdateScreen updateScreen = new UpdateScreen(phone);
				updateScreen.setVisible(true);
				
				
			}
			System.out.println("Update pressed");
		}
		if(menu == delete)
		{
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1)
			{
				JOptionPane.showMessageDialog(null, "Please Select a Row first");
			}
			else
			{
				int id = (Integer) table.getModel().getValueAt(selectedRow, 0);
				System.out.println(id);
				PhoneData.removeFromList(PhoneData.findById(id));
				GuiScreensFactory.closeViewScreen();
				GuiScreensFactory.openViewScreen();
			}
		}	
		
	}

	private Phone populatePhoneSelected(int row,TableModel model) {
		Phone tempPhone = new Phone();
		Features tempFeature = new Features();
		
		tempPhone.setId((Integer) model.getValueAt(row, 0));
		tempPhone.setOperatingSystem((OSType)model.getValueAt(row, 1));
		tempFeature.setBrand((BrandType) model.getValueAt(row, 2));
		
		Object object = model.getValueAt(row, 3);
		if(object instanceof ModelApple )
		{
			tempFeature.setModelApple((ModelApple) model.getValueAt(row, 3));	
		}
		if(object instanceof ModelHtc )
		{
			tempFeature.setModelHtc((ModelHtc) model.getValueAt(row, 3));	
		}
		if(object instanceof ModelLenovo)
		{
			tempFeature.setModelLenovo((ModelLenovo) model.getValueAt(row, 3));
		}
		if(object instanceof ModelSamsung)
		{
			tempFeature.setModelSamsung((ModelSamsung) model.getValueAt(row, 3));
		}
		if(object instanceof ModelLg)
		{
			tempFeature.setModelLg((ModelLg) model.getValueAt(row, 3));
		}
		if(object instanceof ModelOneplus)
		{
			tempFeature.setModelOneplus((ModelOneplus) model.getValueAt(row, 3));
		}
		
		tempFeature.setFourG((Boolean) model.getValueAt(row, 4));
		tempFeature.setInternalMemory((Integer) model.getValueAt(row, 5));
		tempFeature.setBattery((Integer) model.getValueAt(row, 6));
		tempFeature.setRam((Integer) model.getValueAt(row, 7));
		tempFeature.setCpu((String) model.getValueAt(row, 8));
		tempFeature.setGpu((String) model.getValueAt(row, 9));
		tempPhone.setFeatures(tempFeature);
		return tempPhone;
	}



}
