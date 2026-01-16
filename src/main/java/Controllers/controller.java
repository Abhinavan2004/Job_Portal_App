package Controllers;

import com.abhinav.Job_Portal_App.model.JobPost;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class controller {

    @GetMapping({"/" , "home"})
    public String home(){
        return "home";
    }

    @GetMapping("/add")
    public String add_Job(){
        return "addjob.jsp";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost job){
        return "success" ;
    }

}
