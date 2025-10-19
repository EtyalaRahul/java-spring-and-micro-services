package com.telusko.springbootMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("/add")
//	public String add(HttpServletRequest req) {
//		
//	int i = Integer.parseInt(req.getParameter("num1"));
//	int j=Integer.parseInt(req.getParameter("num2"));
//	
//	int num3 = i+j;
//	
//	HttpSession session =req.getSession();
//	session.setAttribute("num3", num3);
//	
//	return "result.jsp";
//	}
	
	
	
	
	
	
	
	
	
//	@RequestMapping("/add")
//	public String add(@RequestParam("num1") int i,@RequestParam("num2") int  j ,HttpSession session) {
//		int num2=i+j;
//		
//		session.setAttribute("num3", num2);
//		return "result.jsp";
//	}
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("/add")
//	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int  j ) {
//		
//		
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("result.jsp");
//		
//		int num3=i+j;
//		
//		mv.addObject("num3",num3);
//		
//		return mv;
//	}
	
	
	
	
	
	
	
	
//	@RequestMapping("/add")
//	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int  j ) {
//		
//		
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("result");
//		
//		int num3=i+j;
//		
//		mv.addObject("num3",num3);
//		
//		return mv;
//	}
	
	
	//model m is a interface
	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i,@RequestParam("num2") int  j ,Model m) {
		
		
		
		int num3=i+j;
		
		m.addAttribute("num3",num3);
		
		return "result";
	}


}
