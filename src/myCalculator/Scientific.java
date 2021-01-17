/*
 *  ----- Lab Project ----------
 *  
 *  => A GUI based Calculator Application
 *  Language  :: Java
 *  Framework :: Swing
 *  Editor    :: Eclipse Neon
 *  JDK       :: 8.0 and above
 *  
 *  Date      :: 8 April, 2017
 *  Time      :: 10:50 PM
 *  
 *  Copyright :: Manash Kumar Mondal
 *  Email     :: manashmondalcse@gmail.com
 * 
 */

package myCalculator;

import java.awt.Color;
//import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
//import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Scientific {

	private JFrame frame;
	private JTextField textField1;
	double firstNumber, secondNumber, result;
	
	public String operation;
	public int z=0;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Scientific window = new Scientific();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Scientific window = new Scientific();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	

	/**
	 * Create the application.
	 */
	public Scientific() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 604, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// ***************** Row 01 *********************
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Consolas", Font.BOLD, 25));
		textField1.setForeground(SystemColor.inactiveCaptionBorder);
		//textField1.setFont(new Font("Consolas", Font.BOLD, 25));
		textField1.setBackground(SystemColor.inactiveCaptionText);
		textField1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField1.setBounds(0, 23, 588, 61);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.setFocusable(false);
		
		btnBackSpace.setForeground(SystemColor.menu);
		btnBackSpace.setBackground(new Color(139, 0, 0));
		btnBackSpace.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if (textField1.getText().length()>0) {
					
					StringBuilder strB=new StringBuilder(textField1.getText());
					strB.deleteCharAt(textField1.getText().length()-1);
					backSpace=strB.toString();
					textField1.setText(backSpace);
				}
				
			}
		});
		btnBackSpace.setFont(new Font("Consolas", Font.BOLD, 16));
		btnBackSpace.setBounds(10, 104, 55, 50);
		frame.getContentPane().add(btnBackSpace);
		
		
		JButton btnAc = new JButton("AC");
		btnAc.setFocusable(false);
		btnAc.setForeground(SystemColor.menu);
		btnAc.setBackground(new Color(139, 0, 0));
		btnAc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField1.setText(null);
				z=0;
			}
		});
		btnAc.setFont(new Font("Consolas", Font.BOLD, 16));
		btnAc.setBounds(69, 104, 56, 50);
		frame.getContentPane().add(btnAc);
		
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setFocusable(false);
		btnPlusMinus.setBackground(new Color(220, 220, 220));
		btnPlusMinus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double plsmin= Double.parseDouble(textField1.getText());
				plsmin=plsmin*(-1);
				textField1.setText(String.valueOf(plsmin));
			
			}
		});
		btnPlusMinus.setFont(new Font("Consolas", Font.BOLD, 13));
		//button_PlusMinus.setBounds(209, 348, 61, 50);
		btnPlusMinus.setBounds(128, 104, 56, 50);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFocusable(false);
		btnPlus.setBackground(new Color(220, 220, 220));
		btnPlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(textField1.getText());
				textField1.setText("");
				operation="+";
				z=0;
			}
		});
		btnPlus.setFont(new Font("Consolas", Font.BOLD, 17));
		btnPlus.setBounds(191, 104, 56, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.setFocusable(false);
		btnRoot.setForeground(SystemColor.menu);
		btnRoot.setBackground(SystemColor.desktop);
		btnRoot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops= Math.sqrt(ops);
				textField1.setText(String.valueOf(ops));
				
			}
		});
		btnRoot.setBounds(281, 104, 65, 50);
		frame.getContentPane().add(btnRoot);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setFocusable(false);
		btnSin.setForeground(SystemColor.menu);
		btnSin.setBackground(SystemColor.desktop);
		btnSin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=Math.toRadians(ops);
				double rd=Math.sin(ops);
				textField1.setText(String.valueOf(rd));

				
			}
		});
		btnSin.setBounds(356, 104, 64, 50);
		frame.getContentPane().add(btnSin);
		
		JButton btnhSin = new JButton("Sinh");
		btnhSin.setFocusable(false);
		btnhSin.setForeground(SystemColor.menu);
		btnhSin.setBackground(SystemColor.desktop);
		btnhSin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=Math.toRadians(ops);
				double rd=Math.sinh(ops);
				textField1.setText(String.valueOf(rd));

				
			}
		});
		btnhSin.setBounds(430, 104, 65, 50);
		frame.getContentPane().add(btnhSin);
		
		JButton btnX2Y = new JButton("x^y");
		btnX2Y.setFocusable(false);
		btnX2Y.setForeground(SystemColor.menu);
		btnX2Y.setBackground(SystemColor.desktop);
		btnX2Y.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(String.valueOf(textField1.getText()));
				//ops=Math.pow(a, b)
