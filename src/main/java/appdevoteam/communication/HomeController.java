package appdevoteam;

import java.util.Map;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
			
	 @RequestMapping("/index")
	    public String sayHello(){
	        return ("Hello, SpringBoot on Wildfly");
	    }
	 @RequestMapping("/")
	    public String Hello(){
	        return ("Hello, SpringBoot on Wildfly");
	    }
}