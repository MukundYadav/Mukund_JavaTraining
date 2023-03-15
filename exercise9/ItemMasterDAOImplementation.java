package exercise9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ItemMasterDAOImplementation implements ItemMasterDAO{

	@Override
	public ItemMasterDTO getObj(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = JDBCConnection.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "SELECT * FROM ITEM_MASTER WHERE item_no = "+id+";";
		ResultSet rs = stmt.executeQuery(query);
		
		ItemMasterDTO itemMaster = null;
		if(rs.next()) {
			itemMaster = new ItemMasterDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
		}
		
		return itemMaster;
	}

	@Override
	public int insert(ItemMasterDTO itemMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = JDBCConnection.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "INSERT INTO ITEM_MASTER VALUES("+itemMaster.getItemNumber()+", '"+itemMaster.getItemDesc()+"' ,"+itemMaster.getItemPrice()+","+itemMaster.getItemUnit()+");";
		int n = stmt.executeUpdate(query);
		
		return n;
	}

	@Override
	public int delete(ItemMasterDTO itemMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = JDBCConnection.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "DELETE FROM ITEM_MASTER WHERE item_no = "+itemMaster.getItemNumber()+";";
		int n = stmt.executeUpdate(query);
		
		return n;
	}

	@Override
	public int update(ItemMasterDTO itemMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = JDBCConnection.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "UPDATE ITEM_MASTER SET item_des = '"+itemMaster.getItemDesc()+"' , item_price = "+itemMaster.getItemPrice()+", item_unit = "+itemMaster.getItemUnit()+" WHERE item_no = "+itemMaster.getItemNumber()+";";
		int n = stmt.executeUpdate(query);
		
		return n;
	}

}
