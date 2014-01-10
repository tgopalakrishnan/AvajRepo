package com.gopal.order;

public interface Order{

	public void makeOrder(OrderDetails details)throws OrderException;
	public OrderDetails myOrder() throws OrderException;
	
}
