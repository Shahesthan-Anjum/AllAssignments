package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Aliencontroller {
	
	@Autowired
	AlienRepo repo;
	
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addalien")
	public String addalien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
		
	}
	@RequestMapping("/getalien")
	public ModelAndView getalien(@RequestParam int aid) {
		ModelAndView mv=new ModelAndView("showalien.jsp");
		Alien alien=repo.findById(aid).orElse(null);
		return mv;
		
		
	}
	
}
