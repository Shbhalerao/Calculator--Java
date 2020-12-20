import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
    String operators;
    String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setBounds(100, 100, 284, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		textField.setBounds(10, 11, 248, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	    JButton btn7 = new JButton("7");
		btn7.setForeground(UIManager.getColor("Button.darkShadow"));
		btn7.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(10, 132, 55, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setForeground(UIManager.getColor("Button.darkShadow"));
		btn8.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn8.setBounds(75, 132, 55, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setForeground(UIManager.getColor("Button.darkShadow"));
		btn9.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn9.setBounds(140, 132, 55, 55);
		frame.getContentPane().add(btn9);
		
		JButton btnPLUS = new JButton("+");
		btnPLUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "+";
			}
		});
		btnPLUS.setForeground(UIManager.getColor("CheckBox.light"));
		btnPLUS.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btnPLUS.setBounds(204, 66, 55, 55);
		frame.getContentPane().add(btnPLUS);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setForeground(UIManager.getColor("Button.darkShadow"));
		btn4.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn4.setBounds(10, 198, 55, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setForeground(UIManager.getColor("Button.darkShadow"));
		btn5.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn5.setBounds(75, 198, 55, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setForeground(UIManager.getColor("Button.darkShadow"));
		btn6.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn6.setBounds(140, 198, 55, 55);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setForeground(UIManager.getColor("Button.darkShadow"));
		btn1.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn1.setBounds(10, 264, 55, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setForeground(UIManager.getColor("Button.darkShadow"));
		btn2.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn2.setBounds(75, 264, 55, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setForeground(UIManager.getColor("Button.darkShadow"));
		btn3.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn3.setBounds(140, 264, 55, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "-";
			}
		});
		btnSub.setForeground(UIManager.getColor("CheckBox.light"));
		btnSub.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btnSub.setBounds(204, 132, 55, 55);
		frame.getContentPane().add(btnSub);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "*";
			}
		});
		btnMult.setForeground(UIManager.getColor("CheckBox.light"));
		btnMult.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btnMult.setBounds(204, 198, 55, 55);
		frame.getContentPane().add(btnMult);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setForeground(UIManager.getColor("Button.darkShadow"));
		btn0.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btn0.setBounds(10, 330, 55, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField.getText().contains("."))
		          {
		          textField.setText(textField.getText() + btnDot.getText());
		          }
			}
		});
		btnDot.setForeground(UIManager.getColor("Button.darkShadow"));
		btnDot.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btnDot.setBounds(75, 330, 55, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setForeground(UIManager.getColor("Button.darkShadow"));
		btnPM.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 20));
		btnPM.setBounds(140, 330, 55, 55);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(textField.getText());
			
				//addition
				if (operators == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				//subtraction
				else if (operators == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				//multiplication
				else if (operators == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
				
				
				//Division
				
				else if (operators == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				//Percentile
				
				else if (operators == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnEqual.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btnEqual.setBounds(204, 330, 55, 55);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "/";
			}
		});
		btnDiv.setForeground(UIManager.getColor("CheckBox.light"));
		btnDiv.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btnDiv.setBounds(204, 264, 55, 55);
		frame.getContentPane().add(btnDiv);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operators = "%";
			}
		});
		btnPercentage.setForeground(UIManager.getColor("Button.darkShadow"));
		btnPercentage.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btnPercentage.setBounds(140, 66, 55, 55);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setForeground(UIManager.getColor("Button.darkShadow"));
		btnC.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 18));
		btnC.setBounds(75, 66, 55, 55);
		frame.getContentPane().add(btnC);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Back = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					Back = strB.toString();
					textField.setText(Back);
				}
			}
		});
		btnBack.setForeground(UIManager.getColor("Button.darkShadow"));
		btnBack.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 20));
		btnBack.setBounds(10, 66, 55, 55);
		frame.getContentPane().add(btnBack);
	}
}
