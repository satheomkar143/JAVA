package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginPage {

	LoginPage() {
		JFrame fm = new JFrame();
		JLabel j1 = new JLabel("User Name");
		j1.setBounds(20, 20, 80, 30);
		fm.add(j1);

		JTextField t1 = new JTextField(20);
		t1.setBounds(100, 20, 100, 30);
		fm.add(t1);

		JLabel j2 = new JLabel("Password");
		j2.setBounds(20, 75, 80, 30);
		fm.add(j2);

		JTextField t2 = new JTextField(20);
		t2.setBounds(100, 75, 100, 30);
		fm.add(t2);

		JButton b1 = new JButton("Login");
		b1.setBounds(100, 120, 80, 30);
		fm.add(b1);

		JLabel label1 = new JLabel();
		label1.setBounds(20, 150, 400, 50);
		fm.add(label1);

		JLabel label2 = new JLabel();
		label2.setBounds(20, 200, 400, 50);
		fm.add(label2);

		fm.setLayout(null);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.setSize(400, 400);
		fm.setVisible(true);
		fm.getContentPane().setBackground(Color.pink);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "Username: " + t1.getText();
				String pass = "Password: " + t2.getText();
				label1.setText(data);
				label2.setText(pass);

			}
		});
	}

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
	}
}
