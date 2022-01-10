package com.vn.slide2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FormUI {

	private JFrame frame;
	private JTextField txtHoTen;
	private JTextField txtPhone;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormUI window = new FormUI();
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
	public FormUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHoTen = new JLabel("Ho\u0323 T\u00EAn");
		lblHoTen.setBounds(54, 58, 50, 28);
		frame.getContentPane().add(lblHoTen);
		
		JLabel lblPhone = new JLabel("Phone Number");
		lblPhone.setBounds(54, 111, 81, 14);
		frame.getContentPane().add(lblPhone);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(138, 62, 147, 20);
		frame.getContentPane().add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(138, 108, 147, 20);
		frame.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);
		txtPhone.setText("0");
		
		JRadioButton rdbNam = new JRadioButton("Nam");
		buttonGroup.add(rdbNam);
		rdbNam.setBounds(133, 231, 58, 23);
		rdbNam.setSelected(true);
		
		frame.getContentPane().add(rdbNam);
		
		JRadioButton rdbNu = new JRadioButton("N\u01B0\u0303");
		buttonGroup.add(rdbNu);
		rdbNu.setBounds(206, 231, 109, 23);
		frame.getContentPane().add(rdbNu);
		
		JLabel lblNewLabel = new JLabel("Gi\u01A1\u0301i ti\u0301nh");
		lblNewLabel.setBounds(49, 235, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox cboCountry = new JComboBox();
		cboCountry.setModel(new DefaultComboBoxModel(new String[] {"Viet nam", "Sing", "US", "UK", "Lao"}));
		cboCountry.setBounds(138, 186, 147, 22);
		frame.getContentPane().add(cboCountry);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoten = txtHoTen.getText();
				
				//TODO validate show message cho nguoi dung nhap
				//TODO se save lai thong tin nguoi dung trong CSDL
				
				String diachi = (String)cboCountry.getSelectedItem();
				
				JOptionPane.showMessageDialog(frame, "Ban da nha hoten la : " + hoten + "Dia chi: " + diachi);
				
				
				
			}
		});
		btnSave.setBounds(418, 61, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(418, 107, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox chkNgheNhac = new JCheckBox("Nghe nha\u0323c");
		chkNgheNhac.setBounds(213, 269, 81, 23);
		frame.getContentPane().add(chkNgheNhac);
		
		JCheckBox chkBongda = new JCheckBox("Bo\u0301ng \u0111a\u0301");
		chkBongda.setBounds(135, 269, 81, 23);
		frame.getContentPane().add(chkBongda);
		
		JLabel lblNewLabel_1 = new JLabel("S\u01A1\u0309 thi\u0301ch");
		lblNewLabel_1.setBounds(49, 273, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(138, 148, 147, 20);
		frame.getContentPane().add(txtPassword);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(54, 151, 81, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(54, 190, 81, 14);
		frame.getContentPane().add(lblCountry);
		
	}
}
