package com.gura.spring03.users.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example {

	@RequestMapping("/example")
	public String example(HttpServletRequest request) {
		String str = "연습";
		
		request.setAttribute("str", str);
		
		return "example";
	}
}
