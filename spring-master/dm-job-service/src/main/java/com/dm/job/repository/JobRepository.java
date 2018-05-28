package com.dm.job.repository;

import org.springframework.data.repository.CrudRepository;
import com.dm.model.Job;

public interface JobRepository extends CrudRepository<Job, Integer> {

	

}
