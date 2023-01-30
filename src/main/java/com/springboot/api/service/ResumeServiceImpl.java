package com.springboot.api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.model.Resume;
import com.springboot.api.repository.ResumeRepository;

@Service
public class ResumeServiceImpl implements ResumeServiceInterface {
	// using log4j to print the logs in console

	private static final Logger logger = LoggerFactory.getLogger(ResumeServiceImpl.class);
	@Autowired
	private ResumeRepository resumeRepository;

	@Override
	public void createResumeDetails(Resume resume) {
		logger.info("Resume Details in Service layer ::" + resume);
		resumeRepository.save(resume);
	}

	@Override
	public Resume updateResumeDetails(Integer batch) {
		Resume resume = resumeRepository.updateBystudy(batch);
		return resume;
	}

	@Override
	public Resume deleteResumeDetailsBySkills(String skills) {
		Resume resume = resumeRepository.deleteBySkills(skills);
		return resume;
	}

	@Override
	public Resume getResumeDetails(String name) {
		Resume resume = resumeRepository.findByname(name);
		return resume;
	}

	@Override
	public List<Resume> findAll() {
		return resumeRepository.findAll();
	}

}
