package com.glqdlt.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/")
@Controller
public class HomeController {

	@RequestMapping(value = "")
	public String home() {
		return "index";
	}

	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join_get() {
		return "join";
	}
	@RequestMapping(value = "angular", method = RequestMethod.GET)
	public String angular_get() {
		return "angular_test";
	}

}
