package myCalculator;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Unit {

	private JFrame frame;
	private JTextField textField_Enter;
	private JTextField textFieldOutput;
	
	
	public double usd=.0124;
	
	public double eur=.0116;
	public double gbp=.0099;
	public double jpy=1.3427;
	public double aud=.0163;
	public double cad=.0165;
	public double chf=.0124;
	public double rmb=.0851;
	public double rupee=.792;
	
		
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Unit window = new Unit();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Unit() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelCurrency = new JPanel();
		panelCurrency.setBackground(SystemColor.desktop);
		panelCurrency.setBounds(0, 0, 434, 59);
		frame.getContentPane().add(panelCurrency);
		panelCurrency.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel.setBounds(68, 11, 318, 32);
		panelCurrency.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 59, 434, 203);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setForeground(new Color(255, 255, 255));
		comboBox1.setBackground(new Color(102, 205, 170));
		comboBox1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Choose one...", "USD", "EUR", "GBP", "JPY", "AUD", "CAD", "CHF", "RMB", "RUPEE"}));
		comboBox1.setBounds(37, 25, 124, 41);
		panel.add(comboBox1);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double taka=Double.parseDouble(textField_Enter.getText());
				
				
				
				if (comboBox1.getSelectedItem().equals("USD")) {
					
					String output=String.format("$ %.2f", taka*usd);
					textFieldOutput.setText(output);
				}
				if (comboBox1.getSelectedItem().equals("GBP")) {
					
						String output=String.format("GBP %.2f", taka*gbp);
						textFieldOutput.setText(output);
				}
				if (comboBox1.getSelectedItem().equals("EUR")) {
					
					String output=String.format("EUR %.2f", taka*eur);
					textFieldOutput.setText(output);
				}
				if (comboBox1.getSelectedItem().equals("JPY")) {
					
					String output=String.format("JPY %.2f", taka*jpy);
					textFieldOutput.setText(output);
				}
				if (comboBox1.getSelectedItem().equals("AUD")) {
					
					String output=String.format("AUD %.2f", taka*aud);
					textFieldOutput.setText(output);
				}
				if (comboBox1.getSelectedItem().equals("CAD")) {
					
					String output=String.format("CAD %.2f", taka*cad);
					textFieldOutput.setText(output);
				}
				if (comboBox1.getSelectedItem().equals("CHF")) {
					
					String output=String.format("CHF %.2f", taka*chf);
					textFieldOutput.setText(output);
				}
				if (comboBox1.getSelectedItem().equals("RMB")) {
					
					String output=String.format("RMB %.2f", taka*rmb);
					textFieldOutput.setText(output);
				}
				if (comboBox1.getSelectedItem().equals("RUPEE")) {
					
					String output=String.format("Rupee %.2f", taka*rupee);
					textFieldOutput.setText(output);
				}
								
			}
		});
		
		btnConvert.setFont(new Font("Century Gothic", Font.BOLD, 19));
		btnConvert.setFocusable(false);
		btnConvert.setForeground(SystemColor.menu);
		btnConvert.setBackground(SystemColor.desktop);
		btnConvert.setBounds(37, 89, 124, 41);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFocusable(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_Enter.setText(null);
				textFieldOutput.setText(null);
				comboBox1.setSelectedItem("Choose one...");
				
			}
		});
		btnClear.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBackground(new Color(210, 105, 30));
		btnClear.setBounds(37, 141, 124, 41);
		panel.add(btnClear);
		
		textField_Enter = new JTextField();
		textField_Enter.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textField_Enter.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Enter.setForeground(SystemColor.menu);
		textField_Enter.setBackground(SystemColor.desktop);
		textField_Enter.setBounds(204, 36, 206, 52);
		panel.add(textField_Enter);
		textField_Enter.setColumns(10);
		
		textFieldOutput = new JTextField();
		textFieldOutput.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textFieldOutput.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOutput.setForeground(SystemColor.menu);
		textFieldOutput.setBackground(SystemColor.desktop);
		textFieldOutput.setColumns(10);
		textFieldOutput.setBounds(204, 136, 206, 50);
		panel.add(textFieldOutput);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Amount");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_1.setBounds(268, 11, 124, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblOutput.setBounds(287, 111, 73, 14);
		panel.add(lblOutput);
	}
}
