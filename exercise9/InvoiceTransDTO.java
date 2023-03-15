package exercise9;

public class InvoiceTransDTO {
	private int itemNumber;
	private int itemQuantity;
	private int invoiceNumber;
	
	InvoiceTransDTO(int item_number ,int item_quantity,int invoice_number) {
		this.itemNumber = item_number;
		this.itemQuantity = item_quantity;
		this.invoiceNumber = invoice_number;
		
	}

	public void setItemNumber(int itemNumber){
		this.itemNumber = itemNumber;
	}
	public void setItemQuantity(int itemQuantity){
		this.itemQuantity = itemQuantity;
	}
	public void setInvoiceNumber(int invoiceNumber){
		this.invoiceNumber = invoiceNumber;
	}
	
	
	public int getItemNumber(){
		return itemNumber;
	}
	public int getItemQuantity(){
		return itemQuantity;
	}
	public int getInvoiceNumber(){
		return invoiceNumber;
	}

}
