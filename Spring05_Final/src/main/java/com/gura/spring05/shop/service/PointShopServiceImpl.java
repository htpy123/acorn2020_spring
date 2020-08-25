package com.gura.spring05.shop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.shop.dao.PointShopDao;
import com.gura.spring05.shop.dto.PointShopDto;

@Service
public class PointShopServiceImpl implements PointShopService{

	@Autowired
	private PointShopDao dao;
	
	@Override
	public void getList(ModelAndView mView) {
		List<PointShopDto> list2 = dao.getList(); 
		mView.addObject("list2",list2);
	}

	@Override
	public void buy(HttpServletRequest request, ModelAndView mView) {
		
	}

}
