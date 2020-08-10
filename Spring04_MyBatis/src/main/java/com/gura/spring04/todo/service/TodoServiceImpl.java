package com.gura.spring04.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.todo.dao.TodoDao;
import com.gura.spring04.todo.dto.TodoDto;

@Service
public class TodoServiceImpl implements TodoService{
	@Autowired
	private TodoDao dao;

	@Override
	public void addMember(TodoDto dto) {
		dao.insert(dto);
	}

	@Override
	public void Todoupdate(TodoDto dto) {
		dao.update(dto);
	}

	@Override
	public void Tododelete(int num) {
		dao.delete(num);
	}

	@Override
	public void getMember(int num, ModelAndView mView) {
		TodoDto dto = dao.getData(num);
		mView.addObject("dto", dto);
	}

	@Override
	public void getList(ModelAndView mView) {
		List<TodoDto> list = dao.getList();
		mView.addObject("list", list);
	}
	
}
