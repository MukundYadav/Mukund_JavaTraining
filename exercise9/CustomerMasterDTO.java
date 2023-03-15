package exercise9;

public class CustomerMasterDTO {
	private int customerID;
	private String customerName;
	private String customerAddress;
	
	CustomerMasterDTO(int customer_id,String customer_name,String customer_address) {
		this.customerID = customer_id;
		this.customerName = customer_name;
		this.customerAddress = customer_address;
		
	}
	public void setCustomerID(int customerID){
		this.customerID = customerID;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	public void setCustomerAddress(String customerAddress){
		this.customerAddress = customerAddress;
	}
	
	public int getCustomerID(){
		return customerID;
	}
	public String getCustomerName(){
		return customerName;
	}
	public String getCustomerAddress(){
		return customerAddress;
	}

}
