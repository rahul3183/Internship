package com.spring10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansQ10.xml");
        ContextAwareExample contextAwareExample = (ContextAwareExample) context.getBean("contextAware");
        contextAwareExample.display();

    }
}
