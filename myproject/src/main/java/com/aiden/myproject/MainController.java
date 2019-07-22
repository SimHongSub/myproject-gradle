package com.aiden.myproject;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	/*---- 설정 1 ----*/
	/*@RequestMapping(value="/main.do")
	public ModelAndView mainPage(){
		ModelAndView mav = new ModelAndView("/WEB-INF/views/main.jsp");
		
		return mav;
	}*/
	
	/*---- 설정 2 ----*/
	@RequestMapping(value="/main.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model){
		
		model.addAttribute("content", "Hello, myproject gradle");
		
		return "main";
	}
}
