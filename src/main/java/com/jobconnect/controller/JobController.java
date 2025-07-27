package com.jobconnect.controller;

import com.jobconnect.model.Job;
import com.jobconnect.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    // Show job form
    @GetMapping("/new")
    public String showJobForm(Model model) {
        model.addAttribute("job", new Job());
        return "jobform";
    }

    // Handle form submission
    @PostMapping("/save")
    public String postJob(@ModelAttribute("job") Job job) {
        jobRepository.save(job);
        return "redirect:/jobs"; // Shows the job list after posting
    }

    // Display all jobs in joblist.html
    @GetMapping
    public String defaultJobList(Model model) {
        model.addAttribute("jobs", jobRepository.findAll());
        return "joblist";
    }
}
