package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecord1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spark", "root", "");
			PreparedStatement stmt = con.prepareStatement("insert into student values( ? ,?, ?, ?)");
			stmt.setInt(1, 102);
			stmt.setString(2, "Amruta");
			stmt.setInt(3, 28);
			stmt.setString(4, "pune");

			int i = stmt.executeUpdate();
			System.out.println(i + "record inserted");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
