package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("showforjm")
	public String showForm()
	{
		return "showform";
	}
	
	@RequestMapping("pageinfo")
	public String pageInfo()
	{
		return "pageinfo";
	}

}
