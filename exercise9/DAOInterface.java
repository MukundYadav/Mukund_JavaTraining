package exercise9;
import java.sql.SQLException;

public interface DAOInterface<T> {
	
	T getObj(int id) throws SQLException;
	
	int insert(T obj) throws SQLException;
	
	int delete(T obj) throws SQLException;
	
	int update(T obj) throws SQLException;
}

