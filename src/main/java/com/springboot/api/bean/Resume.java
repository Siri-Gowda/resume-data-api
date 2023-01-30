package com.springboot.api.bean;

import java.io.Serializable;

public class Resume implements Serializable {
	// attributes
	private int batch;

	private String name;
	private String study;
	private String skills;
	private double grade;
	private String course;

	public int getBatch() {
		return batch;
	}

	// setter and getter methods
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
