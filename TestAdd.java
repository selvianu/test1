package information;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestAdd {

	public static void main(String[] args) throws Exception {
		Bank b = new Bank();
		b.setName("vijaya bank");
		b.setAddress("amb");
		Connection con = ConnectionUtil.getConnection();
		String query = "INSERT INTO bank_info (NAME,address) VALUES ('vijaya bank','chennai')";
		PreparedStatement ps = con.prepareStatement(query);
		// ps.setString(1, b.getName());
		// System.out.println(b.getName());
		// ps.setString(2, b.getAddress());
		int rows = ps.executeUpdate();
		System.out.println(rows);

	}

}
