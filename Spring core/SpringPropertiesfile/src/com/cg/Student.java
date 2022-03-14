package com.cg;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String interestedcourse;
	private String hobby;
	@Value("${Student.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Value("${Student.interestedcourse}")
	public void setInterestedcourse(String interestedcourse) {
		this.interestedcourse = interestedcourse;
	}
	@Value("${Student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	void display() {
		System.out.println("The name of the Student " +name);
		System.out.println("The Course in which the student is interested " +interestedcourse);
		System.out.println("The hobby of the student " +hobby); 
	}

}
