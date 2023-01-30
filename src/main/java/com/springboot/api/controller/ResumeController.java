package com.springboot.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.model.Resume;
import com.springboot.api.repository.ResumeRepository;
import com.springboot.api.service.ResumeServiceInterface;

@RestController
@RequestMapping("/resume/api")
public class ResumeController {
	// using log4j to print the logs in console
	private static final Logger logger = LoggerFactory.getLogger(ResumeController.class);

	@Autowired
	private ResumeServiceInterface resumeServiceInterface;

	/*
	 * post method: to create the new data
	 * 
	 * @PostMapping
	 */

	@PostMapping("/resume-details")
	public void createResumeDetails(@RequestBody Resume resume) {
		logger.info("Resume Details in controller ::" + resume);
		resumeServiceInterface.createResumeDetails(resume);

	}

	/*
	 * get method: to get (or) retrieve the data
	 * 
	 * @GetMapping
	 * 
	 * @Param String name
	 */

	@GetMapping("/get-resume-details")
	public Resume getResumeDetails(@RequestParam String name) {
		Resume resumeDetails = resumeServiceInterface.getResumeDetails(name);
		return resumeDetails;

	}

	/*
	 * put method: used to update the existing data
	 * 
	 * @PutMapping
	 * 
	 * @Param batch
	 */
	@PutMapping("/update-resume-details")
	public Resume updateResumeDetails(@RequestParam int batch) {
		Resume resumeDetails = resumeServiceInterface.updateResumeDetails(batch);
		return resumeDetails;
	}

	/*
	 * Delete Method: used to delete the data
	 * 
	 * @DeleteMapping
	 * 
	 * @Param skills
	 */
	@DeleteMapping("/delete-resume-details")
	public Resume deleteResumeDetails(@RequestParam String skills) {
		Resume resumeDetails = resumeServiceInterface.deleteResumeDetailsBySkills(skills);
		return resumeDetails;
	}
	/*
	 * get method: to get (or) retrieve the data
	 * 
	 * @GetMapping
	 */

	@GetMapping("/resume")
	public List<Resume> getresumeDetails() {
		return resumeServiceInterface.findAll();

	}

}
