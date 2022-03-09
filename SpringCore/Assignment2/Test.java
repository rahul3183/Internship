package com.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

       System.out.println("\n*********** LIST *************"); 
       Questions question =(Questions)context.getBean("Question");
       question.displayAnswerList();
       
       System.out.println("\n*********** SET *************"); 
       Questions question1 =(Questions)context.getBean("Question1");
       question1.displayAnswerSet();

       System.out.println("\n*********** MAP *************"); 
       Questions question2 =(Questions)context.getBean("Question2");
       question2.displayAnswerMap();

    }
}
