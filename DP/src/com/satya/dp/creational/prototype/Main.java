package com.satya.dp.creational.prototype;

public class Main {
	 public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student();
		student.setStudentId("1"); student.setStudentName("satya");
		System.out.println(student);
		Student  studntClone  = (Student) student.clone();
		System.out.println(studntClone);
		
	}
}
