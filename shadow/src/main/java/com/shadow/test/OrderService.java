package com.shadow.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class OrderService {
	@Resource
	private UserService userService;

	public OrderService() {
		System.out.println("orderservice");
	}

	public UserService getUserService() {
		return userService;
	}
}
