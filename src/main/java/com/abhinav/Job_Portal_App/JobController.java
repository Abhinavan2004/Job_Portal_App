package com.abhinav.Job_Portal_App;

import com.abhinav.Job_Portal_App.Job_Model.JobPost;
import com.abhinav.Job_Portal_App.Job_Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @Autowired
    private JobService service ;

    @GetMapping({"/" , "home"})
    public String home(){
        System.out.println("Visited home");
        return "home";
    }

    @GetMapping("/addjob")
    public String add_Job(){
        System.out.println("Visited add");
        return "addajob";
    }

    
    @PostMapping("/handleForm")
    public String handleForm(JobPost post){
        service.add_job(post);
        System.out.println("Visited handleForm");
        return "success" ;
    }

}
