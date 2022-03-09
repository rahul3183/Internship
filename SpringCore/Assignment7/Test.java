package com.spring8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	  public static void main(String[] args) {
	
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans8.xml");
	
	     context.registerShutdownHook();
	
	     Employee emp= (Employee)context.getBean("emp");
	     emp.GetDetails();
     
	  }
}
