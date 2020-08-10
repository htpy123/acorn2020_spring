package com.gura.spring04;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement(name="data")
public class Data {
	private int num;
	private String name;
	
	public int getNum() {
		return num;
	}
	@XmlElement
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	
}
