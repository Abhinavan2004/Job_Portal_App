package com.abhinav.Job_Portal_App.Job.Repository;

import com.abhinav.Job_Portal_App.Job_Model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class Job_Repo {

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

    public List<JobPost> all_jobs() {
        return jobs ;
    }

    public void add_a_job(JobPost post) {
        jobs.add(post);
        System.out.println("Added a job =>" + post);
    }
}
