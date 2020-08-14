package com.gura.spring05.cafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.cafe.service.CafeService;

@Controller
public class CafeController {
	@Autowired
	private CafeService cafeServcie;
	
	@RequestMapping("/cafe/list")
	public ModelAndView getList(HttpServletRequest request,
			ModelAndView mView){
				
		mView.setViewName("cafe/list");
		return mView;
	}
}
