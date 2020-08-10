package com.gura.spring04.todo.service;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.todo.dto.TodoDto;

public interface TodoService {
	public void addMember(TodoDto dto);
	public void Todoupdate(TodoDto dto);
	public void Tododelete(int num);
	public void getMember(int num,ModelAndView mView);
	public void getList(ModelAndView mView);
}
