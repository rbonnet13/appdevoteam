package appdevoteam;
import java.util.Map;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
			
    @RequestMapping("/")
    public String welcome() {
		return "index";
	}
}