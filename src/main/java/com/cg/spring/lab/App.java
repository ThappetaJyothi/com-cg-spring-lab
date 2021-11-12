package com.cg.spring.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.lab.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        ApplicationContext ct = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Employee emp1=ct.getBean("employee",Employee.class);
        System.out.println(emp1.toString());
        ((AbstractApplicationContext) ct).close();
    }
}
