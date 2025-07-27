package com.jobconnect.service;

import com.jobconnect.model.Job;
import com.jobconnect.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepo;

    public JobService(JobRepository jobRepo) {
        this.jobRepo = jobRepo;
    }

    public Job postJob(Job job) {
        return jobRepo.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public void deleteJob(Long id) {
        jobRepo.deleteById(id);
    }
}
