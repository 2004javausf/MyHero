package com.reavture.beans;

public class Student {

	private int student_id;
	private String name;
	private int sch_id;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int student_id, String name, int sch_id) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.sch_id = sch_id;
	}
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSch_id() {
		return sch_id;
	}
	public void setSch_id(int sch_id) {
		this.sch_id = sch_id;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", sch_id=" + sch_id + "]";
	}
	
	
}
