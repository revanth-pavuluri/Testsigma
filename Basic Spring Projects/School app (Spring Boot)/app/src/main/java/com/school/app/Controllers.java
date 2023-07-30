package com.school.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class Controllers {

@GetMapping("/")
public String hello(){
	return "hello";
}
}


