package com.shadow;

import com.shadow.test.OrderService;
import com.shadow.test.TestDemo;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		//annotationConfigApplicationContext.setAllowCircularReferences(false);
		//TestDemo bean = annotationConfigApplicationContext.getBean(TestDemo.class);
		//annotationConfigApplicationContext.scan();
		//annotationConfigApplicationContext.refresh();

		//System.out.println(bean);
		//annotationConfigApplicationContext.close();
		OrderService bean = annotationConfigApplicationContext.getBean(OrderService.class);

		System.out.println(bean);
		System.out.println(bean.getUserService().getOrderService());


		//	System.out.println( annotationConfigApplicationContext.getBean(Appconfig.class));
	}
}
