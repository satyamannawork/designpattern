package com.satya.dp.creational.builderpattern;

public class Student {
	private String studentId;
	private String studentName;
	public String getStudentId() {
		return studentId;
	}
	public Student setStudentId(String studentId) {
		this.studentId = studentId;
		return this;
	}
	public String getStudentName() {
		return studentName;
	}
	public Student setStudentName(String studentName) {
		this.studentName = studentName;
		return this;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}
