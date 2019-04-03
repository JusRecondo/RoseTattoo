package com.example.RoseTattoo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping ("/rosetattoo")
	public String index () {
		return "index";
	}
	
}
