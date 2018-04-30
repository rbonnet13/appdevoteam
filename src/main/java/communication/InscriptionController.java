package appdevoteam;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscriptionController {
	// inject via application.properties
		@Value("${welcome.message:test}")
		private String message = "Hello World";
		
    @RequestMapping("/inscription.html")
    public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
 } 