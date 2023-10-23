package com.infinite.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	public class Controller1 {
		@RequestMapping("ComplaintPage")
		public String getlogin(){
			return "ComplaintPage";
		}
		@RequestMapping("Home")
		public String getHome(){
			return "Home";
	}
		@RequestMapping("Display")
		public String getdisplay(){
			return "Display";
	}
		@RequestMapping("site")
		public String getsite(){
			return "site";
	}
}
	
}