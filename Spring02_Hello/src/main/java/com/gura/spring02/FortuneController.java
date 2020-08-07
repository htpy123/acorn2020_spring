package com.gura.spring02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {
	/*
	 * 	HttpServletRequest or HttpServletResponse or HttpSession
	 * 	객체가 필요하면 메소드의 인자에 선언해 놓으면 자동으로 실행시점에 참조값이 전달된다.
	 * 
	 */
	@RequestMapping("/fortune")//.nhn 생략가능
	public String fortune(HttpServletRequest request) {
		//1. 오늘의 운세를 얻어오는 비즈니스 로직을 처리한다.
		String fortuneToday = "동쪽으로 가면 귀인을 만나요";
		//2. 로직 처리결과 데이터(model) 을 request 영역에 담는다.
//		request ???? servlet에서는 service의 인자로 전달되도록 정의되어있었다. 선택적으로 request가 필요하면 인자를 받으면된다.
		request.setAttribute("fortuneToday", fortuneToday);
		//3. view 페이지 (jsp) 페이지로 forward 이동해서 응답한다.
		return "fortune"; // "/WEB-INF/views/fortune.jsp" 로 이동하겠다는 의미
//									  +  			  +		fortune에  /WEB-INF/views/ 와 .jsp가 앞뒤로 붙는다
	}
}
