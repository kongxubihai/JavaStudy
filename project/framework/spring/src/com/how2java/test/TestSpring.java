package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new 
				String[] {"applicationContext.xml"} );
	/*	System.out.println("get category:");
		Category c=(Category) context.getBean("c");
		System.out.println(c.getName());
		System.out.println("get product:");
		Product product=(Product) context.getBean("p");
		System.out.println(product.getName());
		System.out.println(product.getCategory().getName());*/
		ProductService ps=(ProductService) context.getBean("s");
		ps.doSomeService();
	}
}
