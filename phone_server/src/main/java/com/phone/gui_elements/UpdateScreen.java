package com.phone.gui_elements;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

import com.phone.data.PhoneData;
import com.phone.phone_datamodel.entities.Features;
import com.phone.phone_datamodel.entities.Phone;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

import com.phone.phone_datamodel.enums.ModelApple;
import com.phone.phone_datamodel.enums.ModelHtc;
import com.phone.phone_datamodel.enums.ModelLenovo;
import com.phone.phone_datamodel.enums.ModelLg;
import com.phone.phone_datamodel.enums.ModelOneplus;
import com.phone.phone_datamodel.enums.ModelSamsung;
import com.phone.phone_datamodel.enums.OSType;
import com.phone.phone_datamodel.enums.BrandType;

public class UpdateScreen extends JFrame implements KeyListener, ActionListener {

	private JPanel contentPane;
	private ButtonGroup radioButton;
	AddScreen addScreen = new AddScreen();
	private Phone phone;
	private JButton btnUpdate;
	private JLabel lblOsType;
	private JComboBox comboBoxOSType;
	private JLabel lblBrand;
	private JLabel lblModel;
	private JComboBox comboBoxBrandType;
	private JComboBox comboBoxModelType;
	private JLabel lbl4g;
	private JRadioButton radioButtonYes;
	private JRadioButton radioButtonNo;
	private JTextField textFieldGpu;
	private JLabel lblGpu;
	private JTextField textFieldCpu;
	private JLabel lblCpu;
	private JTextField textFieldRam;
	private JLabel lblRam;
	private JLabel lblGb_1;
	private JLabel lblMah;
	private JLabel lblBattery;
	private JTextField textFieldBattery;
	private JLabel lblGb;
	private JTextField textFieldMemory;
	private JLabel lblMemory;
	private DefaultComboBoxModel defaultComboBoxBrand = new DefaultComboBoxModel();
	private DefaultComboBoxModel defaultComboBoxModel= new DefaultComboBoxModel();
	
	
	public UpdateScreen(Phone phone) {
		this.phone = phone;
		setType(Type.UTILITY);
		setTitle("EDIT INFORMATION");
		setBounds(100, 100, 901, 617);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(this);
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBounds(390, 537, 89, 23);
		contentPane.add(btnUpdate);
		
		lblOsType = new JLabel("OS Type");
		lblOsType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOsType.setBounds(34, 30, 66, 24);
		contentPane.add(lblOsType);
		
		comboBoxOSType = new JComboBox();
		comboBoxOSType.setModel(new DefaultComboBoxModel(OSType.values()));
		comboBoxOSType.setBackground(Color.WHITE);
		comboBoxOSType.setBounds(134, 34, 100, 20);
		comboBoxOSType.addActionListener(this);
		contentPane.add(comboBoxOSType);
		
		
		lblBrand = new JLabel("Brand");
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBrand.setBounds(34, 79, 66, 24);
		contentPane.add(lblBrand);
		
		lblModel = new JLabel("Model");
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModel.setBounds(34, 128, 68, 28);
		contentPane.add(lblModel);
		
		comboBoxBrandType = new JComboBox();
		comboBoxBrandType.setModel(defaultComboBoxBrand);
		comboBoxBrandType.setBackground(Color.WHITE);
		comboBoxBrandType.setBounds(134, 83, 100, 20);
		comboBoxBrandType.addActionListener(this);
		contentPane.add(comboBoxBrandType);
		
		
		comboBoxModelType = new JComboBox();
		comboBoxModelType.setModel(defaultComboBoxModel);
		comboBoxModelType.setBackground(Color.WHITE);
		comboBoxModelType.setBounds(134, 134, 100, 20);
		comboBoxModelType.addActionListener(this);
		contentPane.add(comboBoxModelType);
	
		
		lbl4g = new JLabel("4G Enabled");
		lbl4g.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl4g.setBounds(34, 180, 79, 24);
		contentPane.add(lbl4g);
		
		
		
		radioButton = new ButtonGroup();
		radioButtonYes = new JRadioButton("YES");
		radioButtonYes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		radioButtonYes.setBackground(Color.WHITE);
		radioButtonYes.setBounds(134, 183, 66, 23);
		radioButton.add(radioButtonYes);
		
		radioButtonNo = new JRadioButton("NO");
		radioButtonNo.setBackground(Color.WHITE);
		radioButtonNo.setBounds(221, 183, 66, 23);
		radioButton.add(radioButtonNo);
		contentPane.add(radioButtonNo);
		contentPane.add(radioButtonYes);
		
		textFieldGpu = new JTextField();
		textFieldGpu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldGpu.setColumns(10);
		textFieldGpu.setBounds(134, 477, 271, 20);
		contentPane.add(textFieldGpu);
		
		
		lblGpu = new JLabel("GPU");
		lblGpu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGpu.setBounds(34, 473, 66, 24);
		contentPane.add(lblGpu);
		
		textFieldCpu = new JTextField();
		textFieldCpu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldCpu.setColumns(10);
		textFieldCpu.setBounds(134, 421, 271, 20);
		contentPane.add(textFieldCpu);
		
		
		lblCpu = new JLabel("CPU");
		lblCpu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpu.setBounds(34, 417, 66, 24);
		contentPane.add(lblCpu);
		
		textFieldRam = new JTextField();
		textFieldRam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldRam.setColumns(10);
		textFieldRam.setBounds(134, 356, 32, 20);
		textFieldRam.addKeyListener(this);
		contentPane.add(textFieldRam);
		
		lblRam = new JLabel("RAM");
		lblRam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRam.setBounds(34, 352, 66, 24);
		contentPane.add(lblRam);
		
		lblGb_1 = new JLabel("GB");
		lblGb_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGb_1.setBounds(174, 359, 24, 17);
		contentPane.add(lblGb_1);
		
		lblMah = new JLabel("mAh");
		lblMah.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMah.setBounds(210, 299, 46, 14);
		contentPane.add(lblMah);
		
		lblBattery = new JLabel("Battery");
		lblBattery.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBattery.setBounds(34, 292, 66, 24);
		contentPane.add(lblBattery);
		
		textFieldBattery = new JTextField();
		textFieldBattery.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldBattery.setColumns(10);
		textFieldBattery.setBounds(134, 296, 72, 20);
		textFieldBattery.addKeyListener(this);
		contentPane.add(textFieldBattery);
		
		
		lblGb = new JLabel("GB");
		lblGb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGb.setBounds(196, 240, 24, 17);
		contentPane.add(lblGb);
		
		textFieldMemory = new JTextField();
		textFieldMemory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldMemory.setColumns(10);
		textFieldMemory.setBounds(134, 239, 59, 20);
		textFieldMemory.addKeyListener(this);
		contentPane.add(textFieldMemory);
		
		
		lblMemory = new JLabel("Memory");
		lblMemory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMemory.setBackground(Color.WHITE);
		lblMemory.setBounds(34, 235, 66, 24);
		contentPane.add(lblMemory);
		
		
		populate();
		
		
		
	}
	
	
	public void populate()
	{
		comboBoxOSType.setSelectedItem(phone.getOperatingSystem());
		
		comboBoxBrandType.setSelectedItem(phone.getFeatures().getBrand());
		
		if(phone.getFeatures().getModelApple()!=null)
		{
			comboBoxModelType.setSelectedItem(phone.getFeatures().getModelApple());	
		}
		if(phone.getFeatures().getModelHtc()!=null)
		{
			comboBoxModelType.setSelectedItem(phone.getFeatures().getModelHtc());
		}
		
		if(phone.getFeatures().getModelLenovo()!=null)
		{
			comboBoxModelType.setSelectedItem(phone.getFeatures().getModelLenovo());
		}
		if(phone.getFeatures().getModelLg()!=null)
		{
			comboBoxModelType.setSelectedItem(phone.getFeatures().getModelLg());
		}
		if(phone.getFeatures().getModelOneplus()!=null)
		{
			comboBoxModelType.setSelectedItem(phone.getFeatures().getModelOneplus());
		}
		if(phone.getFeatures().getModelSamsung()!=null)
		{
			comboBoxModelType.setSelectedItem(phone.getFeatures().getModelSamsung());
		}
		
		
		
		if(phone.getFeatures().isFourG())
		{
			radioButtonYes.setSelected(true);
		}
		else
		{
			radioButtonNo.setSelected(true);
		}
		
		textFieldGpu.setText(phone.getFeatures().getGpu());
		
		textFieldCpu.setText(phone.getFeatures().getCpu());
		
		textFieldRam.setText(Integer.toString(phone.getFeatures().getRam()));
		
		textFieldBattery.setText(Integer.toString(phone.getFeatures().getBattery()));
		
		textFieldMemory.setText(Integer.toString(phone.getFeatures().getInternalMemory()));
	}
	
	
	public void keyTyped(KeyEvent e) {
		
		if(e.getSource()==textFieldRam||e.getSource()==textFieldBattery||e.getSource()==textFieldMemory){
			try{
				Integer.parseInt(Character.toString(e.getKeyChar()));
				
			}catch(Exception exc)
			{
				e.consume();	
			}
		}
	}

