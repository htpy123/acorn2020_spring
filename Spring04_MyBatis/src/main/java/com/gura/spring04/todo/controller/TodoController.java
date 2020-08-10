package com.gura.spring04.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.todo.dto.TodoDto;
import com.gura.spring04.todo.service.TodoService;

@Controller
public class TodoController {
	@Autowired
	private TodoService service;
	
	//POST 방식 /member/update 요청 처리
	@RequestMapping(value = "/todo/update", method=RequestMethod.POST)
	public String update(@ModelAttribute TodoDto dto) {
		
		service.Todoupdate(dto);
		
		return "todo/update";
	}
	
	@RequestMapping(value = "/todo/updateform",
			method = RequestMethod.GET)
	public ModelAndView updateform(@RequestParam int num,
			ModelAndView mView) {
		
		service.getMember(num, mView);
		
		mView.setViewName("todo/updateform");
		return mView;
	}
	
	@RequestMapping("/todo/delete")
	public String delete(@RequestParam int num) {
		
		service.Tododelete(num);
		
		return "redirect:/todo/list.do";
	}
	
	//회원 추가 요청처리
	@RequestMapping("/todo/insert")
	public String insert(@ModelAttribute TodoDto dto) {
		service.addMember(dto);
		return "todo/insert";
	}
	
	@RequestMapping("/todo/insertform")
	public String insertform() {
		
		return "member/insertform";
	}
	
	@RequestMapping("/todo/list")
	public ModelAndView list(ModelAndView mView) {
		
		service.getList(mView);
		mView.setViewName("todo/list");
		return mView;
	}
}
