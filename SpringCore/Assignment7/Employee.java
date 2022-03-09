package com.spring8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee implements InitializingBean,DisposableBean  {

	 	private  String name;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void GetDetails(){
	        System.out.println(getName());
	    }
	    
	    public void afterPropertiesSet() throws Exception {
	        System.out.println("Initializing beans");
	    }

	    public void destroy() throws Exception {
	        System.out.println("Destroy method is called");
	    }

	    public void myInit(){
	        System.out.println("Employee Object is created");
	    }

	    public void  myDest(){
	        System.out.println("Object is destroyed using destroy-method");
	    }


	    @PostConstruct
	    public void postConstruct(){
	        System.out.println("Post Construct");
	    }

	    @PreDestroy
	    public  void  preDestroy(){
	        System.out.println("Pre Destroy");
	    }
	    
}
