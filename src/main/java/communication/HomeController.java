package appdevoteam;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Value;
@Controller
public class HomeController {
	// inject via application.properties
		@Value("${welcome.message:test}")
		private String message = "Hello World";
		
    @RequestMapping("/index.html")
    public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
} 