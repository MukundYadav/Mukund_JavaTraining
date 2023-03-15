package exercise9;

public class InvoiceMasterDTO {
	private int invoiceNumber;
	private String invoiceDate;
	private int customerID;
	
	InvoiceMasterDTO(int invoice_number,String invoice_date,int customer_id) {
		this.invoiceNumber = invoice_number;
		this.invoiceDate = invoice_date;
		this.customerID = customer_id;
		
	}

	public void setInvoiceNumber(int invoiceNumber){
		this.invoiceNumber = invoiceNumber;
	}
	public void setInvoiceDate(String invoiceDate){
		this.invoiceDate = invoiceDate;
	}
	public void setCustomerID(int customerID){
		this.customerID = customerID;
	}
	
	
	public int getInvoiceNumber(){
		return invoiceNumber;
	}
	public String getInvoiceDate(){
		return invoiceDate;
	}
	public int getCustomerID(){
		return customerID;
	}

}
