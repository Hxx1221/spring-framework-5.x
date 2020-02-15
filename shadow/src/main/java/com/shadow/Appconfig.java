package com.shadow;

import com.shadow.cglib.E;
import com.shadow.cglib.F;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.shadow.test")
public class Appconfig {
	//@Bean
	public F f(){
		System.out.println("init f");
		e();
		return new F();
	}
	//@Bean
	public E e(){
		System.out.println("init e");
		return new E();
	}

}
