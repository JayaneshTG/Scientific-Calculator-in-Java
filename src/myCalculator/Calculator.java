/*
 *  ----- Lab Project ----------
 *  
 *  => A GUI based Calculator Application
 *  Language  :: Java
 *  Framework :: Swing
 *  Editor    :: Eclipse Neon
 *  JDK       :: 8.0 and above
 * 
 */


package myCalculator;

//import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

//import oneFrameToAnother.CheckBox_GUI;

//import oneFrameToAnother.CheckBox_GUI;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.SystemColor;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	
	double firstNumber, secondNumber, result;
	
	String operation;
	
	

	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Calculator window = new Calculator();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
	public Calculator() {
		initialize();
//		Calculator window = new Calculator();
		frame.setVisible(true);
	}

//	public Calculator() {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Calculator window = new Calculator();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		initialize();
//	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setBounds(100, 100, 296, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(SystemColor.inactiveCaptionBorder);
		textField.setBackground(SystemColor.textInactiveText);
		textField.setFont(new Font("Consolas", Font.BOLD, 25));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 26, 280, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		// ******************** Row 01 ***************************************
		
		
		JButton btn_Backspace = new JButton("<-");
		btn_Backspace.setForeground(SystemColor.menu);
		btn_Backspace.setBackground(new Color(139, 0, 0));
		btn_Backspace.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if (textField.getText().length()>0) {
					
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backSpace=strB.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btn_Backspace.setFont(new Font("Consolas", Font.BOLD, 16));
		btn_Backspace.setBounds(10, 103, 56, 49);
		frame.getContentPane().add(btn_Backspace);
		
		
		JButton btn_AllClear = new JButton("AC");
		btn_AllClear.setForeground(SystemColor.menu);
		btn_AllClear.setBackground(new Color(139, 0, 0));
		btn_AllClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText(null);
				
			}
		});
		btn_AllClear.setFont(new Font("Consolas", Font.BOLD, 16));
		btn_AllClear.setBounds(76, 103, 61, 50);
		frame.getContentPane().add(btn_AllClear);
		
		JButton btn_Percentage = new JButton("%");
		btn_Percentage.setForeground(Color.BLACK);
		btn_Percentage.setBackground(new Color(220, 220, 220));
		btn_Percentage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double percentage=Double.parseDouble(textField.getText())/100;
				String answer=String.format("%.3f", percentage);
				textField.setText(answer);
				
				
			}
		});
		btn_Percentage.setFont(new Font("Consolas", Font.BOLD, 17));
		btn_Percentage.setBounds(147, 102, 50, 50);
		frame.getContentPane().add(btn_Percentage);
		
		JButton btn_Plus = new JButton("+");
		btn_Plus.setBackground(new Color(220, 220, 220));
		btn_Plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btn_Plus.setBounds(209, 102, 61, 50);
		btn_Plus.setFont(new Font("Consolas", Font.BOLD, 17));
		frame.getContentPane().add(btn_Plus);
		
		
		
		// ******************** Row 02 ***************************************
		
		
		JButton btn_7 = new JButton("7");
		btn_7.setForeground(SystemColor.menu);
		btn_7.setBackground(SystemColor.desktop);
		btn_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ btn_7.getText();
				textField.setText(enter);
			}
		});
		btn_7.setBounds(10, 164, 60, 50);
		btn_7.setFont(new Font("Consolas", Font.BOLD, 17));
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setForeground(SystemColor.menu);
		btn_8.setBackground(SystemColor.desktop);
		btn_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ btn_8.getText();
				textField.setText(enter);
			}
		});
		btn_8.setFont(new Font("Consolas", Font.BOLD, 17));
		btn_8.setBounds(76, 164, 60, 50);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setForeground(SystemColor.menu);
		btn_9.setBackground(SystemColor.desktop);
		btn_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ btn_9.getText();
				textField.setText(enter);
			}
		});
		btn_9.setFont(new Font("Consolas", Font.BOLD, 17));
		btn_9.setBounds(147, 164, 50, 50);
		frame.getContentPane().add(btn_9);
		
		JButton btn_minus = new JButton("-");
		btn_minus.setBackground(new Color(220, 220, 220));
		btn_minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				
			}
		});
		btn_minus.setFont(new Font("Consolas", Font.BOLD, 17));
		btn_minus.setBounds(209, 163, 61, 50);
		frame.getContentPane().add(btn_minus);
		
		
		
		// ******************** Row 03 ***************************************
		
		
		
		JButton btn_4 = new JButton("4");
		btn_4.setForeground(SystemColor.menu);
		btn_4.setBackground(SystemColor.desktop);
		btn_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ btn_4.getText();
				textField.setText(enter);
			}
		});
		btn_4.setFont(new Font("Consolas", Font.BOLD, 17));
		btn_4.setBounds(10, 225, 56, 50);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setForeground(SystemColor.menu);
		btn_5.setBackground(SystemColor.desktop);
		btn_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ btn_5.getText();
				textField.setText(enter);
			}
		});
		btn_5.setFont(new Font("Consolas", Font.BOLD, 17));
		btn_5.setBounds(76, 224, 61, 50);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setForeground(SystemColor.menu);
		btn_6.setBackground(SystemColor.desktop);
		btn_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ btn_6.getText();
				textField.setText(enter);
			}
		});
		btn_6.setFont(new Font("Consolas", Font.BOLD, 17));
		btn_6.setBounds(147, 224, 50, 50);
		frame.getContentPane().add(btn_6);
		
		JButton btn_Multiply = new JButton("*");
		btn_Multiply.setBackground(new Color(220, 220, 220));
		btn_Multiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
			}
		});
		btn_Multiply.setFont(new Font("Consolas", Font.BOLD, 17));
		btn_Multiply.setBounds(209, 224, 61, 50);
		frame.getContentPane().add(btn_Multiply);
		
		
		
		// ******************** Row 04 ***************************************
		
		
		
		JButton button_1 = new JButton("1");
		button_1.setForeground(SystemColor.menu);
		button_1.setBackground(SystemColor.desktop);
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ button_1.getText();
				textField.setText(enter);
			}
		});
		button_1.setFont(new Font("Consolas", Font.BOLD, 17));
		button_1.setBounds(10, 285, 56, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setForeground(SystemColor.menu);
		button_2.setBackground(SystemColor.desktop);
		button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ button_2.getText();
				textField.setText(enter);
			}
		});
		button_2.setFont(new Font("Consolas", Font.BOLD, 17));
		button_2.setBounds(76, 285, 61, 50);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setForeground(SystemColor.menu);
		button_3.setBackground(SystemColor.desktop);
		button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ button_3.getText();
				textField.setText(enter);
			}
		});
		button_3.setFont(new Font("Consolas", Font.BOLD, 17));
		button_3.setBounds(147, 285, 50, 50);
		frame.getContentPane().add(button_3);
		
		JButton button_Division = new JButton("/");
		button_Division.setBackground(new Color(220, 220, 220));
		button_Division.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				
			}
		});
		button_Division.setFont(new Font("Consolas", Font.BOLD, 17));
		button_Division .setBounds(209, 285, 61, 50);
		frame.getContentPane().add(button_Division);
		
		
		
		// ******************** Row 05 ***************************************
		
		
		
		JButton button_Zero = new JButton("0");
		button_Zero.setForeground(SystemColor.menu);
		button_Zero.setBackground(SystemColor.desktop);
		
		button_Zero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField.getText()+ button_Zero.getText();
				textField.setText(enter);
			}
		});
		button_Zero.setFont(new Font("Consolas", Font.BOLD, 17));
		button_Zero.setBounds(147, 346, 50, 50);
		frame.getContentPane().add(button_Zero);
		
		JButton button_Point = new JButton(".");
		button_Point.setForeground(SystemColor.menu);
		button_Point.setBackground(SystemColor.desktop);
		button_Point.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String enter = textField.getText()+ button_Point.getText();
				textField.setText(enter);
				
			}
		});
		button_Point.setFont(new Font("Consolas", Font.BOLD, 17));
		button_Point.setBounds(76, 346, 61, 50);
		frame.getContentPane().add(button_Point);
		
		JButton button_PlusMinus = new JButton("+/-");
		button_PlusMinus.setBackground(new Color(220, 220, 220));
		button_PlusMinus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double plsmin= Double.parseDouble(textField.getText());
				plsmin=plsmin*(-1);
				textField.setText(String.valueOf(plsmin));
			
			}
		});
		button_PlusMinus.setFont(new Font("Consolas", Font.BOLD, 13));
		button_PlusMinus.setBounds(209, 348, 61, 50);
		frame.getContentPane().add(button_PlusMinus);
		
		JButton button_Equal = new JButton("=");
		button_Equal.setForeground(Color.WHITE);
		button_Equal.setBackground(new Color(46, 139, 87));
		button_Equal.addActionListener(new ActionListener() {
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String answer;
				secondNumber=Double.parseDouble(textField.getText());
				
				if (operation=="+") {
					result=firstNumber+secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operation=="-") {
					result=firstNumber-secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operation=="*") {
					result=firstNumber*secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operation=="/") {
					result=firstNumber/secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				
			}
		});
		button_Equal.setFont(new Font("Consolas", Font.BOLD, 17));
		button_Equal.setBounds(9, 346, 57, 50);
		frame.getContentPane().add(button_Equal);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 74, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu Select = new JMenu("Select");
		
		menuBar.add(Select);
		
		JMenuItem selectScientific = new JMenuItem("Scientific");
		selectScientific.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				new CheckBox_GUI();
//				frame.dispose();
				Scientific sc=new Scientific();
				frame.dispose();
				
				
			}
		});
		Select.add(selectScientific);
		
		JMenuItem selectCurrency = new JMenuItem("Currency");
		selectCurrency.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Unit unit=new Unit();
				
			}
		});
		Select.add(selectCurrency);
		
		JMenuItem selectInterest = new JMenuItem("Interest");
		selectInterest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Interest interest=new Interest();
				
			}
		});
		Select.add(selectInterest);
	
	
	
	}
}
