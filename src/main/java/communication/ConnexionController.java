package appdevoteam;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnexionController {

    @RequestMapping("/connexion.html")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
} 