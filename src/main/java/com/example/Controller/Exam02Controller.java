package com.example.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")//http://localhost:8080/ex-beginner/exam02
public class Exam02Controller {
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam02.html";
	}
	
	@RequestMapping("calc")
	public String calc(String num1,String num2) {
		
		session.setAttribute("num1",num1);
		session.setAttribute("num2",num2);
		int result=Integer.parseInt(num1)+Integer.parseInt(num2);
		session.setAttribute("result",result);
		return "exam02-result";
	}
	
	@RequestMapping("/to-page")
	public String toPage(){
		
		return "exam02-result2";
	}

}
