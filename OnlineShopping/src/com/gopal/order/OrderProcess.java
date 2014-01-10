package com.gopal.order;

public class OrderProcess  extends OrderDetails implements Order {
	OrderDetails ord = null;
	@SuppressWarnings("static-access")
	@Override
	public void makeOrder(OrderDetails details) throws OrderException {
		if (ord.orderId > 0) {
			System.out.println("orderID!=0"+ord.orderId);
		}
		System.out.println("orderID!=0"+ord.orderId);

	}

	@Override
	public OrderDetails myOrder() throws OrderException {
		System.out.println(ord.getItemName());
		System.out.println(ord.getItemCode());
		System.out.println(ord.getModelNumber());
	
		return ord;
	}

}
