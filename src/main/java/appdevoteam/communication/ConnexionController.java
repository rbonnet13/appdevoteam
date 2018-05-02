package appdevoteam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnexionController {

    @RequestMapping("/connexion")
    public String sayHello(){
        return ("Hello, Connexion page");
    }
} 