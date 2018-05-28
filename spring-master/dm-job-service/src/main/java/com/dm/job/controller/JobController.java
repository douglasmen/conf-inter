package com.dm.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dm.job.repository.JobRepository;
import com.dm.model.Job;

@RestController
@RequestMapping(value = "/jobs", produces = MediaType.APPLICATION_JSON_VALUE)
public class JobController {

	@Autowired
	private JobRepository jobRepository;
	
    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public ResponseEntity<Job> findById(@RequestParam Job job){
    	jobRepository.save(job);
        return ResponseEntity.ok(job);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Job>> listaTodos(){
    	Iterable<Job> findAll = jobRepository.findAll();
        return ResponseEntity.ok(findAll);
    }

}
