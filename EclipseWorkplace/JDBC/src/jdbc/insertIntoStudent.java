package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertIntoStudent {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///spark","root","Omkar@143");
			PreparedStatement stmt = con.prepareStatement("insert into studentInfo values( ?, ? ,?, ?, ?)");
			stmt.setString(1, "2");
			stmt.setString(2, "Amruta");
			stmt.setString(3, "26");
			stmt.setString(4, "pune");
			stmt.setString(5, "7845236598");

			int i = stmt.executeUpdate();
			System.out.println(i + "record inserted");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
