package exercise9;

public class ItemMasterDTO {
	private int itemNumber;
	private String itemDesc;
	private int itemPrice;
	private int itemUnit;
	
	ItemMasterDTO(int item_number,String item_desc,int item_price, int item_unit) {
		this.itemNumber = item_number;
		this.itemDesc = item_desc;
		this.itemPrice = item_price;
		this.itemUnit=item_unit;
	}
	public void setItemNumber(int itemNumber){
		this.itemNumber = itemNumber;
	}
	public void setItemDesc(String itemDesc){
		this.itemDesc = itemDesc;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}
	public void setItemUnit(int itemUnit){
		this.itemUnit = itemUnit;
	}
	
	public int getItemNumber(){
		return itemNumber;
	}
	public String getItemDesc(){
		return itemDesc;
	}
	public int getItemPrice(){
		return itemPrice;
	}
	public int getItemUnit(){
		return itemUnit;
	}

}
