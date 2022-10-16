package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ApplicationForm {

	ApplicationForm() {
		JFrame fm = new JFrame();

		JLabel form = new JLabel("Application Form");
		form.setBounds(300, 20, 300, 30);
		form.setForeground(Color.red);
		form.setFont(new Font("cursive",Font.BOLD,25));
		fm.add(form);

		JLabel first = new JLabel("First Name :");
		first.setBounds(20, 60, 100, 30);
		fm.add(first);

		JTextField firstT = new JTextField(20);
		firstT.setBounds(130, 60, 200, 30);
		fm.add(firstT);

		JLabel last = new JLabel("Last Name :");
		last.setBounds(400, 60, 100, 30);
		fm.add(last);

		JTextField lastT = new JTextField(20);
		lastT.setBounds(510, 60, 200, 30);
		fm.add(lastT);

		JLabel birth = new JLabel("Date of Birth :");
		birth.setBounds(20, 100, 100, 30);
		fm.add(birth);

		JTextField birthT = new JTextField("mm / dd / yyyy");
		birthT.setBounds(130, 100, 200, 30);
		fm.add(birthT);

		JLabel age = new JLabel("Age :");
		age.setBounds(400, 100, 100, 30);
		fm.add(age);

		JSpinner ageT = new JSpinner();
		ageT.setBounds(510, 100, 200, 30);
		fm.add(ageT);

		JLabel gender = new JLabel("Gender :");
		gender.setBounds(20, 140, 100, 30);
		fm.add(gender);

		String gen[] = { "--Select--", "Male", "Female", "Other" };
		JComboBox<String> genderT = new JComboBox<String>(gen);
		genderT.setBounds(130, 140, 200, 30);
		fm.add(genderT);

		JLabel email = new JLabel("Email Address :");
		email.setBounds(400, 140, 100, 30);
		fm.add(email);

		JTextField emailT = new JTextField("Enter Email Address");
		emailT.setBounds(510, 140, 200, 30);
		fm.add(emailT);

		JLabel position = new JLabel("Position Available : ");
		position.setBounds(20, 180, 150, 30);
		fm.add(position);

		JRadioButton pos1 = new JRadioButton("Junior Developer");
		pos1.setBounds(180, 180, 150, 30);
		JRadioButton pos2 = new JRadioButton("Mid-level Developer");
		pos2.setBounds(370, 180, 150, 30);
		JRadioButton pos3 = new JRadioButton("Senior Developer");
		pos3.setBounds(560, 180, 150, 30);

		ButtonGroup pos = new ButtonGroup();
		pos.add(pos1);
		pos.add(pos2);
		pos.add(pos3);

		fm.add(pos1);
		fm.add(pos2);
		fm.add(pos3);

		JLabel prog = new JLabel("Programming languages : ");
		prog.setBounds(20, 220, 150, 30);
		fm.add(prog);

		JCheckBox pro = new JCheckBox("Java");
		pro.setBounds(180, 220, 150, 30);
		fm.add(pro);

		pro = new JCheckBox("JavaScript");
		pro.setBounds(370, 220, 150, 30);
		fm.add(pro);

		pro = new JCheckBox("Python");
		pro.setBounds(560, 220, 150, 30);
		fm.add(pro);

		JLabel password = new JLabel("Password :");
		password.setBounds(20, 260, 100, 30);
		fm.add(password);

		JPasswordField passwordT = new JPasswordField();
		passwordT.setBounds(130, 260, 200, 30);
		fm.add(passwordT);

		JLabel cpassword = new JLabel("Confirm Password :");
		cpassword.setBounds(370, 260, 150, 30);
		fm.add(cpassword);

		JPasswordField cpasswordT = new JPasswordField();
		cpasswordT.setBounds(510, 260, 200, 30);
		fm.add(cpasswordT);

		JButton submit = new JButton("Submit");
		submit.setBounds(280, 330, 100, 30);
		submit.setBackground(Color.MAGENTA);
		fm.add(submit);

		JButton reset = new JButton("Reset");
		reset.setBounds(420, 330, 100, 30);
		reset.setBackground(Color.MAGENTA);
		fm.add(reset);

		fm.setLayout(null);
		fm.setSize(800, 450);
		fm.setVisible(true);

		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.getContentPane().setBackground(Color.cyan);
	}

	public static void main(String[] args) {
		new ApplicationForm();
	}
}
