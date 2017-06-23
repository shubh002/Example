package com.phone.gui_elements;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.phone.data.PhoneData;
import com.phone.phone_datamodel.entities.Features;
import com.phone.phone_datamodel.entities.Phone;
import com.phone.phone_datamodel.enums.BrandType;
import com.phone.phone_datamodel.enums.ModelApple;
import com.phone.phone_datamodel.enums.ModelHtc;
import com.phone.phone_datamodel.enums.ModelLenovo;
import com.phone.phone_datamodel.enums.ModelLg;
import com.phone.phone_datamodel.enums.ModelOneplus;
import com.phone.phone_datamodel.enums.ModelSamsung;
import com.phone.phone_datamodel.enums.OSType;
import javax.swing.JRadioButtonMenuItem;

public class AddScreen implements ActionListener{

	private JFrame frmPhoneTradingSystem;
	private JComboBox comboBoxOSType;
	private JComboBox comboBoxBrandType;
	private ButtonGroup radioButton = new ButtonGroup();
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private JLabel lblMemory;
	private JLabel lblFourG;
	private JLabel lblBrandType;
	private JLabel lblOSType;
	private JTextField textFieldMemory;
	private JLabel lblMemoryGb1;
	private JButton btnSave;
	private JLabel label;
	private JLabel lblModel;
	private JComboBox comboBoxModel;
	private DefaultComboBoxModel defaultComboBoxBrand;
	private DefaultComboBoxModel defaultComboBoxModel;
	private JLabel lblBattery;
	private JTextField textFieldBattery;
	private JLabel lblMah;
	private JTextField textFieldRam;
	private JLabel lblMemoryGb2;
	private JLabel lblCpu;
	private JTextField textFieldCpu;
	private JLabel lblGpu;
	private JTextField textFieldGpu;
	private JSeparator separator_1;
	private JButton btnExistingPhones;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddScreen window = new AddScreen();
					window.frmPhoneTradingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPhoneTradingSystem = new JFrame();
		frmPhoneTradingSystem.getContentPane().setBackground(Color.WHITE);
		frmPhoneTradingSystem.setType(Type.UTILITY);
		frmPhoneTradingSystem.getContentPane().setFont(
				new Font("Tahoma", Font.PLAIN, 12));
		frmPhoneTradingSystem.getContentPane().setCursor(
				Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmPhoneTradingSystem.getContentPane().setLayout(null);

		lblOSType = new JLabel("OS Type");
		lblOSType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOSType.setBounds(29, 27, 82, 29);
		frmPhoneTradingSystem.getContentPane().add(lblOSType);

		comboBoxOSType = new JComboBox();
		comboBoxOSType.setBackground(Color.WHITE);
		comboBoxOSType.setOpaque(false);
		comboBoxOSType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxOSType.setModel(new DefaultComboBoxModel(OSType.values()));
		comboBoxOSType.setBounds(140, 32, 97, 20);
		frmPhoneTradingSystem.getContentPane().add(comboBoxOSType);
		comboBoxOSType.addActionListener(this);
		
		
		lblBrandType = new JLabel("Brand");
		lblBrandType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBrandType.setBounds(29, 82, 82, 29);
		frmPhoneTradingSystem.getContentPane().add(lblBrandType);

		comboBoxBrandType = new JComboBox();
		comboBoxBrandType.setBackground(Color.WHITE);
		comboBoxBrandType.setOpaque(false);
		defaultComboBoxBrand = new DefaultComboBoxModel();
		comboBoxBrandType.setModel(defaultComboBoxBrand);
		comboBoxBrandType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxBrandType.setBounds(140, 87, 97, 20);
		frmPhoneTradingSystem.getContentPane().add(comboBoxBrandType);
		comboBoxBrandType.addActionListener(this);
		
		
		
		lblModel = new JLabel("Model");
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModel.setBounds(29, 148, 58, 29);
		frmPhoneTradingSystem.getContentPane().add(lblModel);
		
		
		
		
		
		comboBoxModel = new JComboBox();
		comboBoxModel.setBackground(Color.WHITE);
		comboBoxModel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxModel.setOpaque(false);
		defaultComboBoxModel = new DefaultComboBoxModel();
		comboBoxModel.setModel(defaultComboBoxModel);
		comboBoxModel.setBounds(140, 154, 97, 20);
		frmPhoneTradingSystem.getContentPane().add(comboBoxModel);
		
		
		

		lblFourG = new JLabel("4G Enabled");
		lblFourG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFourG.setBounds(29, 261, 82, 29);
		frmPhoneTradingSystem.getContentPane().add(lblFourG);

		rdbtnYes = new JRadioButton("YES");
		rdbtnYes.setBackground(Color.WHITE);
		rdbtnYes.setBounds(140, 266, 70, 23);
		frmPhoneTradingSystem.getContentPane().add(rdbtnYes);
		rdbtnYes.addActionListener(this);
		
		rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBackground(Color.WHITE);
		rdbtnNo.setBounds(212, 266, 70, 23);
		frmPhoneTradingSystem.getContentPane().add(rdbtnNo);
		
		radioButton.add(rdbtnNo);
		radioButton.add(rdbtnYes);

		lblMemory = new JLabel("Memory");
		lblMemory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMemory.setBounds(29, 322, 82, 29);
		frmPhoneTradingSystem.getContentPane().add(lblMemory);

		textFieldMemory = new JTextField();
		textFieldMemory.setBackground(Color.WHITE);
		textFieldMemory.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textFieldMemory.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {
				
				try{
					Integer.parseInt(Character.toString(e.getKeyChar()));
					
				}catch(Exception exc)
				{
					e.consume();	
				}
			}
			
			public void keyReleased(KeyEvent e) {
			
			}
			
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		

		
		textFieldMemory.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textFieldMemory.setBounds(140, 327, 51, 22);
		frmPhoneTradingSystem.getContentPane().add(textFieldMemory);

		lblMemoryGb1 = new JLabel("GB");
		lblMemoryGb1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMemoryGb1.setBounds(201, 323, 36, 29);
		frmPhoneTradingSystem.getContentPane().add(lblMemoryGb1);
		
		btnSave = new JButton("SAVE");
		btnSave.addActionListener(this);
		
		
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSave.setBounds(382, 482, 89, 23);
		frmPhoneTradingSystem.getContentPane().add(btnSave);
		
		label = new JLabel("");
		label.setBounds(29, 276, 46, 14);
		frmPhoneTradingSystem.getContentPane().add(label);
		
		lblBattery = new JLabel("Battery");
		lblBattery.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBattery.setBounds(29, 382, 58, 29);
		frmPhoneTradingSystem.getContentPane().add(lblBattery);
		
		textFieldBattery = new JTextField();
		textFieldBattery.setBackground(Color.WHITE);
		textFieldBattery.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textFieldBattery.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textFieldBattery.setBounds(140, 387, 70, 22);
		frmPhoneTradingSystem.getContentPane().add(textFieldBattery);
		textFieldBattery.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {
				
				try{
					Integer.parseInt(Character.toString(e.getKeyChar()));
					
				}catch(Exception exc)
				{
					e.consume();	
				}
			}
			
			public void keyReleased(KeyEvent e) {
			
			}
			
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		
		
		lblMah = new JLabel("mAh");
		lblMah.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMah.setBounds(212, 383, 36, 29);
		frmPhoneTradingSystem.getContentPane().add(lblMah);
		
		textFieldRam = new JTextField();
		textFieldRam.setBackground(Color.WHITE);
		textFieldRam.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textFieldRam.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textFieldRam.setBounds(600, 266, 28, 22);
		frmPhoneTradingSystem.getContentPane().add(textFieldRam);
		textFieldRam.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {
				
				try{
					Integer.parseInt(Character.toString(e.getKeyChar()));
					
				}catch(Exception exc)
				{
					e.consume();	
				}
			}
			
			public void keyReleased(KeyEvent e) {
			
			}
			
			public void keyPressed(KeyEvent e) {
				
			}
		});
		
		
		
		lblMemoryGb2 = new JLabel("GB");
		lblMemoryGb2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMemoryGb2.setBounds(632, 266, 36, 20);
		frmPhoneTradingSystem.getContentPane().add(lblMemoryGb2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 221, 961, 2);
		frmPhoneTradingSystem.getContentPane().add(separator);
		
		JLabel label_1 = new JLabel("RAM");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(517, 261, 58, 29);
		frmPhoneTradingSystem.getContentPane().add(label_1);
		
		lblCpu = new JLabel("CPU");
		lblCpu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpu.setBounds(517, 322, 46, 29);
		frmPhoneTradingSystem.getContentPane().add(lblCpu);
		
		textFieldCpu = new JTextField();
		textFieldCpu.setBackground(Color.WHITE);
		textFieldCpu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldCpu.setBounds(600, 328, 235, 20);
		frmPhoneTradingSystem.getContentPane().add(textFieldCpu);
		textFieldCpu.setColumns(10);
		
		lblGpu = new JLabel("GPU");
		lblGpu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGpu.setBounds(517, 382, 46, 29);
		frmPhoneTradingSystem.getContentPane().add(lblGpu);
		
		textFieldGpu = new JTextField();
		textFieldGpu.setBackground(Color.WHITE);
		textFieldGpu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldGpu.setColumns(10);
		textFieldGpu.setBounds(600, 388, 235, 20);
		frmPhoneTradingSystem.getContentPane().add(textFieldGpu);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(0, 453, 947, 2);
		frmPhoneTradingSystem.getContentPane().add(separator_1);
		
		btnExistingPhones = new JButton("Existing Phones");
		btnExistingPhones.addActionListener(this);
		btnExistingPhones.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExistingPhones.setBounds(517, 87, 131, 29);
		frmPhoneTradingSystem.getContentPane().add(btnExistingPhones);
		
		
		
		frmPhoneTradingSystem.setTitle("PHONE TRADING SYSTEM");
		frmPhoneTradingSystem.setBounds(100, 100, 874, 581);
		frmPhoneTradingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==comboBoxOSType)
		{
			if(comboBoxOSType.getSelectedItem()==OSType.ANDROID)
			{
				defaultComboBoxBrand.addElement(BrandType.values()[0]);
				for(int i=2;i<=6;i++)
				{
					defaultComboBoxBrand.addElement(BrandType.values()[i]);
				}
			}
			else
			{
				defaultComboBoxBrand.addElement(BrandType.values()[0]);
				defaultComboBoxBrand.addElement(BrandType.values()[1]);
			}
		}
		
		if(e.getSource()==comboBoxBrandType)
		{
			if(comboBoxBrandType.getSelectedItem()==BrandType.APPLE)
			{
				for(int i=0;i<=4;i++)
				{
					defaultComboBoxModel.addElement(ModelApple.values()[i]);
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.SAMSUNG)
			{
				for(int i=0;i<=5;i++)
				{
					defaultComboBoxModel.addElement(ModelSamsung.values()[i]);
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.HTC)
			{
				for(int i=0;i<=3;i++)
				{
					defaultComboBoxModel.addElement(ModelHtc.values()[i]);
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.LG)
			{
				for(int i=0;i<=4;i++)
				{
					defaultComboBoxModel.addElement(ModelLg.values()[i]);
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.LENOVO)
			{
				for(int i=0;i<=4;i++)
				{
					defaultComboBoxModel.addElement(ModelLenovo.values()[i]);
			
				}
			}
			else if(comboBoxBrandType.getSelectedItem()==BrandType.ONEPLUS)
			{
				for(int i=0;i<=4;i++)
				{
					defaultComboBoxModel.addElement(ModelOneplus.values()[i]);
			
				}
			}
			
		}
		
		
		
		
	
		boolean is4G = false;
		int internalMemory = 0;
		int ram=0;
		int battery=0;
		String cpu=null;
		String gpu=null;
		
		
		if(e.getSource()==rdbtnYes)
		{
			is4G = true;
		}else if(e.getSource()==rdbtnNo)
		{
			is4G = false;
		}
		if(e.getSource()==btnSave)
		{
			Phone phone = new Phone();
			
			Features feature = new Features();
			
			phone.setOperatingSystem((OSType)comboBoxOSType.getSelectedItem());
			feature.setBrand((BrandType)comboBoxBrandType.getSelectedItem());
			if(comboBoxBrandType.getSelectedItem()==BrandType.APPLE)
			{
				feature.setModelApple((ModelApple) comboBoxModel.getSelectedItem());
			}
			if(comboBoxBrandType.getSelectedItem()==BrandType.SAMSUNG)
			{	
				feature.setModelSamsung((ModelSamsung) comboBoxModel.getSelectedItem());
			}	
			if(comboBoxBrandType.getSelectedItem()==BrandType.HTC)	
			{	
				feature.setModelHtc((ModelHtc) comboBoxModel.getSelectedItem());
			}	
			if(comboBoxBrandType.getSelectedItem()==BrandType.LG)	
			{
				feature.setModelLg((ModelLg) comboBoxModel.getSelectedItem());
			}	
			if(comboBoxBrandType.getSelectedItem()==BrandType.LENOVO)	
			{
				feature.setModelLenovo((ModelLenovo) comboBoxModel.getSelectedItem());
			}	
			if(comboBoxBrandType.getSelectedItem()==BrandType.ONEPLUS)	
			{
				feature.setModelOneplus((ModelOneplus) comboBoxModel.getSelectedItem());
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
			PhoneData.addToList(phone);
			JOptionPane.showMessageDialog(null, "All Fields Saved Successfully "+PhoneData.readFromList().get(0));
		}
		
		if(e.getSource()==btnExistingPhones)
		{
			
			ViewScreen viewScreen = new ViewScreen(); 
			viewScreen.setVisible(true);
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}
}
