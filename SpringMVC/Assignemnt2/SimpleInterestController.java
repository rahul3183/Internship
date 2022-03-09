package com.spring.Q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SIController {
	
	@RequestMapping(value="/calculator",method = RequestMethod.GET)
	public ModelAndView Calculate() {
		ModelAndView modelAndView = new ModelAndView("simplecal");
		return modelAndView;
	}
	
	@RequestMapping(value="/calculate",method=RequestMethod.POST)
	public ModelAndView calculateSI(calculation cal) {
		ModelAndView modelAndView = new ModelAndView("showCal");
		double val = cal.calculate();
		modelAndView.addObject("value",val);
		return modelAndView;
		
	}

}
