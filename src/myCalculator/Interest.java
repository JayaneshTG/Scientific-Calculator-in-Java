package myCalculator;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Interest {

	private JFrame frame;
	private JTextField textFieldAmount;
	private JTextField textFieldIntRate;
	private JTextField textFieldTotal;

	public double amount;
	public double int_rate;
	public double year;
	public double total_int;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Interest window = new Interest();
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
	public Interest() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlightText);
		frame.setBounds(100, 100, 400, 362);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 384, 55);
		panel.setBackground(new Color(102, 205, 170));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Interest Calculator");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel.setBounds(70, 11, 270, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1.setBounds(24, 66, 92, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblInterestRate = new JLabel("Interest Rate");
		lblInterestRate.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblInterestRate.setBounds(24, 118, 102, 25);
		frame.getContentPane().add(lblInterestRate);
		
		JLabel lblTime = new JLabel("Time Period");
		lblTime.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblTime.setBounds(24, 174, 102, 25);
		frame.getContentPane().add(lblTime);
		
		JLabel lblTotalInterest = new JLabel("Total interest");
		lblTotalInterest.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblTotalInterest.setBounds(195, 216, 135, 25);
		frame.getContentPane().add(lblTotalInterest);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAmount.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textFieldAmount.setBackground(SystemColor.menu);
		textFieldAmount.setBounds(136, 66, 194, 36);
		frame.getContentPane().add(textFieldAmount);
		textFieldAmount.setColumns(10);
		
		textFieldIntRate = new JTextField();
		textFieldIntRate.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIntRate.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textFieldIntRate.setColumns(10);
		textFieldIntRate.setBackground(SystemColor.menu);
		textFieldIntRate.setBounds(136, 113, 194, 36);
		frame.getContentPane().add(textFieldIntRate);
		
		JTextField textFieldTime = new JTextField();
		textFieldTime.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTime.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textFieldTime.setColumns(10);
		textFieldTime.setBackground(SystemColor.menu);
		textFieldTime.setBounds(136, 169, 194, 36);
		frame.getContentPane().add(textFieldTime);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTotal.setForeground(SystemColor.menu);
		textFieldTotal.setFont(new Font("Century Gothic", Font.BOLD, 16));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBackground(SystemColor.desktop);
		textFieldTotal.setBounds(156, 252, 171, 55);
		frame.getContentPane().add(textFieldTotal);
		
		JButton total = new JButton("=");
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				amount=Double.parseDouble(textFieldAmount.getText());
				year=Double.parseDouble(textFieldTime.getText());
				int_rate=Double.parseDouble(textFieldIntRate.getText());
				total_int=((amount*int_rate)/100)*year;
				
				textFieldTotal.setText(String.valueOf(total_int));
				
			}
		});
		
		total.setFont(new Font("Century Gothic", Font.BOLD, 25));
		total.setForeground(SystemColor.menu);
		total.setBackground(SystemColor.desktop);
		total.setBounds(24, 243, 92, 30);
		frame.getContentPane().add(total);
		
		JButton btnClearRate = new JButton("Clear");
		btnClearRate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textFieldTime.setText(null);
				textFieldAmount.setText(null);
				textFieldIntRate.setText(null);
				textFieldTotal.setText(null);
				
			}
		});
		
		btnClearRate.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnClearRate.setForeground(SystemColor.window);
		btnClearRate.setBackground(new Color(160, 82, 45));
		btnClearRate.setBounds(27, 284, 89, 30);
		frame.getContentPane().add(btnClearRate);
	}

}
