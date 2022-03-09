package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class userController {
	
	service Service;
	
	@RequestMapping(value="Registration",method=RequestMethod.GET)
	public ModelAndView Registration() {
		ModelAndView modelAndView = new ModelAndView("Registration");
		return modelAndView;
	}
	
	
	@RequestMapping(value="register",method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user")userLogin user) throws Exception{
		
		Service.insertData(user);
	    	 
	    	   ModelAndView modelAndView = new ModelAndView("login");
	    	   return modelAndView;	
	}
	
	
	
	@RequestMapping(value ="/validate",method = RequestMethod.POST)
	public ModelAndView loginValidation(@ModelAttribute ("user")userLogin user) throws Exception {
		 
		boolean response = Service.getData(user);
		
		
		if(response) {
			ModelAndView modelAndView = new ModelAndView("success");
			return modelAndView;
		}
		else {
			ModelAndView modelAndView = new ModelAndView("error");
			return modelAndView;
		}
		
	
	}
}
