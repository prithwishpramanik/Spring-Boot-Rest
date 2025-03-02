package com.Restapitest.RestapiTest;

import com.Restapitest.RestapiTest.model.JobPost;
import com.Restapitest.RestapiTest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    public JobService service;

    @GetMapping("JobPost")
    public List<JobPost> getAlljobs(){
        return service.getAllJobs();
    }

    @GetMapping("JobPost/{postId}")
    public JobPost getjob(@PathVariable int postId){
        return service.getJob(postId);
    }

    @PostMapping("JobPost")
    public void addjobs(@RequestBody JobPost jobpost){
        service.addJob(jobpost);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId)
    {
        service.deleteJob(postId);
        return "Deleted";
    }
}