//				firstNumber=Double.parseDouble(textField1.getText());
				textField1.setText("");
				operation="x^y";
			}
		});
		btnX2Y.setBounds(505, 104, 67, 50);
		frame.getContentPane().add(btnX2Y);
		
		// ******************  Row 02 *******************
		
		JButton btn7 = new JButton("7");
		btn7.setFocusable(false);
		btn7.setForeground(SystemColor.menu);
		btn7.setBackground(SystemColor.desktop);
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn7.getText();
				textField1.setText(enter);
			}
		});
		btn7.setFont(new Font("Consolas", Font.BOLD, 17));
		btn7.setBounds(10, 165, 55, 50);
		frame.getContentPane().add(btn7);
		
		
		JButton btn8 = new JButton("8");
		btn8.setFocusable(false);
		btn8.setForeground(SystemColor.menu);
		btn8.setBackground(SystemColor.desktop);
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn8.getText();
				textField1.setText(enter);
			}
		});
		btn8.setFont(new Font("Consolas", Font.BOLD, 17));
		//btn_8.setBounds(76, 164, 60, 50);
		btn8.setBounds(69, 165, 56, 50);
		frame.getContentPane().add(btn8);
		
		
		JButton btn9 = new JButton("9");
		btn9.setFocusable(false);
		btn9.setForeground(SystemColor.menu);
		btn9.setBackground(SystemColor.desktop);
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn9.getText();
				textField1.setText(enter);
			}
		});
		btn9.setFont(new Font("Consolas", Font.BOLD, 17));
		//btn_9.setBounds(147, 164, 50, 50);
		btn9.setBounds(128, 165, 56, 50);
		frame.getContentPane().add(btn9);
		
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFocusable(false);
		btnMinus.setBackground(new Color(220, 220, 220));
		btnMinus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(textField1.getText());
				textField1.setText("");
				operation="-";
				z=0;
			}
		});
		btnMinus.setFont(new Font("Consolas", Font.BOLD, 17));
		btnMinus.setBounds(191, 165, 56, 50);
		frame.getContentPane().add(btnMinus);
		
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.setFocusable(false);
		btnCbr.setForeground(SystemColor.menu);
		btnCbr.setBackground(SystemColor.desktop);
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=Math.cbrt(ops);
				textField1.setText(String.valueOf(ops));
			}
		});
		btnCbr.setBounds(281, 166, 65, 50);
		frame.getContentPane().add(btnCbr);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setFocusable(false);
		btnCos.setForeground(SystemColor.menu);
		btnCos.setBackground(SystemColor.desktop);
		btnCos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=Math.toRadians(ops);
				double rd=Math.cos(ops);
				textField1.setText(String.valueOf(rd));
				
			}
		});
		btnCos.setBounds(355, 165, 65, 50);
		frame.getContentPane().add(btnCos);
		
		JButton btnhcos = new JButton("Cosh");
		btnhcos.setFocusable(false);
		btnhcos.setForeground(SystemColor.menu);
		btnhcos.setBackground(SystemColor.desktop);
		btnhcos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=Math.toRadians(ops);
				double rd=Math.cosh(ops);
				textField1.setText(String.valueOf(rd));
				
			}
		});
		btnhcos.setBounds(430, 166, 65, 50);
		frame.getContentPane().add(btnhcos);
		
		JButton btnX2 = new JButton("x^2");
		btnX2.setFocusable(false);
		btnX2.setForeground(SystemColor.menu);
		btnX2.setBackground(SystemColor.desktop);
		btnX2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=ops*ops;
				textField1.setText(String.valueOf(ops));
			}
		});
		btnX2.setBounds(505, 165, 67, 50);
		frame.getContentPane().add(btnX2);
		
		//************* Row 03 ***************************
		
		JButton btn4 = new JButton("4");
		btn4.setFocusable(false);
		btn4.setForeground(SystemColor.menu);
		btn4.setBackground(SystemColor.desktop);
		btn4.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn4.getText();
				textField1.setText(enter);
			}
		});
		btn4.setFont(new Font("Consolas", Font.BOLD, 17));
		btn4.setBounds(10, 226, 55, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFocusable(false);
		btn5.setForeground(SystemColor.menu);
		btn5.setBackground(SystemColor.desktop);
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn5.getText();
				textField1.setText(enter);
			}
		});
		btn5.setFont(new Font("Consolas", Font.BOLD, 17));
		btn5.setBounds(69, 226, 56, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFocusable(false);
		btn6.setForeground(SystemColor.menu);
		btn6.setBackground(SystemColor.desktop);
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn6.getText();
				textField1.setText(enter);
			}
		});
		btn6.setFont(new Font("Consolas", Font.BOLD, 17));
		btn6.setBounds(128, 226, 56, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setFocusable(false);
		btnMulti.setBackground(new Color(220, 220, 220));
		btnMulti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(textField1.getText());
				textField1.setText("");
				operation="*";
				z=0;
			}
		});
		btnMulti.setFont(new Font("Consolas", Font.BOLD, 17));
		//btn_Multiply.setBounds(209, 224, 61, 50);
		btnMulti.setBounds(191, 226, 56, 50);
		frame.getContentPane().add(btnMulti);
		
		JButton btnInverse = new JButton("1/x");
		btnInverse.setFocusable(false);
		btnInverse.setForeground(SystemColor.menu);
		btnInverse.setBackground(SystemColor.desktop);
		btnInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=1/ops;
				textField1.setText(String.valueOf(ops));
			}
		});
		btnInverse.setBounds(281, 227, 65, 50);
		frame.getContentPane().add(btnInverse);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setFocusable(false);
		btnTan.setForeground(SystemColor.menu);
		btnTan.setBackground(SystemColor.desktop);
		btnTan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=Math.toRadians(ops);
				double rd=Math.tan(ops);
				textField1.setText(String.valueOf(rd));

				
			}
		});
		btnTan.setBounds(356, 227, 65, 50);
		frame.getContentPane().add(btnTan);
		
		JButton btnhTan = new JButton("Tanh");
		btnhTan.setFocusable(false);
		btnhTan.setForeground(SystemColor.menu);
		btnhTan.setBackground(SystemColor.desktop);
		btnhTan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=Math.toRadians(ops);
				double rd=Math.tanh(ops);
				textField1.setText(String.valueOf(rd));
				
			}
		});
		btnhTan.setBounds(430, 227, 65, 50);
		frame.getContentPane().add(btnhTan);
		
		JButton btnX3 = new JButton("x^3");
		btnX3.setFocusable(false);
		btnX3.setForeground(SystemColor.menu);
		btnX3.setBackground(SystemColor.desktop);
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				ops=ops*ops*ops;
				textField1.setText(String.valueOf(ops));
				
			}
		});
		btnX3.setBounds(505, 227, 67, 50);
		frame.getContentPane().add(btnX3);
		
		// *************** Row 04 ***********************
		
		JButton btn1 = new JButton("1");
		btn1.setFocusable(false);
		btn1.setForeground(SystemColor.menu);
		btn1.setBackground(SystemColor.desktop);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn1.getText();
				textField1.setText(enter);
			}
		});
		btn1.setFont(new Font("Consolas", Font.BOLD, 17));
		btn1.setBounds(10, 287, 55, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFocusable(false);
		btn2.setForeground(SystemColor.menu);
		btn2.setBackground(SystemColor.desktop);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn2.getText();
				textField1.setText(enter);
			}
		});
		btn2.setFont(new Font("Consolas", Font.BOLD, 17));
		btn2.setBounds(69, 287, 56, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFocusable(false);
		btn3.setForeground(SystemColor.menu);
		btn3.setBackground(SystemColor.desktop);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btn3.getText();
				textField1.setText(enter);
			}
		});
		btn3.setFont(new Font("Consolas", Font.BOLD, 17));
		btn3.setBounds(128, 287, 56, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setFocusable(false);
		btnDivision.setBackground(new Color(220, 220, 220));
		btnDivision.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstNumber=Double.parseDouble(textField1.getText());
				textField1.setText("");
				operation="/";
				z=0;
			}
		});
		btnDivision.setFont(new Font("Consolas", Font.BOLD, 17));
		//button_Division .setBounds(209, 285, 61, 50);
		btnDivision.setBounds(191, 287, 56, 50);
		frame.getContentPane().add(btnDivision);
		
		JButton btnfact = new JButton("!");
		btnfact.setFocusable(false);
		btnfact.setForeground(SystemColor.menu);
		btnfact.setBackground(SystemColor.desktop);
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//double ops=Double.parseDouble(String.valueOf(textField1.getText()));
				int a = Integer.parseInt(String.valueOf(textField1.getText()));
				int ans=fact(a);
				textField1.setText(String.valueOf(ans));
			
			
			}
		});
		btnfact.setBounds(281, 288, 65, 50);
		frame.getContentPane().add(btnfact);
		
		JButton btnBinary = new JButton("Bin");
		btnBinary.setFocusable(false);
		btnBinary.setForeground(SystemColor.menu);
		btnBinary.setBackground(SystemColor.desktop);
		btnBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(String.valueOf(textField1.getText()));
				textField1.setText(Integer.toBinaryString(a));
			}
		});
		btnBinary.setBounds(356, 288, 65, 50);
		frame.getContentPane().add(btnBinary);
		
		JButton btnHexa = new JButton("Hex");
		btnHexa.setFocusable(false);
		btnHexa.setForeground(SystemColor.menu);
		btnHexa.setBackground(SystemColor.desktop);
		btnHexa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(String.valueOf(textField1.getText()));
				textField1.setText(Integer.toHexString(a));
			}
		});
		btnHexa.setBounds(430, 288, 65, 50);
		frame.getContentPane().add(btnHexa);
		
		JButton btnLn = new JButton("log");
		btnLn.setFocusable(false);
		btnLn.setForeground(SystemColor.menu);
		btnLn.setBackground(SystemColor.desktop);
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops=Double.parseDouble(String.valueOf(textField1.getText()));
			ops=Math.log10(ops);
			textField1.setText(String.valueOf(ops));
			
			}
		});
		btnLn.setBounds(505, 288, 67, 50);
		frame.getContentPane().add(btnLn);
		
		//************************ Row 05 **********************
		
		JButton btnZero = new JButton("0");
		btnZero.setFocusable(false);
		btnZero.setForeground(SystemColor.menu);
		btnZero.setBackground(SystemColor.desktop);
		
		btnZero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String enter = textField1.getText()+ btnZero.getText();
				textField1.setText(enter);
			}
		});
		btnZero.setFont(new Font("Consolas", Font.BOLD, 17));
		btnZero.setBounds(10, 343, 55, 50);
		frame.getContentPane().add(btnZero);
		
		JButton btnPoint = new JButton(".");
		btnPoint.setFocusable(false);
		btnPoint.setForeground(SystemColor.menu);
		btnPoint.setBackground(SystemColor.desktop);
		btnPoint.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (z==0) {
					String enter = textField1.getText()+ btnPoint.getText();
					textField1.setText(enter);
					z=1;
				}
				
				
			}
		});
		btnPoint.setFont(new Font("Consolas", Font.BOLD, 17));
		//btnPoint.setBounds(76, 346, 61, 50);
		btnPoint.setBounds(69, 343, 56, 50);
		frame.getContentPane().add(btnPoint);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFocusable(false);
		btnEqual.setForeground(Color.WHITE);
		btnEqual.setBackground(new Color(46, 139, 87));
		btnEqual.addActionListener(new ActionListener() {
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String answer;
				secondNumber=Double.parseDouble(textField1.getText());
				
				if (operation=="+") {
					result=firstNumber+secondNumber;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
					
				} else if (operation=="-") {
					result=firstNumber-secondNumber;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
					
				} else if (operation=="*") {
					result=firstNumber*secondNumber;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
					
				} else if (operation=="/") {
					result=firstNumber/secondNumber;
					answer=String.format("%.2f", result);
					textField1.setText(answer);
					
				}else if(operation=="x^y") {
					result=Math.pow(firstNumber, secondNumber);
					answer=String.format("%.2f", result);
					textField1.setText(answer);
					
				}
				
			}
		});
		btnEqual.setFont(new Font("Consolas", Font.BOLD, 17));
		
		btnEqual.setBounds(128, 343, 119, 50);
		frame.getContentPane().add(btnEqual);
		
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.setFocusable(false);
		btnPercentage.setForeground(SystemColor.menu);
		btnPercentage.setBackground(SystemColor.desktop);
		
		btnPercentage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double percentage=Double.parseDouble(textField1.getText())/100;
				String answer=String.format("%.3f", percentage);
				textField1.setText(answer);
				
				
			}
		});
		btnPercentage.setFont(new Font("Consolas", Font.BOLD, 17));
		
		btnPercentage.setBounds(281, 343, 65, 50);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnOctal = new JButton("Oct");
		btnOctal.setFocusable(false);
		btnOctal.setForeground(SystemColor.menu);
		btnOctal.setBackground(SystemColor.desktop);
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=Integer.parseInt(String.valueOf(textField1.getText()));
				textField1.setText(Integer.toOctalString(a));
			}
		});
		btnOctal.setBounds(355, 344, 65, 50);
		frame.getContentPane().add(btnOctal);
		
		JButton btnPi = new JButton("pi");
		btnPi.setFocusable(false);
		btnPi.setForeground(SystemColor.menu);
		btnPi.setBackground(SystemColor.desktop);
		btnPi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=3.1416;
				
				textField1.setText(String.valueOf(ops));

				
			}
		});
		btnPi.setBounds(430, 344, 65, 50);
		frame.getContentPane().add(btnPi);
		
		JButton btn2Pi = new JButton("2pi");
		btn2Pi.setFocusable(false);
		btn2Pi.setForeground(SystemColor.menu);
		btn2Pi.setBackground(SystemColor.desktop);
		btn2Pi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double ops=(3.1416)*2;
				
				textField1.setText(String.valueOf(ops));

				
			}
		});
		btn2Pi.setBounds(505, 344, 67, 50);
		frame.getContentPane().add(btn2Pi);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFocusable(false);
		menuBar.setBounds(0, 0, 48, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnSelect = new JMenu("Select");
		menuBar.add(mnSelect);
		
		JMenuItem selectStandard = new JMenuItem("Standard");
		selectStandard.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			Calculator cl=new Calculator();
			frame.dispose();
				
			}
		});
		mnSelect.add(selectStandard);
		
		JMenuItem selectSCtoCu = new JMenuItem("Currency");
		selectSCtoCu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Unit un=new Unit();
//			Calculator cl=new Calculator();
//			//frame.dispose();
				
			}
		});
		mnSelect.add(selectSCtoCu);
		
		JMenuItem selectSCtoIn = new JMenuItem("Interest");
		selectSCtoIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Interest intr=new Interest();
//			Calculator cl=new Calculator();
//			frame.dispose();
				
			}
		});
		mnSelect.add(selectSCtoIn);
	}
	
	public int fact(int n) {
		return n==1? 1 : n*fact(n-1);
	}
}
