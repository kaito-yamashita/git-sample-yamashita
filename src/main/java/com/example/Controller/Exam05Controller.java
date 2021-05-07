package com.example.Controller;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@Controller
@RequestMapping("/exam05")//http://localhost:8080/ex-beginner/exam05
public class Exam05Controller {
	@Autowired
	private MemberRepository repository;
	
	@RequestMapping("")
	public String index() {
		return "exam05";
	}
	
	@RequestMapping("serch")
	public String serchName(String name,Model model) {
		List<Member> memberList=repository.findByName(name);
		model.addAttribute("memberList",memberList);
		return "exam05-result";
	}
}