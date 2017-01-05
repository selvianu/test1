package information;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestDelete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		// b.setId(3);
		b.setAddress("amb");
		Connection con = ConnectionUtil.getConnection();
		String query = "DELETE FROM bank_info WHERE address=?";
		PreparedStatement ps = con.prepareStatement(query);
		// ps.setInt(1, b.getId());
		ps.setString(1, b.getAddress());
		int rows = ps.executeUpdate();
		System.out.println(rows);

	}

}
