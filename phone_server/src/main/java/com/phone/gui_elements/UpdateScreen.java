package com.phone.gui_elements;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Window.Type;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateScreen extends JFrame implements KeyListener, ActionListener {

	private JPanel contentPane;
	private JTextField textFieldMemory;
	private JTextField textFieldBattery;
	private JTextField textFieldRam;
	private JTextField textFieldCpu;
	private JTextField textFieldGpu;
	private JLabel lbl4gEnabled;
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private ButtonGroup radioButton = new ButtonGroup();
	private JLabel lblMemory;
	private JLabel lblGb;
	private JLabel lblBattery;
	private JLabel lblMah;
	private JLabel lblRam;
	private JLabel lblGb_1;
	private JLabel lblCpu;
	private JLabel lblGpu;
	private JButton btnUpdate;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateScreen frame = new UpdateScreen();
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
	public UpdateScreen() {
		setType(Type.UTILITY);
		setTitle("UPDATE INFORMATION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl4gEnabled = new JLabel("4G Enabled");
		lbl4gEnabled.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl4gEnabled.setBounds(33, 40, 79, 24);
		contentPane.add(lbl4gEnabled);
		
		rdbtnYes = new JRadioButton("YES");
		rdbtnYes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnYes.setBackground(Color.WHITE);
		rdbtnYes.setBounds(133, 43, 66, 23);
		contentPane.add(rdbtnYes);
		
		rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBackground(Color.WHITE);
		rdbtnNo.setBounds(220, 43, 66, 23);
		contentPane.add(rdbtnNo);
		
		radioButton.add(rdbtnYes);
		radioButton.add(rdbtnNo);
		
		lblMemory = new JLabel("Memory");
		lblMemory.setBackground(Color.WHITE);
		lblMemory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMemory.setBounds(33, 95, 66, 24);
		contentPane.add(lblMemory);
		
		textFieldMemory = new JTextField();
		textFieldMemory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldMemory.setBounds(133, 99, 59, 20);
		contentPane.add(textFieldMemory);
		textFieldMemory.setColumns(10);
		textFieldMemory.addKeyListener(this);
		
		lblGb = new JLabel("GB");
		lblGb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGb.setBounds(195, 100, 24, 17);
		contentPane.add(lblGb);
		
		lblBattery = new JLabel("Battery");
		lblBattery.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBattery.setBounds(33, 152, 66, 24);
		contentPane.add(lblBattery);
		
		textFieldBattery = new JTextField();
		textFieldBattery.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldBattery.setBounds(133, 156, 72, 20);
		contentPane.add(textFieldBattery);
		textFieldBattery.setColumns(10);
		textFieldBattery.addKeyListener(this);
		
		lblMah = new JLabel("mAh");
		lblMah.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMah.setBounds(209, 159, 46, 14);
		contentPane.add(lblMah);
		
		lblRam = new JLabel("RAM");
		lblRam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRam.setBounds(33, 212, 66, 24);
		contentPane.add(lblRam);
		
		textFieldRam = new JTextField();
		textFieldRam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldRam.setBounds(133, 216, 32, 20);
		contentPane.add(textFieldRam);
		textFieldRam.setColumns(10);
		textFieldRam.addKeyListener(this);
		
		lblGb_1 = new JLabel("GB");
		lblGb_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGb_1.setBounds(173, 219, 24, 17);
		contentPane.add(lblGb_1);
		
		lblCpu = new JLabel("CPU");
		lblCpu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpu.setBounds(33, 277, 66, 24);
		contentPane.add(lblCpu);
		
		textFieldCpu = new JTextField();
		textFieldCpu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldCpu.setBounds(133, 281, 271, 20);
		contentPane.add(textFieldCpu);
		textFieldCpu.setColumns(10);
		
		lblGpu = new JLabel("GPU");
		lblGpu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGpu.setBounds(33, 333, 66, 24);
		contentPane.add(lblGpu);
		
		textFieldGpu = new JTextField();
		textFieldGpu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldGpu.setBounds(133, 337, 271, 20);
		contentPane.add(textFieldGpu);
		textFieldGpu.setColumns(10);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(this);
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBounds(337, 404, 89, 23);
		contentPane.add(btnUpdate);
	}
	
	
	public void keyTyped(KeyEvent e) {
		
		if(e.getSource()==textFieldRam||e.getSource()==textFieldMemory||e.getSource()==textFieldBattery){
			try{
				Integer.parseInt(Character.toString(e.getKeyChar()));
				
			}catch(Exception exc)
			{
				e.consume();	
			}
		}
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnUpdate)
		{
						
		}
		
		
	}
	

}
