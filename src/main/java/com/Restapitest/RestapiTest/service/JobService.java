package com.Restapitest.RestapiTest.service;



import com.Restapitest.RestapiTest.model.JobPost;
import com.Restapitest.RestapiTest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {


    @Autowired
    public JobRepo repo;


    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);

    }


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();


    }


    public JobPost getJob(int postId) {
        return repo.getpostID(postId);
    }
}