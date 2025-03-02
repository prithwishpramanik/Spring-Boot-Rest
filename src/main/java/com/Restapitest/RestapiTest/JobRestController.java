package com.Restapitest.RestapiTest;

import com.Restapitest.RestapiTest.model.JobPost;
import com.Restapitest.RestapiTest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
