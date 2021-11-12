package com.cg.spring.lab;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.spring.lab.model.Employee;



//Java based configuration 

public class App2 {

	public static void main(String[] args) {
		System.out.println("Start");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Employee emp2 = ctx.getBean(Employee.class);

		System.out.println(emp2.toString());

		((AbstractApplicationContext) ctx).close();
		System.out.println("End");

	}

}