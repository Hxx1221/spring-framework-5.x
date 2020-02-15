package com.shadow.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class UserService {
	//	@Autowired
	private OrderService orderService;

//	public UserService() {
//	}

	//@Autowired(required = false)
	public UserService(OrderService orderService) {
		this.orderService = orderService;
		System.out.println("UserService");
	}

	public OrderService getOrderService() {
		return orderService;
	}
}
