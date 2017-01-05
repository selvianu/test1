package information;

import java.sql.SQLException;

public interface BankDAO {
	public void add(Bank b);

	public void update(Bank b);

	public void delete(int id);
}
