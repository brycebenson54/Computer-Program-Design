import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Calculator extends JFrame implements ActionListener {
	JTextField tf;
	double tem_1, tem_11, ans, a1;
	static double m_1, m_2;
	int k1 = 1, x1 = 0, y1 = 0, z1 = 0;
	char ch;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, zero_val, clear_val, squared, cubed, expression,
	factorial, add, minius, divide, log, recep, multiply, equal_sign, add_sub, dot, mr, mc, mp,
	mm, sqrt, sin, cos, tan;
	Container cont1;
	JPanel t_Panel, b_panel;

	Calculator() {
		cont1 = getContentPane();
		cont1.setLayout(new BorderLayout());
		JPanel t_Panel = new JPanel();
		tf = new JTextField(25);
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent keyevent) {
				char c1 = keyevent.getKeyChar();
				if (c1>= '0' && c1 <= '9') {
				}
				else {
					keyevent.consume();
				}
			}
		});
		t_Panel.add(tf);
		b_panel = new JPanel();
		b_panel.setLayout(new GridLayout(8, 4, 2, 2));
		boolean t = true;
		
		mr = new JButton("MR");
		b_panel.add(mr);
		
		mr.addActionListener(this);
		mc = new JButton("C");
		
		b_panel.add(mc);
		mc.addActionListener(this);

		mp = new JButton("M+");
		b_panel.add(mp);
		mp.addActionListener(this);

		mm = new JButton("M-");
		b_panel.add(mm);
		mm.addActionListener(this);

		button1 = new JButton("1");
		b_panel.add(button1);
		button1.addActionListener(this);
		
		button2 = new JButton("2");
		b_panel.add(button2);
		button2.addActionListener(this);
		
		button3 = new JButton("3");
		b_panel.add(button3);
		button3.addActionListener(this);

		button4 = new JButton("4");
		b_panel.add(button4);
		button4.addActionListener(this);
		
		button5 = new JButton("5");
		b_panel.add(button5);
		button5.addActionListener(this);
		
		button6 = new JButton("6");
		b_panel.add(button6);
		button6.addActionListener(this);

		button7 = new JButton("7");
		b_panel.add(button7);
		button7.addActionListener(this);
		
		button8 = new JButton("8");
		b_panel.add(button8);
		button8.addActionListener(this);
		
		button9 = new JButton("9");
		b_panel.add(button9);
		button9.addActionListener(this);

		zero_val = new JButton("0");
		b_panel.add(zero_val);
		zero_val.addActionListener(this);

		add = new JButton("+");
		b_panel.add(add);
		add.addActionListener(this);

		minius = new JButton("-");
		b_panel.add(minius);
		minius.addActionListener(this);

		multiply = new JButton("*");
		b_panel.add(multiply);
		multiply.addActionListener(this);

		divide = new JButton("/");
		divide.addActionListener(this);
		b_panel.add(divide);

		add_sub = new JButton("+/-");
		b_panel.add(add_sub);
		add_sub.addActionListener(this);

		dot = new JButton(".");
		b_panel.add(dot);
		dot.addActionListener(this);

		equal_sign = new JButton("=");
		b_panel.add(equal_sign);
		equal_sign.addActionListener(this);

		recep = new JButton("1/x");
		b_panel.add(recep);
		recep.addActionListener(this);
		
		sqrt = new JButton("SQRT");
		b_panel.add(sqrt);
		sqrt.addActionListener(this);
		
		log = new JButton("log");
		b_panel.add(log);
		log.addActionListener(this);

		sin = new JButton("SIN");
		b_panel.add(sin);
		sin.addActionListener(this);
		
		cos = new JButton("COS");
		b_panel.add(cos);
		cos.addActionListener(this);
		
		tan = new JButton("TAN");
		b_panel.add(tan);
		tan.addActionListener(this);
		
		squared = new JButton("x^2");
		b_panel.add(squared);
		squared.addActionListener(this);
		
		cubed = new JButton("x^3");
		b_panel.add(cubed);
		cubed.addActionListener(this);
		
		expression = new JButton("expression");
		expression.addActionListener(this);
		b_panel.add(expression);
		
		factorial = new JButton("n!");
		factorial.addActionListener(this);
		b_panel.add(factorial);

		clear_val = new JButton("AC");
		b_panel.add(clear_val);
		clear_val.addActionListener(this);
		cont1.add("Center", b_panel);
		cont1.add("North", t_Panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String s1 = e.getActionCommand();
		if (s1.equals("1")) {
			if (z1 == 0) {
				tf.setText(tf.getText() + "1");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "1");
				z1 = 0;
			}	
		}
		
		if (s1.equals("2")) {
			if (z1 == 0) {
				tf.setText(tf.getText() + "2");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "2");
				z1 = 0;
			}
		}
		
		if (s1.equals("3")) {
				if (z1 == 0) {
					tf.setText(tf.getText() + "3");
				} 
				else {
					tf.setText("");
					tf.setText(tf.getText() + "3");
					z1 = 0;
				}
		}
		
		if (s1.equals("4")) {
			if (z1 == 0) {
				tf.setText(tf.getText() + "4");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "4");
				z1 = 0;
			}
		}
		
		if (s1.equals("5")) {
			if (z1 == 0) {
				tf.setText(tf.getText() + "5");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "5");
				z1 = 0;
			}
		}
		
		if (s1.equals("6")) {
			if (z1== 0) {
				tf.setText(tf.getText() + "6");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "6");
				z1 = 0;
			}
		}
		
		if (s1.equals("7")) {
			if (z1 == 0) {
				tf.setText(tf.getText() + "7");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "7");
				z1 = 0;
			}
		}
		
		if (s1.equals("8")) {
			if (z1 == 0) {
				tf.setText(tf.getText() + "8");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "8");
				z1 = 0;
			}
		}
		
		if (s1.equals("9")) {
			if (z1 == 0) {
				tf.setText(tf.getText() + "9");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "9");
				z1 = 0;
			}
		}
		
		if (s1.equals("0")) {
			if (z1 == 0) {
				tf.setText(tf.getText() + "0");
			} 
			else {
				tf.setText("");
				tf.setText(tf.getText() + "0");
				z1 = 0;
			}
		}
		
		if (s1.equals("AC")) {
			tf.setText("");
			x1 = 0;
			y1 = 0;
			z1 = 0;
		}
		
		if (s1.equals("log")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1 = Math.log(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("1/x")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1= 1 / Double.parseDouble(tf.getText());
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("expression")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1 = Math.exp(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("x^2")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1 = Math.pow(Double.parseDouble(tf.getText()), 2);
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("x^3")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1 = Math.pow(Double.parseDouble(tf.getText()), 3);
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("+/-")) {
			if (x1 == 0) {
				tf.setText("-" + tf.getText());
				x1 = 1;
			} 
			else {
				tf.setText(tf.getText());
			}
		}
		
		if (s1.equals(".")) {
			if (y1 == 0) {
				tf.setText(tf.getText() + ".");
				y1 = 1;
			} 
			else {
				tf.setText(tf.getText());
			}
		}
		
		if (s1.equals("+")) {
			if (tf.getText().equals("")) {
				tf.setText("");
				tem_1 = 0;
				ch = '+';
			} 
			else {
				tem_1 = Double.parseDouble(tf.getText());
				tf.setText("");
				ch = '+';
				y1 = 0;
				x1 = 0;
			}
			tf.requestFocus();
		}
		
		if (s1.equals("-")) {
			if (tf.getText().equals("")) {
				tf.setText("");
				tem_1 = 0;
				ch = '-';
			} 
			else {
				x1 = 0;
				y1 = 0;
				tem_1 = Double.parseDouble(tf.getText());
				tf.setText("");
				ch = '-';
			}
			
			tf.requestFocus();
		}
		
		if (s1.equals("/")) {
			if (tf.getText().equals("")) {
				tf.setText("");
				tem_1 = 1;
				ch = '/';
			} 
			else {
				x1 = 0;
				y1 = 0;
				tem_1 = Double.parseDouble(tf.getText());
				ch = '/';
				tf.setText("");
			}
			tf.requestFocus();
		}
		
		if (s1.equals("*")) {
			if (tf.getText().equals("")) {
				tf.setText("");
				tem_1 = 1;
				ch = '*';
			} 
			else {
				x1 = 0;
				y1 = 0;
				tem_1 = Double.parseDouble(tf.getText());
				ch = '*';
				tf.setText("");
			}
			tf.requestFocus();
		}
		
		if (s1.equals("C")) {
			m_1 = 0;
			tf.setText("");
		}
		
		if (s1.equals("MR")) {
			tf.setText("");
			tf.setText(tf.getText() + m_1);
		}
		
		if (s1.equals("M+")) {
			if (k1 == 1) {
				m_1 = Double.parseDouble(tf.getText());
				k1++;
			} 
			else {
				m_1 += Double.parseDouble(tf.getText());
				tf.setText("" + m_1);
			}
		}
		
		if (s1.equals("M-")) {
			if (k1 == 1) {
				m_1 = Double.parseDouble(tf.getText());
				k1++;
			} 
			else {
				m_1 -= Double.parseDouble(tf.getText());
				tf.setText("" + m_1);
			}
		}
		
		if (s1.equals("SQRT")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			}
			else {
				a1= Math.sqrt(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("SIN")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1 = Math.sin(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("COS")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1= Math.cos(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("TAN")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1 = Math.tan(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		
		if (s1.equals("=")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				tem_11 = Double.parseDouble(tf.getText());
				switch (ch) {
				case '+':
					ans = tem_1 + tem_11;
					break;
				case '-':
					ans = tem_1 - tem_11;
					break;
				case '/':
					ans = tem_1 / tem_11;
					break;
				case '*':
					ans = tem_1 * tem_11;
					break;
				}
				tf.setText("");
				tf.setText(tf.getText() + ans);
				z1 = 1;
			}
		}
		
		if (s1.equals("n!")) {
			if (tf.getText().equals("")) {
				tf.setText("");
			} 
			else {
				a1 = factorialt(Double.parseDouble(tf.getText()));
				tf.setText("");
				tf.setText(tf.getText() + a1);
			}
		}
		tf.requestFocus();
	}

	double factorialt(double x1) {
		int er1 = 0;
		if (x1 < 0) {
			er1= 20;
			return 0;
		}
		double i1, s1 = 1;
		for (i1 = 2; i1 <= x1; i1 += 1.0)
			s1 *= i1;
		return s1;
	}

	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} 
		catch (Exception e) {
		}
		Calculator f1= new Calculator();
		f1.setTitle("Calculator");
		f1.pack();
		f1.setVisible(true);
	}
}