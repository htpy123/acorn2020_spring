package com.gura.spring04.todo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring04.todo.dto.TodoDto;

@Repository
public class TodoDaoImpl implements TodoDao{
	@Autowired
	private SqlSession session;
	
	@Override
	public void update(TodoDto dto) {
		session.update("Todo.update", dto);
	}

	@Override
	public void insert(TodoDto dto) {
		session.insert("Todo.insert", dto);
	}

	@Override
	public void delete(int num) {
		session.delete("Todo.delete", num);
	}

	@Override
	public TodoDto getData(int num) {
		TodoDto dto = session.selectOne("Todo.getData", num);
		return dto;
	}

	@Override
	public List<TodoDto> getList() {
		List<TodoDto> list = session.selectList("Todo.getList");
		return list;
	}
}
