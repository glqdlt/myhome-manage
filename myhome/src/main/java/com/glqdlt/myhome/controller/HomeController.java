package com.glqdlt.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/")
@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String home(){
		return "index.html";
	}

}
