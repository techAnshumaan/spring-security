package web.srping.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelComeController {

    @GetMapping("/hello.htm")
    public String welcomeToOurApplication(){
        return "hello-world";
    }

    @GetMapping("/info.htm")
    public @ResponseBody String moreInfo(){
        return "Complete Security is a major issue, " +
                "many are facing this challenges but we are the best in this business," +
                "You can trust us  ";
    }

    @GetMapping("/checkout.htm")
    public @ResponseBody String checkout(){
        return "Hope u had a pleasant experience";
    }
}