	public void keyPressed(KeyEvent e) {
		
		
	}

	public void keyReleased(KeyEvent e) {
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==comboBoxOSType)
		{
			if(comboBoxOSType.getSelectedItem()==OSType.ANDROID)
			{
				defaultComboBoxBrand.removeAllElements();
				for(int i=2;i<=6;i++)
				{
					defaultComboBoxBrand.addElement(BrandType.values()[i]);
				}
			}
			else if(comboBoxOSType.getSelectedItem()==OSType.IOS)
			{
				defaultComboBoxBrand.removeAllElements();
				defaultComboBoxBrand.addElement(BrandType.values()[1]);
				
			}
		}
		
		
		if(e.getSource()==comboBoxBrandType)
		{
			defaultComboBoxModel.removeAllElements();
			if(comboBoxBrandType.getSelectedItem()==BrandType.APPLE)
			{
				for(int i=0;i<=4;i++)
				{
					defaultComboBoxModel.addElement(phone.getFeatures().getModelApple().values()[i]);
					
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.SAMSUNG)
			{
				defaultComboBoxModel.removeAllElements();
				for(int i=0;i<=5;i++)
				{
					defaultComboBoxModel.addElement(phone.getFeatures().getModelSamsung().values()[i]);
					
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.HTC)
			{
				defaultComboBoxModel.removeAllElements();
				for(int i=0;i<=3;i++)
				{
					defaultComboBoxModel.addElement(phone.getFeatures().getModelHtc().values()[i]);
					
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.LG)
			{
				defaultComboBoxModel.removeAllElements();
				for(int i=0;i<=4;i++)
				{
					defaultComboBoxModel.addElement(phone.getFeatures().getModelLg().values()[i]);
					
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.LENOVO)
			{
				defaultComboBoxModel.removeAllElements();
				for(int i=0;i<=4;i++)
				{
					defaultComboBoxModel.addElement(phone.getFeatures().getModelLenovo().values()[i]);
					
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.ONEPLUS)
			{
				defaultComboBoxModel.removeAllElements();
				for(int i=0;i<=4;i++)
				{
					defaultComboBoxModel.addElement(phone.getFeatures().getModelOneplus().values()[i]);
					
			
				}
			}
			
		}
		
		
		if(e.getSource()==btnUpdate)
		{
			this.repaint();
			this.validate();
			
			boolean is4G = false;
			int internalMemory = 0;
			int ram=0;
			int battery=0;
			String cpu=null;
			String gpu=null;
			
			Phone phone = new Phone();
			
			Features feature = new Features();
			
			phone.setOperatingSystem((OSType)comboBoxOSType.getSelectedItem());
			feature.setBrand((BrandType)comboBoxBrandType.getSelectedItem());
			if(comboBoxBrandType.getSelectedItem()==BrandType.APPLE)
			{
				feature.setModelApple((ModelApple) comboBoxModelType.getSelectedItem());
			}
			if(comboBoxBrandType.getSelectedItem()==BrandType.SAMSUNG)
			{	
				feature.setModelSamsung((ModelSamsung) comboBoxModelType.getSelectedItem());
			}	
			if(comboBoxBrandType.getSelectedItem()==BrandType.HTC)	
			{	
				feature.setModelHtc((ModelHtc) comboBoxModelType.getSelectedItem());
			}	
			if(comboBoxBrandType.getSelectedItem()==BrandType.LG)	
			{
				feature.setModelLg((ModelLg) comboBoxModelType.getSelectedItem());
			}	
			if(comboBoxBrandType.getSelectedItem()==BrandType.LENOVO)	
			{
				feature.setModelLenovo((ModelLenovo) comboBoxModelType.getSelectedItem());
			}	
			if(comboBoxBrandType.getSelectedItem()==BrandType.ONEPLUS)	
			{
				feature.setModelOneplus((ModelOneplus) comboBoxModelType.getSelectedItem());
			}	
			
			if(radioButtonYes.isSelected())
			{
				is4G = true;
			}else if(radioButtonNo.isSelected()){
				is4G = false;
			}
			
			if(!textFieldMemory.getText().equals(""))
			{
				internalMemory = Integer.parseInt(textFieldMemory.getText());	
			}
			if(!textFieldBattery.getText().equals(""))
			{
				battery = Integer.parseInt(textFieldBattery.getText());	
			}
			if(!textFieldRam.getText().equals(""))
			{
				ram = Integer.parseInt(textFieldRam.getText());	
			}
			if(!textFieldCpu.getText().equals(""))
			{
				cpu = textFieldCpu.getText();
			}
			if(!textFieldGpu.getText().equals(""))
			{
				gpu = textFieldGpu.getText();	
			}
			feature.setInternalMemory(internalMemory);
			feature.setBattery(battery);
			feature.setRam(ram);
			feature.setFourG(is4G);
			feature.setCpu(cpu);
			feature.setGpu(gpu);
			phone.setFeatures(feature);
			
			PhoneData.updateList(this.phone,phone);
			
			GuiScreensFactory.closeViewScreen();
			GuiScreensFactory.openViewScreen();
					
		}
		
		
	}
	

}
