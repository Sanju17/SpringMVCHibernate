package com.csangharsha.springmvchibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

	@RequestMapping(value = "/")
	@ResponseBody
	public String index() {
		return "<h1>Hello From the Spring World</h1>";
	}

}
