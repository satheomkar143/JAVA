package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	JTextField value1, value2, answer;
	JButton add, sub, div, multi;

	SimpleCalculator() {
		JFrame fm = new JFrame();
		fm.setTitle("Calculator");

		JLabel calulator = new JLabel("Calculator");
		calulator.setBounds(150, 30, 100, 30);
		fm.add(calulator);

		value1 = new JTextField();
		value1.setBounds(50, 100, 100, 30);
		fm.add(value1);

		value2 = new JTextField();
		value2.setBounds(200, 100, 100, 30);
		fm.add(value2);

		JLabel ans = new JLabel("Answer: ");
		ans.setBounds(100, 150, 100, 30);
		fm.add(ans);

		answer = new JTextField();
		answer.setBounds(200, 150, 100, 30);
		answer.setEditable(false);
		fm.add(answer);

		add = new JButton("+");
		add.setBounds(100, 200, 50, 30);
		add.addActionListener(this);
		fm.add(add);

		sub = new JButton("-");
		sub.setBounds(200, 200, 50, 30);
		sub.addActionListener(this);
		fm.add(sub);

		multi = new JButton("*");
		multi.setBounds(100, 250, 50, 30);
		multi.addActionListener(this);
		fm.add(multi);

		div = new JButton("/");
		div.setBounds(200, 250, 50, 30);
		div.addActionListener(this);
		fm.add(div);

		fm.setLayout(null);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.setSize(370, 400);
		fm.setVisible(true);
		fm.getContentPane().setBackground(Color.pink);
	}

	public void actionPerformed(ActionEvent e) {
		String str1 = value1.getText();
		String str2 = value2.getText();
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
		float num1 = Float.parseFloat(str1);
		float num2 = Float.parseFloat(str2);

		float result = 0;
		if (e.getSource() == add) {
			result = num1 + num2;
		} else if (e.getSource() == sub) {
			result = num1 - num2;
		} else if (e.getSource() == multi) {
			result = num1 * num2;
		} else if (e.getSource() == div) {
			result = num1 / num2;
		}
		String ans = String.valueOf(result);
		answer.setText(ans);
	}

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
	}

}
