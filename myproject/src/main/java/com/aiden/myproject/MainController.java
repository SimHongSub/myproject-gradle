package com.aiden.myproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/main.do")
	public ModelAndView mainPage(){
		ModelAndView mav = new ModelAndView("/WEB-INF/views/main.jsp");
		
		return mav;
	}
}
