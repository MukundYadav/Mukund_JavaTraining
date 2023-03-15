package exercise9;

import java.sql.SQLException;

public class DaoDtoDemo {
	public static void main(String[] args) {
		
		ItemMasterDAO itemMasterDAO = new ItemMasterDAOImplementation();
		
		ItemMasterDTO itemMaster = null;
		try {
			itemMaster = itemMasterDAO.getObj(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(itemMaster.getItemNumber()+":"+itemMaster.getItemDesc()+":"+itemMaster.getItemPrice()+":"+itemMaster.getItemUnit());
		
		itemMaster.setItemPrice(30000);

		int n=0;
		try {
			n = itemMasterDAO.update(itemMaster);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(n == 1) {
			System.out.println("Succesful");
		}

	}
}

