package com.abhinav.Job_Portal_App;

import com.abhinav.Job_Portal_App.Job_Model.JobPost;
import com.abhinav.Job_Portal_App.Job_Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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

    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model model) {
        List<JobPost> jobs = service.view_all_jobs();
        model.addAttribute("jobs", jobs);
        return "viewalljobs";   // JSP name
    }


    @PostMapping("/handleForm")
    public String handleForm(JobPost post){
        service.add_job(post);
        System.out.println("Visited handleForm");
        return "success" ;
    }

    @GetMapping("/deletejob")
    public String deleteJob(@RequestParam int id) {
        service.delete_job(id);
        return "redirect:/viewalljobs";
    }

    @GetMapping("/updatejob")
    public String updateJob(@RequestParam int id, Model model) {
        JobPost job = service.view_job(id);
        model.addAttribute("jobPost", job);
        return "updatejob";
    }

    @PostMapping("/updatejob")
    public String handleUpdate(JobPost post) {
        service.add_job(post); // save = update
        return "redirect:/viewalljobs";
    }

    @GetMapping("/load")
    public String loading(){
        service.load();
        System.out.println("Loaded");
        return "redirect:/viewalljobs";
    }
}


