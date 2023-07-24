package com.stu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StuController {

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home.jsp");
		return modelAndView;
	}

	@Autowired
	private StudentRepo repo;

	@RequestMapping("/save")
	public ModelAndView saveData(@ModelAttribute StudentData data) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home.jsp");
		StudentData data2=repo.savaData(data);
		modelAndView.addObject("student", data2);
		return modelAndView;
	}
	
}
