package com.abhinav.Job_Portal_App;

import com.abhinav.Job_Portal_App.Job_Model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @GetMapping({"/" , "home"})
    public String home(){
        System.out.println("Visited home");
        return "home";
    }

    @GetMapping("/add")
    public String add_Job(){
        System.out.println("Visited add");
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost job){
        System.out.println("Visited handleForm");
        return "success" ;
    }

}
