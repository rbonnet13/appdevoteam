package appdevoteam.appdevoteam;

import java.util.Map;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
			
	 @RequestMapping("/")
	    public String Hello(){
	        return ("Hello, Home page");
	    }
}