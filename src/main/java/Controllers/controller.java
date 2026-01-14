package Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class controller {

    @RequestMapping({"/" , "home"})
    public String home(){
        return "home";
    }
}
