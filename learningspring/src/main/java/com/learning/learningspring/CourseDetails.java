package com.learning.learningspring;

public class CourseDetails {
	
	
	private int id;
	private String coursename;
	private String courseChannel;
	
	
	
	public CourseDetails(int id, String coursename, String courseChannel) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.courseChannel = courseChannel;
	}
	public int getId() {
		return id;
	}
	public String getCoursename() {
		return coursename;
	}
	public String getCourseChannel() {
		return courseChannel;
	}
	@Override
	public String toString() {
		return "CourseDetails [id=" + id + ", coursename=" + coursename + ", courseChannel=" + courseChannel + "]";
	}
	
	
	
	

}
