package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Assignment1 {
	
	@RequestMapping("/index")
	public ModelAndView indexView() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("hello");
		return model;
	}
}
