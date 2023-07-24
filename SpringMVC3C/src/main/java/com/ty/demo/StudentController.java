package com.ty.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	@Autowired
	StudentService service;


	@RequestMapping("/")
	public String defaultPage() 
	{
		return "home.jsp";

	}
	
	@RequestMapping("/save")
	public ModelAndView addStudent(@ModelAttribute Student data) 
	{
		ModelAndView s= new ModelAndView();
		s.setViewName("home.jsp");
		s.addObject("data",service.addStudent(data) );
		return s;
     }
	
	@RequestMapping("g")
	public String get()
	{
		return "get.jsp";
	}
	
	@RequestMapping("/getById")
	public ModelAndView getStudentById(@RequestParam int id) 
	{
		ModelAndView s= new ModelAndView();
		s.setViewName("get.jsp");
		s.addObject("data",service.getStudentById(id) );
		return s;	
	}
	
	@RequestMapping("/get")
	public ModelAndView getStudents() 
	{
		ModelAndView view= new ModelAndView();
		view.setViewName("details.jsp");
		view.addObject("data",service.getAllStudents() );
		return view;	
	}
	
	@RequestMapping("/delete")
    public ModelAndView deleteById(@RequestParam int id) 
	{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("details.jsp");
        service.deleteStudentById(id);
        modelAndView.setViewName("redirect:/get");
        return modelAndView;
    }
	
	@RequestMapping("/update")
    public ModelAndView updatePage(@RequestParam int id) {
        ModelAndView view = new ModelAndView();
        view.setViewName("update.jsp");
        Student student = service.getStudentById(id);
        view.addObject("data", student);
        return view;
    }

    @RequestMapping("/updateStudent")
    public ModelAndView updateStudent(@ModelAttribute Student student) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("details.jsp");
        service.updateStudent(student);
        modelAndView.setViewName("redirect:/get");
        return modelAndView;
    }
	
	
	
	
	
	
}
