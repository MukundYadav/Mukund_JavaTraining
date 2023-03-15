package exercise9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InvoiceTransactionDAOImplementation implements InvoiceTransactionDAO{
	@Override
	public InvoiceTransDTO getObj(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = JDBCConnection.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "SELECT * FROM INVOICE_TRANS WHERE invoice_no = "+id+";";
		ResultSet rs = stmt.executeQuery(query);
		
		InvoiceTransDTO invoiceTrans = null;
		if(rs.next()) {
			invoiceTrans = new InvoiceTransDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3));
		}
		
		return invoiceTrans;
	}

	@Override
	public int insert(InvoiceTransDTO invoiceTrans) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = JDBCConnection.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "INSERT INTO INVOICE_TRANS VALUES("+invoiceTrans.getInvoiceNumber()+","+invoiceTrans.getItemNumber()+","+invoiceTrans.getItemQuantity()+";";
		int n = stmt.executeUpdate(query);
		
		return n;
	}

	@Override
	public int delete(InvoiceTransDTO invoiceTrans) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(InvoiceTransDTO invoiceTrans) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
