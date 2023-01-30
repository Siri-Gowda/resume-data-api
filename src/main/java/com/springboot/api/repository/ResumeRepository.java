package com.springboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.api.model.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Integer> {

	@Query(value = "select * from resume_details rd where rd.name=:name", nativeQuery = true)
	public Resume findByname(@Param("name") String name);

	@Query(value = "select * from resume_details rd where rd.batch=:batch", nativeQuery = true)
	public Resume updateBystudy(@Param("batch") Integer batch);

	@Query(value = "delete from resume_details rd where rd.skills=:skills", nativeQuery = true)
	public Resume deleteBySkills(@Param("skills") String skills);

}
