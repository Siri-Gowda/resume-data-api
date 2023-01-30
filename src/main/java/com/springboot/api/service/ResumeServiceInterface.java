package com.springboot.api.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.springboot.api.model.Resume;

public interface ResumeServiceInterface {

	public void createResumeDetails(Resume resume);

	public Resume updateResumeDetails(Integer batch);

	public Resume deleteResumeDetailsBySkills(String skills);

	public Resume getResumeDetails(String name);

	public List<Resume> findAll();

}
