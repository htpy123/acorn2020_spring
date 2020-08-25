package com.gura.spring05.shop.dto;

public class PointShopDto {
	private int num;
	private String name;
	private int price;
	private int remainCount;
	
	public PointShopDto() {}

	public PointShopDto(int num, String name, int price, int remainCount) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.remainCount = remainCount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRemainCount() {
		return remainCount;
	}

	public void setRemainCount(int remainCount) {
		this.remainCount = remainCount;
	}
	
	
}
