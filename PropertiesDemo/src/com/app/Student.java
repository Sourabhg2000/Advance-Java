package com.app;
import org.springframework.beans.factory.annotation.Value;
public class Student {
	
	@Value("Sammed")
	private String name;
	private String interestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	
	public Student() {}

	public void setName(String name) {
		this.name = name;
	}

	@Value("SDM")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student name = "+name);
		System.out.println("Interested Course = "+interestedCourse);
		System.out.println("Student Hobby = "+hobby);
	}
}
