package com.gopal.order;


public  class OrderDetails {

	
	private  final long Random = 0;
	public static long orderId;
	private String itemName;
	private String modelNumber;
	private String itemCode;
	private Boolean stockInfo;

	public  long getOrderId() {
		return orderId;
	}

	public  void setOrderId(String orderId) {
		OrderDetails.orderId = Random;
		System.out.println("ORDERID==>"+orderId);
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Boolean getStockInfo() {
		return stockInfo;
	}

	public void setStockInfo(Boolean stockInfo) {
		this.stockInfo = stockInfo;
	}

}
