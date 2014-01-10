package com.gopal.order;

public class Consumer {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Order order =  (Order) OrderFactory.getInstance();
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setItemCode("gk10987");
		orderDetails.setItemName("zozo");
		orderDetails.setModelNumber("newmodel#1");
		orderDetails.setStockInfo(true);
		order.makeOrder(orderDetails);
		order.myOrder();
	}

}
