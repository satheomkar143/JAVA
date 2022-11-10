package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.sql.*;

class StudentInfo extends JFrame implements ActionListener {

	JButton show, insert, update, delete;
	JTextField rollNoT, nameT, ageT, cityT, contactT;

	StudentInfo() {
		JFrame fm = new JFrame();
		fm.setTitle("Student Information");

		JLabel info = new JLabel("Student Information");
		info.setBounds(120, 20, 160, 30);
		fm.add(info);

		JLabel rollNo = new JLabel("Student RollNo.:");
		rollNo.setBounds(20, 50, 100, 30);
		fm.add(rollNo);

		rollNoT = new JTextField();
		rollNoT.setBounds(150, 50, 200, 30);
		fm.add(rollNoT);

		JLabel name = new JLabel("Student Name:");
		name.setBounds(20, 100, 100, 30);
		fm.add(name);

		nameT = new JTextField();
		nameT.setBounds(150, 100, 200, 30);
		fm.add(nameT);

		JLabel age = new JLabel("Student Age:");
		age.setBounds(20, 150, 100, 30);
		fm.add(age);

		ageT = new JTextField();
		ageT.setBounds(150, 150, 200, 30);
		fm.add(ageT);

		JLabel city = new JLabel("Student City:");
		city.setBounds(20, 200, 100, 30);
		fm.add(city);

		cityT = new JTextField();
		cityT.setBounds(150, 200, 200, 30);
		fm.add(cityT);

		JLabel contact = new JLabel("Student Contact:");
		contact.setBounds(20, 250, 100, 30);
		fm.add(contact);

		contactT = new JTextField();
		contactT.setBounds(150, 250, 200, 30);
		fm.add(contactT);

		show = new JButton("Show Records");
		show.setBounds(20, 300, 150, 30);
		fm.add(show);

		insert = new JButton("Insert Records");
		insert.setBounds(200, 300, 150, 30);
		fm.add(insert);

		update = new JButton("Update Records");
		update.setBounds(20, 350, 150, 30);
		fm.add(update);

		delete = new JButton("Delete Records");
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

	public void actionPerformed(ActionEvent e) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///spark\",\"root\",\"Omkar@143");

			Statement st;
			if (e.getSource() == show) {
				st = con.createStatement();
				int rollno = Integer.parseInt(rollNoT.getText());
				ResultSet rs = st.executeQuery("select * from studentinfo where rollno= '" + rollno + "'");
				while (rs.next()) {

					String name = rs.getString("name");
					nameT.setText(name);

					int age = rs.getInt("age");
					ageT.setText(Integer.toString(age));

					String city = rs.getString("city");
					cityT.setText(city);

					String contact = rs.getString("contact");
					contactT.setText(contact);
					JOptionPane.showMessageDialog(null, "Record shows....", "show", JOptionPane.DEFAULT_OPTION);
////	text1.setText("");
//	text2.setText("");
//	text3.setText("");
//	text4.setText("");
//	text5.setText("");
				}
			} else if (e.getSource() == insert) {
				String rollno = rollNoT.getText();
				String name = nameT.getText();
				String age = ageT.getText();
				String city = cityT.getText();
				String contact = contactT.getText();

				PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?,?,?)");

				pstmt.setString(1, rollno);
				pstmt.setString(2, name);
				pstmt.setString(3, age);
				pstmt.setString(4, city);
				pstmt.setString(5, contact);

				pstmt.executeUpdate();
				JOptionPane.showMessageDialog(null, "Record inserted....", "Insert", JOptionPane.DEFAULT_OPTION);
				rollNoT.setText("");
				nameT.setText("");
				ageT.setText("");
				cityT.setText("");
				contactT.setText("");

				pstmt.close();

			} else if (e.getSource() == update) {
				String rollno = rollNoT.getText();
				String name = nameT.getText();
				String age = ageT.getText();
				String city = cityT.getText();
				String contact = contactT.getText();
				PreparedStatement ps = con.prepareStatement("update student set name='" + name + "', age='" + age
						+ "',city='" + city + "',email='" + contact + "' where rollno='" + rollno + "'");
				ps.execute();
				JOptionPane.showMessageDialog(null, "Record Updated....", "Update", JOptionPane.DEFAULT_OPTION);
				rollNoT.setText("");
				nameT.setText("");
				ageT.setText("");
				cityT.setText("");
				contactT.setText("");
			} else if (e.getSource() == delete) {
				int rollno = Integer.parseInt(rollNoT.getText());
				PreparedStatement ps = con.prepareStatement("delete from student where rollno=?");

				ps.setInt(1, rollno);
				int i = ps.executeUpdate();
				JOptionPane.showMessageDialog(null, i + "Record deleted....", "Deleted", JOptionPane.DEFAULT_OPTION);
				rollNoT.setText("");
				nameT.setText("");
				ageT.setText("");
				cityT.setText("");
				contactT.setText("");

			}
			con.close();
		} catch (Exception e1) {
			System.out.println(e1);
		}

	}

}
