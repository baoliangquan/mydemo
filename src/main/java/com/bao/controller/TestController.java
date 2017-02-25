package com.bao.controller;

import com.bao.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/test")
	public String toIndex(HttpServletRequest request,Model model){
		System.out.println("");
		return "test/dataType";
	}
}
