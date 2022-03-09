package com.spring5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main(String[] args) {
		 
	 ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");

     drawShape shape =(drawShape)context.getBean("shape");
     shape.DrawShape();
	
}
}