package com.gura.spring05.shop.dao;

import java.util.List;

import com.gura.spring05.shop.dto.PointShopDto;

public interface PointShopDao {
	public List<PointShopDto> getList();
	public void minusCount(int num);
	public void minusPoint(PointShopDto dto);
	public int getPrice(int num);
}
