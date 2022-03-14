package com.example.demo;

//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("home")

	public ModelAndView home(Alien alien)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home.jsp");
		return mv;
		
		/*
		 * HttpSession session=req.getSession(); String name=req.getParameter("name");
		 */
		/*System.out.println("Welcome to spring boott" +myName);
		session.setAttribute("name",myName);
		return "home.jsp";*/
	}
}