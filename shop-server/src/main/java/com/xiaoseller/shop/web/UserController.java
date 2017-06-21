package com.xiaoseller.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaoseller.shop.provider.User;
import com.xiaoseller.utils.json.JsonVO;

@Controller
public class UserController {
	
	@RequestMapping("/user/getById")
	@ResponseBody
	public String getById(@RequestParam int id) {
		User data = new User();
		data.setId(id);
		data.setName("sunxiaodong");
		JsonVO jsonVO = new JsonVO(data);
		return jsonVO.toString();
	}
}
