package com.exa;

public class Student {
	private int studentid;
	private String StudentName;
	private double GPA;
	public Student() {
		super();
	}
	public Student(int studentid, String studentName, double gPA) {
		super();
		this.studentid = studentid;
		StudentName = studentName;
		GPA = gPA;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", StudentName=" + StudentName + ", GPA=" + GPA + "]";
	}

}
