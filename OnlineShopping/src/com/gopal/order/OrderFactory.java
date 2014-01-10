package com.gopal.order;


public class OrderFactory {

	private static OrderFactory orderFactory;
	private OrderFactory(){
		
	}
	public static OrderFactory getInstance()throws Exception{
		if (orderFactory==null) {
			orderFactory=(OrderFactory) Class.forName("com.gopal.order.OrderProcess").newInstance();
		}
		return orderFactory;
		
	}
}
