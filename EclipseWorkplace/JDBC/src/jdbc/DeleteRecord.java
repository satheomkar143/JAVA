package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spark", "root", "");

			PreparedStatement stmt = con.prepareStatement("delete from student where rollNO=?");
			stmt.setInt(1, 101);

			int i = stmt.executeUpdate();
			System.out.println(i + "record deleted");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
