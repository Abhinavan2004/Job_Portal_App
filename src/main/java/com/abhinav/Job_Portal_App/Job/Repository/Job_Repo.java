package com.abhinav.Job_Portal_App.Job.Repository;

import com.abhinav.Job_Portal_App.Job_Model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface Job_Repo extends JpaRepository<JobPost, Integer> {
}
