package appdevoteam;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InscriptionController {
		
    @RequestMapping("/inscription")
    public String sayHello(){
        return ("Hello, Inscription page");
    }
 } 