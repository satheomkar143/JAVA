package swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentInfo {
	StudentInfo() {
		JFrame fm = new JFrame();
		fm.setTitle("Student Information");

		JLabel info = new JLabel("Student Information");
		info.setBounds(120, 20, 160, 30);
		fm.add(info);

		JLabel rollNo = new JLabel("Student RollNo.:");
		rollNo.setBounds(20, 50, 100, 30);
		fm.add(rollNo);

		JTextField rollNoT = new JTextField();
		rollNoT.setBounds(150, 50, 200, 30);
		fm.add(rollNoT);

		JLabel name = new JLabel("Student Name:");
		name.setBounds(20, 100, 100, 30);
		fm.add(name);

		JTextField nameT = new JTextField();
		nameT.setBounds(150, 100, 200, 30);
		fm.add(nameT);

		JLabel age = new JLabel("Student Age:");
		age.setBounds(20, 150, 100, 30);
		fm.add(age);

		JTextField ageT = new JTextField();
		ageT.setBounds(150, 150, 200, 30);
		fm.add(ageT);

		JLabel city = new JLabel("Student City:");
		city.setBounds(20, 200, 100, 30);
		fm.add(city);

		JTextField cityF = new JTextField();
		cityF.setBounds(150, 200, 200, 30);
		fm.add(cityF);

		JLabel contact = new JLabel("Student Contact:");
		contact.setBounds(20, 250, 100, 30);
		fm.add(contact);

		JTextField contactT = new JTextField();
		contactT.setBounds(150, 250, 200, 30);
		fm.add(contactT);

		JButton show = new JButton("Show Records");
		show.setBounds(20, 300, 150, 30);
		fm.add(show);

		JButton insert = new JButton("Insert Records");
		insert.setBounds(200, 300, 150, 30);
		fm.add(insert);

		JButton update = new JButton("Update Records");
		update.setBounds(20, 350, 150, 30);
		fm.add(update);

		JButton delete = new JButton("Delete Records");
		delete.setBounds(200, 350, 150, 30);
		fm.add(delete);

		fm.setLayout(null);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fm.setSize(400, 450);
		fm.setVisible(true);
		fm.getContentPane().setBackground(Color.pink);
	}

	public static void main(String[] args) {
		StudentInfo sd = new StudentInfo();
	}
}
