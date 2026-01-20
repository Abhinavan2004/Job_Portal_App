package com.abhinav.Job_Portal_App.Job_Service;

import com.abhinav.Job_Portal_App.Job.Repository.Job_Repo;
import com.abhinav.Job_Portal_App.Job_Model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
