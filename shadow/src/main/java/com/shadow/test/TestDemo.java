package com.shadow.test;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class TestDemo {
	//@PreDestroy
	public void close(){
		System.out.println("close");
	}
}
