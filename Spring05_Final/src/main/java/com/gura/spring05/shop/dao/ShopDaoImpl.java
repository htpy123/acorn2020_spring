package com.gura.spring05.shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring05.shop.dto.ShopDto;

@Repository
public class ShopDaoImpl implements ShopDao{
	@Autowired
	private SqlSession session;
	
	@Override
	public List<ShopDto> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void minusCount(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minusMoney(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void plusPoint(ShopDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPrice(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
