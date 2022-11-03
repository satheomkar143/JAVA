package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updateRecord {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spark", "root", "");

			PreparedStatement stmt = con.prepareStatement("update student set name=? where rollNO=?");
			stmt.setString(1,"Pooja");
			stmt.setInt(2, 102);

			int i = stmt.executeUpdate();
			System.out.println(i + "record updated");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
		

}
