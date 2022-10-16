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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentForm {

	StudentForm() {

		JFrame fm = new JFrame();

		JLabel details = new JLabel("Personal Details");
		details.setBounds(100, 10, 200, 30);
		details.setForeground(Color.red);
		details.setFont(new Font("cursive", Font.BOLD, 20));
		fm.add(details);

		JLabel name = new JLabel("Name: ");
		name.setBounds(50, 50, 100, 30);
		fm.add(name);

		JTextField nameT = new JTextField(20);
		nameT.setBounds(170, 50, 150, 30);
		fm.add(nameT);

		JLabel pass = new JLabel("Password: ");
		pass.setBounds(50, 90, 100, 30);
		fm.add(pass);

		JPasswordField passT = new JPasswordField(20);
		passT.setBounds(170, 90, 150, 30);
		fm.add(passT);

		JLabel email = new JLabel("Email id:");
		email.setBounds(50, 130, 100, 30);
		fm.add(email);

		JTextField emailT = new JTextField(20);
		emailT.setBounds(170, 130, 150, 30);
		fm.add(emailT);

		JLabel gender = new JLabel("Gender:");
		gender.setBounds(50, 170, 100, 30);
		fm.add(gender);

		JRadioButton r1 = new JRadioButton("Male");
		JRadioButton r2 = new JRadioButton("Female");
		r1.setBounds(170, 170, 60, 30);
		r2.setBounds(240, 170, 80, 30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		fm.add(r1);
		fm.add(r2);

		JLabel contact = new JLabel("Contact:");
		contact.setBounds(50, 210, 100, 30);
		fm.add(contact);

		JTextField contactT = new JTextField();
		contactT.setBounds(170, 210, 150, 30);
		fm.add(contactT);

		JLabel edu = new JLabel("Educational Qualification");
		edu.setBounds(60, 250, 250, 30);
		edu.setForeground(Color.red);
		edu.setFont(new Font("cursive", Font.BOLD, 20));
		fm.add(edu);

		JLabel degree = new JLabel("Degree:");
		degree.setBounds(50, 290, 100, 30);
		fm.add(degree);

		String deg[] = { "--Select Group--", "BE", "BTECH", "BSC", "BCA" };
		JComboBox<String> degreeT = new JComboBox<String>(deg);
		degreeT.setBounds(170, 290, 150, 30);
		fm.add(degreeT);

		JLabel engg = new JLabel("Engineering:");
		engg.setBounds(50, 330, 100, 30);
		fm.add(engg);

		String eng[] = { "--Select Group--", "Mechanical", "Computer Science", "Pharmacy" };
		JComboBox<String> enggT = new JComboBox<String>(eng);
		enggT.setBounds(170, 330, 150, 30);
		fm.add(enggT);

		JLabel hobbies = new JLabel("Hobbies:");
		hobbies.setBounds(50, 370, 100, 30);
		fm.add(hobbies);

		JCheckBox hobbi = new JCheckBox("Playing Chess");
		hobbi.setBounds(170, 370, 150, 30);
		fm.add(hobbi);

		hobbi = new JCheckBox("Reading Books");
		hobbi.setBounds(170, 410, 150, 30);
		fm.add(hobbi);

		JLabel addr = new JLabel("Address");
		addr.setBounds(150, 450, 100, 30);
		addr.setForeground(Color.red);
		addr.setFont(new Font("cursive", Font.BOLD, 20));
		fm.add(addr);

		JTextArea addrT = new JTextArea();
		addrT.setBounds(50, 490, 270, 80);
		fm.add(addrT);

		JLabel resume = new JLabel("Attach Resume: ");
		resume.setBounds(40, 580, 100, 30);
		fm.add(resume);

		JButton choose = new JButton("Choose File");
		choose.setBounds(140, 580, 100, 30);
		choose.setBackground(Color.blue);
		choose.setForeground(Color.white);
		fm.add(choose);

		JLabel file = new JLabel("No file chosen");
		file.setBounds(250, 580, 100, 30);
		fm.add(file);

		JButton submit = new JButton("SUBMIT =>");
		submit.setBounds(140, 620, 100, 30);
		submit.setBackground(Color.MAGENTA);
		fm.add(submit);

		fm.setLayout(null);
		fm.setSize(400, 700);
		fm.setVisible(true);

		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.getContentPane().setBackground(Color.GREEN);
	}

	public static void main(String[] args) {
		new StudentForm();
	}

}
