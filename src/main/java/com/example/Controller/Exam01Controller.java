package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")//http://localhost:8080/ex-beginner/exam01
public class Exam01Controller{
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("input")
	public String inputName(String name,Model model) {
		
		model.addAttribute("name",name);
		return "exam01-result";
	}
}