package com.dm.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.dm.model.Job;
import com.dm.model.Tarefa;

@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackageClasses = {Job.class, Tarefa.class})
public class DmJobServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmJobServiceApplication.class, args);
	}
}
