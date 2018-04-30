package appdevoteam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscriptionController {

    @RequestMapping("/inscription.html")
    public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
 } 