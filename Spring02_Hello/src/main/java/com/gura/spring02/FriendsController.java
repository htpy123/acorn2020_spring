package com.gura.spring02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FriendsController {

	@RequestMapping("/friends")
	public String friends(HttpServletRequest request) {
		String friendsList = "내 친구는 김구라랑 원숭이랑..또 누가있었지?";
		
		request.setAttribute("friendsList", friendsList);
		
		return "friends";
	}
}
