package com.xiaoseller.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaoseller.utils.json.JsonVO;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		JsonVO jsonVO = new JsonVO("张鹏");
		return jsonVO.toString();
	}
}
