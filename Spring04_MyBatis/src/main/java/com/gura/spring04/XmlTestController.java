package com.gura.spring04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlTestController {
	@RequestMapping("/xml01")
	public String xml01() {
		
		return "xml01";
	}
	
	@RequestMapping("/xml02")
	@ResponseBody
	public Data xml02() {
		//xml 과 관련된 annotation으로 설계된 클래스로 객체를 생성하고
		Data d = new Data();
		//데이터를 담고
		d.setNum(1);
		d.setName("김구라");
		//리턴해주면 xml 문서가 응답된다.
		return d;
	}
}
