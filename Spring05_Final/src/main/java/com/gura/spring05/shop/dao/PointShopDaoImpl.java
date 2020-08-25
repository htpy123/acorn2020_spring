package com.gura.spring05.shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.shop.dto.PointShopDto;

@Repository
public class PointShopDaoImpl implements PointShopDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public List<PointShopDto> getList() {
		return session.selectList("poinstshop.getList");
	}

	@Override
	public void minusCount(int num) {
		session.update("poinstshop.minusCount", num);
	}

	@Override
	public void minusPoint(PointShopDto dto) {
		session.update("pointshop.minusPoint", dto);
	}

	@Override
	public int getPrice(int num) {
		return session.selectOne("pointshop.getPrice", num);
	}

}
