package com.revature.compare;

public class Student implements Comparable<Student>{

	//1st method of comparing - Implement Comparable
	private int studentID;
	private String label;
	private double gpa;
	
	
	
	public Student() {
		super();
	}
	public Student(int studentID, String label, double gpa) {
		this.studentID = studentID;
		this.label = label;
		this.gpa = gpa;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", label=" + label + ", gpa=" + gpa + "]";
	}
	//Compare StudentID
	@Override
	public int compareTo(Student o) {
		return this.getStudentID() - o.getStudentID();
	}
	
	
}
