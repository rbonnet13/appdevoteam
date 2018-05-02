package com.appdevoteam;

import java.util.Map;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
			
	 @RequestMapping("/index.html")
	    public String sayHello(){
	        return ("Hello, SpringBoot on Wildfly");
	    }
}