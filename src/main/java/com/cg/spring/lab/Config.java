package com.cg.spring.lab;


import org.springframework.context.annotation.Bean;

import com.cg.spring.lab.model.Employee;



public class Config {

	@Bean
	public Employee employee2() {

//		return new Employee2();
		return new Employee(101, "Sonu", 10.25,"NB-A",35);
	}

}
