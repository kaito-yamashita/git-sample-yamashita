package com.example.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")//http://localhost:8080/ex-beginner/exam03
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03.html";
	}
	
	@RequestMapping("purc")
	public String calc(String num1,String num2,String num3) {
		int notax=Integer.parseInt(num1)+Integer.parseInt(num2)+Integer.parseInt(num3);
		application.setAttribute("notax",notax);
		int addtax=(int)(notax*1.1);
		application.setAttribute("addtax",addtax);
		return "exam03-result";
	}
}