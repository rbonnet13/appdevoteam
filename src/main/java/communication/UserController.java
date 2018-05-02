package appdevoteam.communication;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

	@RequestMapping("/")
	public String newUser() {
		return "inscription";
	}
}