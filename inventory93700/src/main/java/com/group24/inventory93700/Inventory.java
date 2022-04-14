package com.group24.inventory93700;

public class Inventory {

	private int inventoryID;  
	private int prodID;  
	private String prodAvailability;  
	private String category;  

		public Inventory(int inventoryID, int prodID, String prodAvailability, String category) {
		super();
		this.inventoryID = inventoryID;
		this.prodID = prodID;
		this.prodAvailability = prodAvailability;
		this.category = category;
	}
		public int getInventoryID() {
			return inventoryID;
		}
		public void setInventoryID(int inventoryID) {
			this.inventoryID = inventoryID;
		}
		public int getProdID() {
			return prodID;
		}
		public void setProdID(int prodID) {
			this.prodID = prodID;
		}
		public String getProdAvailability() {
			return prodAvailability;
		}
		public void setProdAvailability(String prodAvailability) {
			this.prodAvailability = prodAvailability;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		@Override
		public String toString() {
			return "Inventory [inventoryID=" + inventoryID + ", prodID=" + prodID + ", prodAvailability="
					+ prodAvailability + ", category=" + category + "]";
		}  
	
		
}
