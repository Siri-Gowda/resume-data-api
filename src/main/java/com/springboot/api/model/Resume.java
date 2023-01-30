package com.springboot.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESUME_DETAILS")
public class Resume {
	// attributes
	@Column(name = "BATCH")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int batch;

	@Column(name = "NAME")
	private String name;

	@Column(name = "STUDY")
	private String study;

	@Column(name = "SKILLS")
	private String skills;

	@Column(name = "GRADE")
	private double grade;

	@Column(name = "COURSE")
	private String course;

	// setter and getter methods
	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	// toString() method
	@Override
	public String toString() {
		return "Resume [batch=" + batch + ", name=" + name + ", study=" + study + ", skills=" + skills + ", grade="
				+ grade + ", course=" + course + "]";
	}

}
