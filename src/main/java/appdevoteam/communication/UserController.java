package appdevoteam.communication;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import appdevoteam.entity.User;
import appdevoteam.repository.UserRepository;



@Controller
public class UserController {
	@Autowired

	@RequestMapping("/inscription")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "inscription";
	}
}