package com.abhinav.Job_Portal_App.Job_Service;

import com.abhinav.Job_Portal_App.Job.Repository.Job_Repo;
import com.abhinav.Job_Portal_App.Job_Model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private Job_Repo repo ;

    public List<JobPost> view_all_jobs(){
        return repo.findAll();
    }

    public void add_job(JobPost post){
        repo.save(post);
    }
    public JobPost view_job(int id){
        return repo.findById(id).orElse(null);
    }

    public void delete_job(int id){
        repo.deleteById(id);
    }

    public void load(){
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(
                        101,
                        "Java Developer",
                        "Prior Internship experience preferred",
                        1,
                        Arrays.asList("Java", "Spring Boot", "Hibernate")
                ),

                new JobPost(
                        102,
                        "Frontend Developer",
                        "Strong knowledge of modern UI frameworks",
                        2,
                        Arrays.asList("JavaScript", "React", "HTML", "CSS")
                ),

                new JobPost(
                        103,
                        "Backend Developer",
                        "Experience in REST APIs and databases",
                        3,
                        Arrays.asList("Java", "Spring", "MySQL", "Docker")
                ),

                new JobPost(
                        104,
                        "Android Developer",
                        "Build and maintain Android applications",
                        2,
                        Arrays.asList("Kotlin", "Android SDK", "Jetpack")
                ),

                new JobPost(
                        105,
                        "DevOps Engineer",
                        "CI/CD pipeline and cloud deployment experience",
                        4,
                        Arrays.asList("AWS", "Docker", "Kubernetes", "Jenkins")
                )
        ));
        repo.saveAll(jobs);
    }

}
