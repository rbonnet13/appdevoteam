package appdevoteam.communication;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

	@RequestMapping("/inscription")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "inscription";
	}
}